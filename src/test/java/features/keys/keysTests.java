package features.keys;

import base.BaseTests;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class keysTests extends BaseTests {

    @Test
    void testBackspace() {
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterText(String.valueOf(Keys.ENTER));
        assertEquals("You entered: ENTER", keyPage.getResult());
    }

    @Test
    void testPi() {
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterPi();
        assertEquals("You entered: 4", keyPage.getResult());
        waitABit();
    }
}
