package Page;

import Controller.LoginController;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage extends LoginController {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By btnSignIn = By.xpath("//a[contains(text(),'Sign in')]");
    By userName = By.xpath("//input[@id='login_field']");
    By passwordText = By.xpath("//input[@id='password']");
    By btnLogin = By.xpath("//body/div[4]/main[1]/div[1]/div[4]/form[1]/div[1]/input[12]");
    By validationtext = By.xpath("//strong[contains(text(),'GitHub')]");

    public LoginPage goToWeb(String baseURL) {
        driver.get(baseURL);
        return this;
    }

    public LoginPage click_btn_sign() {
        click(btnSignIn);
        return this;
    }

    public LoginPage validationText(String textValidation) {
        String textVld = getTextValidation(validationtext);
        if (textVld.contains(textValidation)) {
            System.out.println("Matching Text");
        }
        return this;
    }

    public LoginPage input_username(String username) {
        writeText(userName, username);
        return this;
    }

    public LoginPage input_password(String password) {
        writeText(passwordText, password);
        return this;
    }

    public LoginPage click_btn_login() {
        click(btnLogin);
        return this;
    }
}