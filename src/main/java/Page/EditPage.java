package Page;

import Controller.EditController;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class EditPage extends EditController {

    public EditPage(WebDriver driver) {
        super(driver);
    }

    By btnEdit = By.xpath("//body/div[5]/div[1]/main[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]");
    By editText = By.xpath("//body/div[5]/div[1]/main[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]");
    By btnEditText = By.xpath("//button[contains(text(),'Update secret gist')]");
    By validation = By.xpath("//td[@id='file-automation-test-LC1']");

    public void click_button_edit() {
        click(btnEdit);
    }

    public void edit_text_gist(String stringText) {
        writeText(editText, stringText);
    }

    public void click_button_update_gist() {
        click(btnEditText);
    }

    public void validation_edit(String stringValidation) {
        getTextValidation(validation);
        Assert.assertEquals(validation, stringValidation);
    }
}
