package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    private By usernameField=By.id("username");
    private By passwordField=By.id("password");
    private By loginButton=By.xpath("//*[@id=\"login\"]/button");

    public void setUserName(String userName){
        driver.findElement(usernameField).clear();
        driver.findElement(usernameField).sendKeys(userName);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
    }

    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}
