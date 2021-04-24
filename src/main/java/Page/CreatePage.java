package Page;

import Controller.CreateController;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CreatePage extends CreateController {

    public CreatePage(WebDriver driver) {
        super(driver);
    }

    By createGist = By.xpath("//body/div[2]/div[1]/div[5]/a[1]/*[2]");
    By gitsDescription = By.xpath("//body/div[5]/div[1]/main[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]");
    By gitFile = By.xpath("//body/div[5]/div[1]/main[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[2]");
    By gitsText = By.xpath("//body/div[5]/div[1]/main[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]");
    By btnCreate = By.xpath("//button[contains(text(),'Create secret gist')]");
    By validation = By.xpath("//td[@id='file-automation-test-LC1']");

    public CreatePage click_button_plus() {
        click(createGist);
        return this;
    }

    public CreatePage input_description_gist(String textDescription) {
        writeText(gitsDescription, "textDescription");
        return this;
    }

    public CreatePage input_filename_gist(String textFileName) {
        writeText(gitFile, textFileName);
        return this;
    }

    public CreatePage input_summary_gist(String textSummary) {
        writeText(gitsText, textSummary);
        return this;
    }

    public CreatePage click_button_creategist() {
        click(btnCreate);
        return this;
    }

    public CreatePage validation_file(String validFile) {
        String assertFile = getTextValidation(validation);
        Assert.assertEquals(assertFile, validFile);
        return this;
    }
}

