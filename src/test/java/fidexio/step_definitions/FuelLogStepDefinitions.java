package fidexio.step_definitions;

import fidexio.pages.FuelLogPage;
import fidexio.pages.HomePage;
import fidexio.utilities.BrowserUtils;
import fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

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

    @Then("user enters {string} as vehicle name not in list")
    public void user_enters_new_vehicle_name_not_in_list(String string) {
        fuelLogPage.vehicleInputBox.sendKeys(string);
    }

    @Then("user select first vehicle from dropdown")
    public void user_enters_new_vehicle_name() {
        fuelLogPage.vehicleInputBox.click();
        fuelLogPage.vehicleNameSaved = fuelLogPage.vehicleSelectFirst.getText();
        fuelLogPage.vehicleSelectFirst.click();
    }

    @Then("user verifies create vehicle popup is displayed")
    public void user_verifies_create_vehicle_popup_is_displayed() {
        Assert.assertTrue(fuelLogPage.createVehiclePopUp.isDisplayed());
    }

    @Then("user verifies Edit button is seen")
    public void verify_edit_button_is_seen() {
        BrowserUtils.waitForVisibility(fuelLogPage.vehiclesFuelLogsEditButton, 5);
        Assert.assertTrue(fuelLogPage.vehiclesFuelLogsEditButton.isDisplayed());
    }

    @And("user delete last saved record")
    public void user_delete_last_saved_record() {
        click(fuelLogPage.actionDropDown);
        click(fuelLogPage.actionDropDownDeleteButton);
        click(fuelLogPage.deleteOkButton);
    }

    @Then("user verifies saved details are seen")
    public void userVerifiesSavedDetailsAreSeen() {
        Assert.assertEquals(fuelLogPage.vehicleNameSaved, fuelLogPage.detailInfoLabel.getText());
    }

    @And("user verifies Create button is seen")
    public void user_Verifies_Create_Button_Is_Seen() {
        Assert.assertTrue(fuelLogPage.afterSaveCreateButton.isDisplayed());
    }

    public static void click(WebElement we) {
        ((JavascriptExecutor) Driver.getDriver())
                .executeScript("arguments[0].click()", we);
    }

}
