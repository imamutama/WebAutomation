package Page;

import Controller.LogoutController;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage extends LogoutController {

    public LogoutPage(WebDriver driver) {
        super(driver);
    }

    By iconLogout = By.xpath("//body/div[2]/div[1]/div[6]/details[1]/summary[1]");
    By btnSignOut = By.xpath("//button[contains(text(),'Sign out')]");
    By btnSignOut2 = By.xpath("//body/div[5]/main[1]/div[1]/form[1]/input[2]");

    public void click_button_iconlogout() {
        click(iconLogout);
    }

    public void click_button_signout1() {
        click(btnSignOut);
    }

    public void click_button_signout2() {
        click(btnSignOut2);
    }

}
