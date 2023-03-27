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
    FuelLogPage fp = new FuelLogPage();

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
        fp.vehiclesFuelLogsButton.click();
    }

    @Then("user clicks Create button")
    public void user_clicks_create_button() {
        fp.vehiclesFuelLogsCreateButton.click();
    }

    @Then("user verifies Discard button visible")
    public void users_sees_discard_button() {
        Assert.assertTrue(fp.vehiclesFuelLogsDiscardButton.isDisplayed());
    }

    @Then("users clicks Discard button")
    public void users_clicks_discard_button() {
        fp.vehiclesFuelLogsDiscardButton.click();
    }

    @Then("user verifies Create button visible")
    public void user_verifies_create_button_visible() {
        Assert.assertTrue(fp.vehiclesFuelLogsCreateButton.isDisplayed());
    }

    @Then("user clicks SAVE button")
    public void user_clicks_fuel_log_Save_Button() {
        fp.vehiclesFuelLogsSaveButton.click();
    }

    @And("user verifies vehicle label invalid")
    public void user_verifies_vehicle_label_invalid() {
        Assert.assertEquals(fp.vehicleLabelInvalid, fp.vehicleLabel.getAttribute("class"));
    }

    @Then("user enters {string} as vehicle name not in list")
    public void user_enters_new_vehicle_name_not_in_list(String string) {
        fp.vehicleInputBox.sendKeys(string);
    }

    @Then("user select first vehicle from dropdown")
    public void user_enters_new_vehicle_name() {
        fp.vehicleInputBox.click();
        fp.vehicleNameSaved = fp.vehicleSelectFirst.getText();
        fp.vehicleSelectFirst.click();
    }

    @Then("user verifies create vehicle popup is displayed")
    public void user_verifies_create_vehicle_popup_is_displayed() {
        Assert.assertTrue(fp.createVehiclePopUp.isDisplayed());
    }

    @Then("user verifies Edit button is seen")
    public void verify_edit_button_is_seen() {
        BrowserUtils.waitForVisibility(fp.vehiclesFuelLogsEditButton, 5);
        Assert.assertTrue(fp.vehiclesFuelLogsEditButton.isDisplayed());
    }

    @And("user delete last saved record")
    public void user_delete_last_saved_record() {
        click(fp.actionDropDown);
        click(fp.actionDropDownDeleteButton);
        click(fp.deleteOkButton);
    }

    @Then("user verifies saved details are seen")
    public void userVerifiesSavedDetailsAreSeen() {
        Assert.assertEquals(fp.vehicleNameSaved, fp.detailInfoLabel.getText());
    }

    @And("user verifies Create button is seen")
    public void user_verifies_create_button_is_seen() {
        Assert.assertTrue(fp.afterSaveCreateButton.isDisplayed());
    }

    @And("user clicks Edit button")
    public void user_clicks_Edit_button() {
        fp.vehiclesFuelLogsEditButton.click();
    }

    @Then("user verifies details are seen and editable")
    public void user_verifies_details_are_seen_and_editable() {
        fp.literFieldBox.clear();
        fp.literFieldBox.sendKeys("test123");
        Assert.assertEquals("test123", fp.literFieldBox.getAttribute("value"));
    }

    @Then("user clicks ok button")
    public void user_clicks_ok_button() {
        fp.deleteOkButton.click();
    }

    @And("user sends text value to odometer")
    public void user_sends_text_value_to_odometer() {
        fp.odometerInputBox.clear();
        fp.odometerInputBox.sendKeys("text");
    }

    @Then("user checks odometer label turns red")
    public void user_checks_odometer_value() {
        BrowserUtils.waitForVisibility(fp.odometerLabelInvalid, 5);
        Assert.assertTrue(fp.odometerLabelInvalid.isDisplayed());
    }

    @And("user sends {int} value to odometer")
    public void user_sends_value_to_odometer(int arg0) {
        fp.odometerInputBox.clear();
        fp.odometerInputBox.sendKeys("" + arg0);
    }

    @Then("user checks odometer input shows float")
    public void user_checks_odometer_input_Shows_float() {
        Assert.assertTrue(fp.odometerSavedInput.getText().contains(".00"));
    }

    public static void click(WebElement we) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click()", we);
    }
}
