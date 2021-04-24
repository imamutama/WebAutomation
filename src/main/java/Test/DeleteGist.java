package Test;

import Page.DeletePage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DeleteGist extends BaseTest {
    @Test(dependsOnMethods = "Delete Gist")
    @Parameters({"messageValidation"})
    public void deleteGist(String message){
        DeletePage deletePage = new DeletePage(driver);
        deletePage.click_button_delete();
        deletePage.validationMessage(message);
    }
}
