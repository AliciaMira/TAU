package test;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPag;
import pages.ForgotPassPage;

import static org.testng.Assert.assertEquals;

public class ForgotPassTest extends BaseTests{
    @Test

    public void testRetrievePassword(){
        ForgotPassPage forgotPassPage= homePage.clickForgotPassword();
        forgotPassPage.enterEmail("alicia@hotmail.com");
        EmailSentPag emailSentPag=forgotPassPage.clickRetrievePassword();
        String mensaje=emailSentPag.getMessage();
        assertEquals(mensaje,"Internal Server Error","Message is incorrect");

    }
}
