package Test;

import Page.LoginPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test(dependsOnMethods = "Login Gist")
    @Parameters({"username","password"})
    public void loginTest(String username, String password){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goToWeb("htpp://gist.github.com");
        loginPage.click_btn_sign();
        loginPage.validationText("");
        loginPage.input_username(username);
        loginPage.input_password(password);
        loginPage.click_btn_login();

    }
}
