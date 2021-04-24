package Page;

import Controller.DeleteController;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeletePage extends DeleteController {
    public DeletePage(WebDriver driver) {
        super(driver);
    }

    By btnDelete = By.xpath("//body/div[5]/div[1]/main[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/form[1]/button[1]");
    By validation = By.xpath("//body/div[@id='js-flash-container']/div[1]");

    public DeletePage click_button_delete() {
        click(btnDelete);
        return this;
    }

    public DeletePage validationMessage(String message) {
        String validMsg = getTextValidation(validation);
        if (validMsg.contains(message)) {
            System.out.println("Message Match");
        } else {
            System.out.println("Tidak Match");
        }
        return this;
    }
}
