package features.login;

import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.SecureAreaPage;
import base.BaseTests;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"));
    }

}
