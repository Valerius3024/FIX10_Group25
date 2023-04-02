package fidexio.step_definitions;

import com.github.javafaker.Faker;
import fidexio.pages.HomePage;
import fidexio.pages.SurveysPage;
import fidexio.utilities.BrowserUtils;
import fidexio.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SurveysStepDefinitions {

    HomePage homePage = new HomePage();
    SurveysPage surveysPage = new SurveysPage();
    String surveyRandomTitle = new Faker().bothify("####????????###???#?#?");

    @When("user clicks design survey button")
    public void user_clicks_design_survey_button() {
        BrowserUtils.waitForVisibility(surveysPage.designSurveyButton, 10);
        surveysPage.designSurveyButton.click();
    }

    @Then("user can click start survey button")
    public void user_can_click_start_survey_button() {
        BrowserUtils.waitForVisibility(surveysPage.startSurveyButton, 10);
        surveysPage.startSurveyButton.click();
        Assert.assertEquals("Not ready", surveysPage.surveyNotReadyWarning.getText());
    }

    @Then("user can click back to survey button")
    public void user_can_click_back_to_survey_button() {
        BrowserUtils.waitForVisibility(surveysPage.backToSurveyButton, 10);
        surveysPage.backToSurveyButton.click();
        BrowserUtils.waitForVisibility(homePage.surveysButton, 10);
        Assert.assertTrue(homePage.surveysButton.isDisplayed());
    }

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
        surveysPage.surveyTitleBox.sendKeys(surveyRandomTitle);
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

    @Given("user clicks survey options button")
    public void user_clicks_survey_options_button() {
        BrowserUtils.waitForVisibility(surveysPage.surveyOptionsTabButton, 10);
        surveysPage.surveyOptionsTabButton.click();
    }

    @Then("user can choose user can come back in the previous page checkbox")
    public void user_can_choose_user_can_come_back_in_the_previous_page_checkbox() {
        BrowserUtils.waitForVisibility(surveysPage.surveyUserCanComeBackInThePreviousPageCheckbox, 10);
        surveysPage.surveyUserCanComeBackInThePreviousPageCheckbox.click();
        Assert.assertTrue(surveysPage.surveyUserCanComeBackInThePreviousPageCheckbox.isSelected());
    }

    @Then("user can choose login required checkbox")
    public void user_can_choose_login_required_checkbox() {
        BrowserUtils.waitForVisibility(surveysPage.surveyLoginRequiredCheckbox, 10);
        surveysPage.surveyLoginRequiredCheckbox.click();
        Assert.assertTrue(surveysPage.surveyLoginRequiredCheckbox.isSelected());
    }

    @Then("user can see survey created message")
    public void user_can_see_survey_created_message() {
        BrowserUtils.waitForVisibility(surveysPage.surveyCreatedMessage, 10);
        Assert.assertEquals("Survey created", surveysPage.surveyCreatedMessage.getText());
    }

    @Then("user can see recently created survey on the survey list module")
    public void user_can_see_recently_created_survey_on_the_survey_list_module() {
        WebElement surveyActualTitle = Driver.getDriver().findElement(By.xpath("//h4[.='" + surveyRandomTitle + "']"));
        Assert.assertEquals(surveyActualTitle.getText(), surveyRandomTitle);
    }

    @Then("user deletes recently created survey")
    public void user_deletes_recently_created_survey() {
        BrowserUtils.waitForVisibility(homePage.surveysButton,10);
        homePage.surveysButton.click();
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click()", surveysPage.surveyArchiveButton);
    }



}
