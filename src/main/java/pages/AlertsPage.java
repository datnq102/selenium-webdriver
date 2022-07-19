package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;


public class AlertsPage {
    private WebDriver driver;
    private By triggerAlertButton = By.cssSelector("[onclick= 'jsAlert()']");
    private By results = By.id("result");
    private By triggerConfirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    private By triggerPromptButton = By.xpath("//button[text()='Click for JS Prompt']");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlert() {
        driver.findElement(triggerAlertButton).click();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public String getResult() {
        return driver.findElement(results).getText().trim();
    }

    public void triggerConfirm() {
        driver.findElement(triggerConfirmButton).click();
    }

    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }

    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    public void triggerPrompt() {
        driver.findElement(triggerPromptButton).click();
    }

    public void setInput(String text) {
        driver.switchTo().alert().sendKeys(text);
    }
}
