package test;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTest extends BaseTests {
    @Test
    public void testSlideToNumber(){
        String value = "4";
        var sliderPage=homePage.clickHorizontalSlider();
        sliderPage.setSliderValue(value);
        assertEquals(sliderPage.getSliderValue(),value,"Slider value is incorrect");
    }
}