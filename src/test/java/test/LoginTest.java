package test;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTest extends BaseTests {

    @Test
    public void testSuccesfullLogin(){
        LoginPage loginPage= homePage.clickFormAuthentication();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage= loginPage.clickLoginButton();
        secureAreaPage.getAlertText();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),"Alert text is incorrect");

    }
}
