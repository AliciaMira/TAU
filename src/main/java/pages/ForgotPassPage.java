package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassPage {


    private WebDriver driver;

    private By email=new By.ById("email");
    private By retrievePassButton = new By.ByXPath("//*[@id=\"form_submit\"]/i");

    public ForgotPassPage(WebDriver driver){
        this.driver=driver;
    }

    public void enterEmail(String txtEmail){
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys(txtEmail);
    }

    public EmailSentPag clickRetrievePassword(){
        driver.findElement(retrievePassButton).click();
        return new EmailSentPag(driver);
    }

}
