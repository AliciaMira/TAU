package test;

import base.BaseTests;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTest extends BaseTests {

    @Test
    public void testSelectOption(){
        var dropDownPage=homePage.clickDropDown();

        String option="Option 1";
        dropDownPage.selectFromDropDown(option);
        var selectedOptions=dropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1 ,"Incorrect number of selections");
        assertTrue(selectedOptions.contains(option),"Option not selected");
    }

    @Test
    public void testAddMultipleAttributeToDropdown(){
        var dropdowmPage=homePage.clickDropDown();
        dropdowmPage.addMultipleAttribute();

        var optionsToSelect= List.of("Option 1", "Option 2");
        optionsToSelect.forEach(dropdowmPage::selectFromDropDown);

        var selectedOptions=dropdowmPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),optionsToSelect.size(),"Number of selected items");
    }
}
