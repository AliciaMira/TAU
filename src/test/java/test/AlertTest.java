package test;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTest extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertsPage=homePage.clickAlertsPage();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        alertsPage.getResults();
        assertEquals(alertsPage.getResults(), "You successfully clicked an alert","Result text as incorrect");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertsPage=homePage.clickAlertsPage();
        alertsPage.triggerConfirm();
        String text=alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text,"I am a JS Confirm","Alert text incorrect");
    }

    @Test
    public void textSetTextToAlert(){
        var alertsPage=homePage.clickAlertsPage();
        alertsPage.triggerPrompt();
        String text="TAU rocks!";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResults(), "You entered: " + text, "Results");
    }

}
