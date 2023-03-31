package fidexio.step_definitions;

import fidexio.pages.CalenderPage;
import fidexio.pages.HomePage;
import fidexio.pages.OdometerPage;
import fidexio.utilities.BrowserUtils;
import fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class OdometerStepDefinitions {

    HomePage homePage = new HomePage();
    OdometerPage odometerPage = new OdometerPage();


    @Then("user clikcs Vehicles Odometer button")
    public void userClikcsVehiclesOdometerButton() {
        odometerPage.userClicksVehiclesOdometerButton.click();
    }

    @When("user clicks More Odometer button")
    public void userClicksMoreButton() {
        homePage.moreDropdown.click();
    }


    @Then("User clicks Vehicles Odometer button")
    public void userClicksVehiclesOdometerButton() {
        odometerPage.userClicksVehiclesOdometerButton.click();
    }


    @When("User clicks  odometer Create button")
    public void userClicksOdometerCreateButton() {
        BrowserUtils.waitForClickablility(odometerPage.vehiclesOdometerCreateButton, 10);
        odometerPage.vehiclesOdometerCreateButton.click();
    }


    @And("user enters  vehicle select input box")
    public void userEntersVehicleSelectInputBox() {
        odometerPage.userEnterVehicleSelectInputBox.click();
    }


    @And("User clicks Fleet Button")
    public void userClicksFleetButton() {
        homePage.fleetButton.click();
    }

    @And("user clicks create odometer button")
    public void userClicksCreateOdometerButton() {
        BrowserUtils.waitFor(3);
        odometerPage.createOdometerButton.click();

    }

    @And("user select first from dropdown")
    public void userSelectFirstFromDropdown() {
        odometerPage.userSelectFirstFromDropdown.click();
    }


    @Then("user should see it is invalid")
    public void userShouldSeeItIsInvalid() {
        Assert.assertTrue(odometerPage.userShouldSeeItIsInvalidInputBox.isDisplayed());

    }

    @And("user click save button")
    public void userClickSaveButton() {
        odometerPage.userClickSaveButton.click();

    }

    @And("user clicks odometer save button")
    public void userClicksOdometerSaveButton() {
        odometerPage.userClicksOdometerSaveButton.click();
    }


    @Then("Odometer saved details are seen")
    public void odometerSavedDetailsAreSeen() {
        Assert.assertEquals(odometerPage.vehicleNameSaved, odometerPage.detailInfoLabel.getText());


    }


    @Then("user click Discard button")
    public void user_click_discard_button() {
        odometerPage.user_click_discard_button.click();
    }


    @Then("user enters {string} name not in list")
    public void user_enters_new_vehicle_name_not_in_list(String string) {
        odometerPage.vehicleInputBox.sendKeys(string);
    }


    @Then("user enters {string} as vehicle name not list")
    public void user_enters_as_vehicle_name_not_list(String string) {
        odometerPage.vehicleInputBox.sendKeys(string);
    }

    @Then("user should see Edit and Create button")
    public void user_should_see_edit_and_create_button() {
        BrowserUtils.waitForClickablility(odometerPage.vehiclesOdometerCreateButton, 10);
        odometerPage.vehiclesOdometerCreateButton.click();
    }

    @Then("user click Edit button")
    public void user_click_edit_button() {
        odometerPage.userClickEditButton.click();
    }

    @Then("user click ok button")
    public void user_click_ok_button() {
        odometerPage.userClickOkButton.click();
    }





    @And("user enters {string} Odometer Value input box")
    public void userEntersOdometerValueInputBox(String value) {
        BrowserUtils.waitForVisibility(odometerPage.OdometerValueInputBox,7);
        odometerPage.OdometerValueInputBox.clear();
        BrowserUtils.waitForVisibility(odometerPage.OdometerValueInputBox,7);
        odometerPage.OdometerValueInputBox.sendKeys(value);
    }
}