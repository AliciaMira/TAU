package test;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class WindowsTest extends BaseTests {
    @Test
    public void testWindowTab(){
        var buttonPage=homePage.clickDynamicLoadingPage().rightClickOnExample2();
        getWindowManager().switchToNewTab();
        assertTrue(buttonPage.isStartButtonDisplayed(),"Start button is not displayed");
    }
}
