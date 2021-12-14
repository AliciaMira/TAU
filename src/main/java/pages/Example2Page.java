package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example2Page {
    private WebDriver driver;
    private By startButton= By.xpath("//*[@id=\"start\"]/button");
    private By loadingIndicator=By.id("loading");
    private By loadedText=By.id("finish");

    public Example2Page(WebDriver driver){
        this.driver=driver;
    }

    public void clickStart(){
        driver.findElement(startButton).click();
        WebDriverWait wait=new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(loadedText));
    }

    public boolean isStartButtonDisplayed(){
        return driver.findElement(startButton).isDisplayed();
    }

    public String getLoadedText(){
        return driver.findElement(loadedText).getText();
    }
}
