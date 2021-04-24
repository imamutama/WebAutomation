package Controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListController {
    public WebDriver driver;
    public WebDriverWait wait;

    public ListController(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,10);
    }
    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }
    public void click (By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }
    public String getTextValidation (By elementBy){
        waitVisibility(elementBy);
        driver.findElement(elementBy).getText();
        return getTextValidation(elementBy);
    }
}
