package features.waits;

import base.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    void testWaitUntilElementDisappears() {
        var loadingPage = homePage.clickDynamicLoading().clickExample1();
        loadingPage.clickStart();
        assertEquals("Hello World!", loadingPage.getLoadedText(), "Loaded text incorrect");
    }

    @Test
    void testImplicitWait() {
        var loadingPage = homePage.clickDynamicLoading().clickExample2();
        loadingPage.clickStart();
        assertEquals("Hello World!", loadingPage.getLoadedText(), "Loaded text incorrect");
    }
}
