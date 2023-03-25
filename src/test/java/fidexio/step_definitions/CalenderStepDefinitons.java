package fidexio.step_definitions;

import fidexio.pages.CalenderPage;
import fidexio.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalenderStepDefinitons {
    HomePage homePage = new HomePage();

    CalenderPage calenderPage = new CalenderPage();

    @When("User clicks calender button")
    public void userClicksCalenderButton() {
        homePage.calenderButton.click();
    }
    @Then("the week number should be displayed under the calender button")
    public void theWeekNumberShouldBeDisplayedUnderTheCalenderButton() {
       Assert.assertTrue(calenderPage.weekText.getText().contains("Week"));
    }
    @When("User clicks day button")
    public void userClicksDayButton() {
        calenderPage.dayButton.click();
    }
    @Then("the day number should be displayed under the calender button")
    public void theDayNumberShouldBeDisplayedUnderTheCalenderButton() {
        Assert.assertTrue(calenderPage.dayText.getText().contains(","));
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
        Assert.assertTrue(calenderPage.monthText.getText().contains("March"));
    }
}
