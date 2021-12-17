package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {
    private WebDriver driver;
    public DynamicLoadingPage(WebDriver driver){
        this.driver=driver;
    }

    private String linkXpath_Format=".//a[contrains(text(),'%s')";

    //private By linkExample1 = By.linkText("Example 1: Element on page that is hidden");
    private By linkExample1=By.xpath("//*[@id=\"content\"]/div/a[1]");
    private By linkExample2=By.xpath("//*[@id=\"content\"]/div/a[2]");

    public Example1Page clickExample1(){
        driver.findElement(linkExample1).click();
        return new Example1Page(driver);
    }

    public Example2Page clickExample2(){
        driver.findElement(linkExample2).click();
        return new Example2Page(driver);
    }

    public Example2Page rightClickOnExample2(){
        driver.findElement(linkExample2).sendKeys(Keys.CONTROL, Keys.RETURN);
        return new Example2Page(driver);
    }
}
