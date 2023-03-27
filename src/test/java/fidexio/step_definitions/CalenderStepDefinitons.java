package fidexio.step_definitions;

import fidexio.pages.CalenderPage;
import fidexio.pages.HomePage;
import fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CalenderStepDefinitons {
    HomePage homePage = new HomePage();

    CalenderPage calenderPage = new CalenderPage();

    @When("User clicks calender button")
    public void userClicksCalenderButton() {
        homePage.calenderButton.click();
    }

    @Then("The title should contain week under the calender button")
    public void theWeekNumberShouldBeDisplayedUnderTheCalenderButton() {
        Assert.assertTrue(calenderPage.weekText.getText().contains("Week"));
    }

    @When("User clicks day button")
    public void userClicksDayButton() {
        calenderPage.dayButton.click();
    }

    @Then("the day number should be displayed under the calender button")
    public void theDayNumberShouldBeDisplayedUnderTheCalenderButton() {
        Assert.assertTrue(calenderPage.dayText.getText().contains("Day"));
    }

    @And("User clicks week button")
    public void userClicksWeekButton() {
        calenderPage.weekButton.click();
    }

    @And("User clicks month button")
    public void userClicksMonthButton() {
        calenderPage.monthButton.click();
    }

    @Then("the month name should be displayed under the calender button")
    public void theMonthNameShouldBeDisplayedUnderTheCalenderButton() {
        Assert.assertTrue(calenderPage.monthText.getText().contains("Month"));
    }

    @When("User can click the time box")
    public void userCanClickTheTimeBox() {
        calenderPage.timeBoxButton.click();
    }

    @And("User can writes {string} on the summary box")
    public void userCanWritesOnTheSummaryBox(String string) {
        calenderPage.summaryBox.sendKeys(string);
    }

    @Then("User can click the create button.")
    public void userCanClickTheCreateButton() {
        calenderPage.createButton.click();
    }

    @When("User can click the event icon on the tme box.")
    public void userCanClickTheEventButton() {
        calenderPage.eventButton.click();
    }

    @And("User can click the edit button.")
    public void userCanClickTheEditButton() {
        calenderPage.editButton.click();
    }

    @And("User can click the meeting subject box.")
    public void userCanClickTheMeetingSubjectBox() {
        calenderPage.meetingSubjectBox.clear();
    }

    @And("User can change the name of the event with {string}")
    public void userCanChangeTheNameOfTheEventWith(String string) throws InterruptedException {
        calenderPage.meetingSubjectBox.sendKeys(string);
        Thread.sleep(3000);
    }
    @And("User can click tags box and write {string}.")
    public void userCanClickTagsBoxAndWrite(String string) throws InterruptedException {
        calenderPage.tagsBox.sendKeys(string);
        Thread.sleep(2000);
    }

    @And("User can select the Feedback Meeting.")
    public void userCanSelectTheFeedbackMeeting() throws InterruptedException {
        calenderPage.feedback.click();
        Thread.sleep(2000);

    }
    @And("User can click reminder box and write {string}.")
    public void userCanClickReminderBoxAndWrite(String number) throws InterruptedException {
        calenderPage.reminderBox.click();
        Thread.sleep(2000);
    }

    @And("User can select the {int} minutes.")
    public void userCanSelectTheMinutes(int arg0) {
        calenderPage.number.click();
    }

    @And("User can click location box.")
    public void userCanClickLocationBox() {
        calenderPage.locationBox.click();
    }

    @And("User can write {string}.")
    public void userCanWrite(String string) throws InterruptedException {
        calenderPage.locationBox.sendKeys(string);
        Thread.sleep(2000);
    }

    @And("User can click description box.")
    public void userCanClickDescriptionBox() throws InterruptedException {
        calenderPage.descriptionBox.click();
        Thread.sleep(2000);
    }

    @And("User can write  the {string}.")
    public void userCanWriteThe(String string) {
        calenderPage.descriptionBox.sendKeys(string);
    }

    @And("Options dropdown can be clickable")
    public void optionsDropdownCanBeClickable() throws InterruptedException {
        calenderPage.optionsButton.click();
        Thread.sleep(2000);
    }

    @And("User can select the only internal users.")
    public void userCanSelectTheOnlyInternalUsers() throws InterruptedException {
        Select sel = new Select(calenderPage.privacyButton);
        sel.selectByVisibleText("Only internal users");
        Thread.sleep(2000);
    }
        @Then("User can save the changes.")
    public void userCanSaveTheChanges() {
        calenderPage.saveButton.click();
    }
    @And("User can delete the event.")
    public void userCanDeleteTheEvent() throws InterruptedException {
        calenderPage.deleteButton.click();
        calenderPage.okButton.click();
    }
    @Then("User can see empty box on the event time box.")
    public void userCanSeeEmptyBoxOnTheEventTimeBox() throws InterruptedException {
        calenderPage.timeBoxButton.click();
        Assert.assertTrue(calenderPage.createButton.getText().contains("Create"));
    }
}
