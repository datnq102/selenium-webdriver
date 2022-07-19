package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class DynamicLoadingExample1Page {
    private WebDriver driver;
    private By startButton = By.cssSelector("div#start button");
    private By loadingIndicator = By.id("loading");
    private By loadedText = By.id("finish");
    public DynamicLoadingExample1Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStart() {
        driver.findElement(startButton).click();
        // wait for loading indicator to disappear
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));

        // FluentWait
        FluentWait fluentWait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(NoSuchElementException.class);
        fluentWait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
    }

    public String getLoadedText() {
        return driver.findElement(loadedText).getText().trim();
    }
}
