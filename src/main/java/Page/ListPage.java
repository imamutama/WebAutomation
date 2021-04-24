package Page;

import Controller.ListController;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ListPage extends ListController {

    public ListPage(WebDriver driver) {
        super(driver);
    }

    By allList = By.linkText("All gists");
    By validation = By.xpath("//body/div[5]/div[1]/main[1]/div[2]");

    public void click_button_alllist() {
        click(allList);
    }

    public void validationNotNull() {
        String validationTrue = getTextValidation(validation);
        Assert.assertTrue(validationTrue != null);
    }
}
