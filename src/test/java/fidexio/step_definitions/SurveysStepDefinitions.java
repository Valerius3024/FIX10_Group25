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

}
