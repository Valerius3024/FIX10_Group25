package fidexio.step_definitions;

import fidexio.pages.HomePage;
import fidexio.pages.SurveysPage;
import fidexio.utilities.BrowserUtils;
import fidexio.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SurveysStepDefinitions {

    HomePage homePage = new HomePage();
    SurveysPage surveysPage = new SurveysPage();

    @Then("user clicks Surveys button")
    public void user_clicks_surveys_button() {
        if (homePage.moreDropdown.isDisplayed()) {
            BrowserUtils.waitForClickablility(homePage.moreDropdown, 5);
            homePage.moreDropdown.click();
            BrowserUtils.waitForClickablility(homePage.surveysButton, 5);
            homePage.surveysButton.click();
        } else {
            BrowserUtils.waitForClickablility(homePage.surveysButton, 5);
            homePage.surveysButton.click();
        }
    }
    @Given("user is on the Surveys page")
    public void user_is_on_the_surveys_page() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        wait.until(ExpectedConditions.titleIs("Surveys - Odoo"));
        BrowserUtils.verifyTitle("Surveys - Odoo");
    }
    @Given("user clicks create survey button")
    public void user_clicks_create_survey_button() {
        surveysPage.createSurveyButton.click();
    }
    @Given("user doesn't enter title")
    public void user_doesn_t_enter_title() {
        Assert.assertEquals("", surveysPage.surveyTitleBox.getText());
    }
    @Given("user clicks survey save button")
    public void user_clicks_survey_save_button() {
        surveysPage.saveSurveyButton.click();
    }
    @Then("user can't create a survey")
    public void user_can_t_create_a_survey() {
        WebElement surveyTitleBoxEmptyFieldError = Driver.getDriver().findElement(By.xpath("//div[@class='o_notification_title']"));
        Assert.assertTrue(surveyTitleBoxEmptyFieldError.isDisplayed());
    }
    @Given("user enters survey title")
    public void user_enters_survey_title() {
        surveysPage.surveyTitleBox.sendKeys("test");
    }
    @Then("survey save button turns into survey edit button")
    public void survey_save_button_turns_into_edit_button() {
        BrowserUtils.waitForVisibility(surveysPage.editSurveyButton, 10);
        Assert.assertTrue(surveysPage.editSurveyButton.isDisplayed());
    }
    @Then("survey discard button turns into survey create button")
    public void survey_discard_button_turns_into_survey_create_button() {
        BrowserUtils.waitForVisibility(surveysPage.createSurveyButton, 10);
        Assert.assertTrue(surveysPage.createSurveyButton.isDisplayed());
    }
    @Then("user can see survey attachments button")
    public void user_can_see_survey_attachments_button() {
        BrowserUtils.waitForVisibility(surveysPage.surveyAttachmentButton, 10);
        Assert.assertTrue(surveysPage.surveyAttachmentButton.isDisplayed());
    }
    @Then("user can see survey action button")
    public void user_can_see_survey_action_button() {
        BrowserUtils.waitForVisibility(surveysPage.surveyActionButton, 10);
        Assert.assertTrue(surveysPage.surveyActionButton.isDisplayed());
    }
    @Then("user can see test survey button")
    public void user_can_see_test_survey_button() {
        BrowserUtils.waitForVisibility(surveysPage.testSurveyButton, 10);
        Assert.assertTrue(surveysPage.testSurveyButton.isDisplayed());
    }
    @Then("user can see print survey button")
    public void user_can_see_print_survey_button() {
        BrowserUtils.waitForVisibility(surveysPage.printSurveyButton, 10);
        Assert.assertTrue(surveysPage.printSurveyButton.isDisplayed());
    }
    @Then("user can see survey share and invite by email button")
    public void user_can_see_survey_share_and_invite_by_email_button() {
        BrowserUtils.waitForVisibility(surveysPage.surveyShareAndInviteByEmailButton, 10);
        Assert.assertTrue(surveysPage.surveyShareAndInviteByEmailButton.isDisplayed());
    }
    @Then("user can see survey view result button")
    public void user_can_see_survey_view_result_button() {
        BrowserUtils.waitForVisibility(surveysPage.surveyViewResultButton, 10);
        Assert.assertTrue(surveysPage.surveyViewResultButton.isDisplayed());
    }
    @Then("user can't see add an item button")
    public void user_can_t_see_add_an_item_button() {
        BrowserUtils.waitForVisibility(surveysPage.surveyAddAnItemButtonIsNotThere, 10);
        Assert.assertTrue(surveysPage.surveyAddAnItemButtonIsNotThere.isDisplayed());
    }


}
