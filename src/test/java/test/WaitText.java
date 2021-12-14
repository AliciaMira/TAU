package test;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.assertEquals;

public class WaitText extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
        var example1Page= homePage.clickDynamicLoadingPage().clickExample1();
        example1Page.clickStart() ;
        assertEquals(example1Page.getLoadedText(),"Hello World!","Loaded text incorrect");
    }

    @Test
    public void testWaitUntilVisible(){
        var example2Page= homePage.clickDynamicLoadingPage().clickExample2();
        example2Page.clickStart();
        assertEquals(example2Page.getLoadedText(),"Hello World!","Loaded text incorrect");
    }
}
