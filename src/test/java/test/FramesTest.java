package test;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTest extends BaseTests {
    @Test
    public void testClickFrames(){
        var framesPage=homePage.clickFrames();
        var nestedFramesPage =framesPage.clickNestedFrames();

        assertEquals(nestedFramesPage.getLeftFrameText(),"LEFT","Text incorrect");
        assertEquals(nestedFramesPage.getBottomFrameText(),"BOTTOM","Text incorrect");
    }
}
