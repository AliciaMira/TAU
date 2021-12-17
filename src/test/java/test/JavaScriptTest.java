package test;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavaScriptTest extends BaseTests {
    @Test
    public void testScrollToTable(){
        homePage.clickLargeandDeepDom().scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScrollPage().scrollToParagraph(5);
    }
}
