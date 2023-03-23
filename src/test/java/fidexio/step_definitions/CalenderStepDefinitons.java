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

}
