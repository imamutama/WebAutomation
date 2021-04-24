package Test;

import Page.ListPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ListGist extends BaseTest{
    @Test(dependsOnMethods = "List All Gist")
    public void listGist(){
        ListPage listPage = new ListPage(driver);
        listPage.click_button_alllist();
        listPage.validationNotNull();

    }
}
