package test;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadPage= homePage.clickFileUploadPage();
        uploadPage.uploadFile("E:\\Curso QA\\Testing Automatizado\\EjerciciosTAU\\resources\\chromedriver.exe");
        assertEquals(uploadPage.getUploadedFiles(),"chromedriver.exe", "Uploaded");
    }
}

