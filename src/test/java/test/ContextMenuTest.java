package test;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTests {
    @Test

    public void testRightClick(){
        var contextMenuPage=homePage.clickContextMenuPage();
        contextMenuPage.rightClickInBox();
        String texto="You selected a context menu";
        assertEquals(contextMenuPage.getPopUpText(),texto,"PopUp message incorrect");
        contextMenuPage.acceptPopUp();
    }
}
