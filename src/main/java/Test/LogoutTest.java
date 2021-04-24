package Test;

import Page.LogoutPage;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest{
    @Test(dependsOnMethods = "Logout Test")
    public void logoutTest(){
        LogoutPage logoutPage = new LogoutPage(driver);
        logoutPage.click_button_iconlogout();
        logoutPage.click_button_signout1();
        logoutPage.click_button_signout2();
    }
}
