package Test;

import Page.CreatePage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CreateGist extends BaseTest {

    @Test(dependsOnMethods = "Create Gist")
    @Parameters({"filename", "description", "summary"})
    public void createGist(String filename, String description, String summary) {
        CreatePage createPage = new CreatePage(driver);
        createPage.click_button_plus();
        createPage.input_description_gist(description);
        createPage.input_filename_gist(filename);
        createPage.input_summary_gist(summary);
        createPage.click_button_creategist();
        createPage.validation_file(filename);

    }
}
