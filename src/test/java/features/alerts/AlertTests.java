package features.alerts;

import base.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    void testAcceptAlert() {
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.acceptAlert();
        assertEquals("You successfully clicked an alert", alertsPage.getResult());
    }

    @Test
    void testGetTextFromAlert() {
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String actualAlertText = alertsPage.getAlertText();
        assertEquals("I am a JS Confirm", actualAlertText);
        alertsPage.dismissAlert();
    }

    @Test
    void testSetInputInAlert() {
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        String text = "Alerts";
        alertsPage.setInput(text);
        alertsPage.acceptAlert();
        assertEquals("You entered: " + text, alertsPage.getResult());
        waitABit();
    }
}
