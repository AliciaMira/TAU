package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPag {
    private WebDriver driver;

    public EmailSentPag(WebDriver driver){
        this.driver=driver;
    }

    private By statusAlert=new By.ByXPath("/html/body/h1");

    public String getMessage(){
        return driver.findElement(statusAlert).getText();
    }

}
