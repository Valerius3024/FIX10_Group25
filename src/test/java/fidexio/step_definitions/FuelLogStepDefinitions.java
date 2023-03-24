package fidexio.step_definitions;

import fidexio.pages.FuelLogPage;
import fidexio.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FuelLogStepDefinitions {

    HomePage homePage = new HomePage();
    FuelLogPage fuelLogPage = new FuelLogPage();

    @When("user clicks More button")
    public void user_clicks_more_button() {
        try {
            homePage.moreDropdown.click();
        } catch (Exception e) {
            System.out.println("More button not seen, bypassing..");
        }
    }

    @Then("user clicks Fleet button")
    public void user_clicks_fleet_button() {
        homePage.fleetButton.click();
    }

    @Then("user clicks Vehicles Fuel Logs button")
    public void user_clicks_vehicles_fuel_logs_button() {
        fuelLogPage.vehiclesFuelLogsButton.click();
    }

    @Then("user clicks Create button")
    public void user_clicks_create_button() {
        fuelLogPage.vehiclesFuelLogsCreateButton.click();
    }

    @Then("user verifies Discard button visible")
    public void users_sees_discard_button() {
        Assert.assertTrue(fuelLogPage.vehiclesFuelLogsDiscardButton.isDisplayed());
    }

    @Then("users clicks Discard button")
    public void users_clicks_discard_button() {
        fuelLogPage.vehiclesFuelLogsDiscardButton.click();
    }

    @Then("user verifies Create button visible")
    public void user_verifies_create_button_visible() {
        Assert.assertTrue(fuelLogPage.vehiclesFuelLogsCreateButton.isDisplayed());
    }

    @Then("user clicks SAVE button")
    public void user_clicks_fuel_log_Save_Button() {
        fuelLogPage.vehiclesFuelLogsSaveButton.click();
    }

    @And("user verifies vehicle label invalid")
    public void user_verifies_vehicle_label_invalid() {
        Assert.assertEquals(fuelLogPage.vehicleLabelInvalid, fuelLogPage.vehicleLabel.getAttribute("class"));
    }

    @Then("user enters {string} name not in list")
    public void user_enters_new_vehicle_name_not_in_list(String string) {
        fuelLogPage.vehicleInputBox.sendKeys(string);
    }

    @Then("user verifies create vehicle popup is displayed")
    public void user_verifies_create_vehicle_popup_is_displayed() {
        Assert.assertTrue(fuelLogPage.createVehiclePopUp.isDisplayed());
    }
}
