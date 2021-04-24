package Test;

import Page.EditPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EditGist extends BaseTest {

    @Test(dependsOnMethods = "Edit Gist")
    @Parameters({"textEdit"})
    public void editGist(String stringText) {
        EditPage editPage = new EditPage(driver);
        editPage.click_button_edit();
        editPage.edit_text_gist(stringText);
        editPage.click_button_update_gist();
        editPage.validation_edit(stringText);
    }
}
