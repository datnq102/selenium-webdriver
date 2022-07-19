package features.navigation;

import base.BaseTests;
import org.junit.jupiter.api.Test;

public class NavigationTests extends BaseTests {
    @Test
    void testNavigator() {
        homePage.clickDynamicLoading();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://www.google.com/");
        waitABit();
    }
}
