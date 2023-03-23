package fidexio.step_definitions;

import fidexio.pages.HomePage;
import fidexio.pages.VehicleContractsPage;
import fidexio.utilities.BrowserUtils;
import fidexio.utilities.ConfigurationReader;
import fidexio.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;

public class VehicleContractStepDefinitions {

    HomePage homePage = new HomePage();
    VehicleContractsPage vehicleContractsPage = new VehicleContractsPage();


    @When("User navigates to fleet page")
    public void user_navigates_to_fleet_page() {
        if(homePage.moreDropdown.isDisplayed()){
            homePage.moreDropdown.click();
            BrowserUtils.waitFor(2);
            homePage.navigateToThisModule("fleet");
        }
        else{
        homePage.navigateToThisModule("fleet");
        }
    }
    @Then("Clicks Vehicle Contracts button")
    public void clicks_vehicle_contracts_button() {
        vehicleContractsPage.vehiclesContractsButton.click();
    }
    @When("User clicks create button")
    public void user_clicks_create_button() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.titleContains("Contracts"));
        vehicleContractsPage.createButton.click();
    }

    @When("user selects {string} Vehicle")
    public void user_selects_vehicle(String vehicle) {
        BrowserUtils.waitFor(2);
        vehicleContractsPage.vehicleInputBox.sendKeys(vehicle);
        vehicleContractsPage.mercedes.click();
    }

    @When("user clicks Save button")
    public void user_clicks_save_button() {
        BrowserUtils.waitFor(2);
        vehicleContractsPage.saveButton.click();
        BrowserUtils.waitFor(2);
    }
  
    @Then("the new contract should be displayed in the table")
    public void the_new_contract_should_be_displayed_in_the_table() {
        vehicleContractsPage.vehiclesContractsButton.click();
        Assert.assertTrue(vehicleContractsPage.row.isDisplayed());

        // DELETING PART


        BrowserUtils.waitFor(3);
        vehicleContractsPage.checkbox.click();
        BrowserUtils.waitFor(1);
        vehicleContractsPage.actionButton.click();
        BrowserUtils.waitFor(2);
        vehicleContractsPage.deleteButton.click();
        BrowserUtils.waitFor(1);
        vehicleContractsPage.okButton.click();

    }


    @When("user selects {string} Type")
    public void user_selects_type(String type) {
        BrowserUtils.waitFor(2);
        vehicleContractsPage.typeInputBox.clear();
        vehicleContractsPage.typeInputBox.sendKeys(type);
    }
    @When("user enters {string} Activation Cost")
    public void user_enters_activation_cost(String cost) {
        vehicleContractsPage.activationCostInputBox.clear();
        BrowserUtils.waitFor(2);
        vehicleContractsPage.activationCostInputBox.sendKeys(cost);


    }
    @When("user enters {string} Recurring Cost Amount")
    public void user_enters_recurring_cost_amount(String amount) {
        Select select = new Select(vehicleContractsPage.recurringCostDropdown);
        select.selectByVisibleText("Yearly");

        vehicleContractsPage.recurringCostInputBox.clear();
        vehicleContractsPage.recurringCostInputBox.sendKeys(amount);


    }

    @When("user has not selected any vehicle")
    public void user_has_not_selected_any_vehicle() {
        vehicleContractsPage.vehicleInputBox.sendKeys("");
    }
    @Then("user should see the error message")
    public void user_should_see_the_error_message() {
        Assert.assertTrue(vehicleContractsPage.error.isDisplayed());
    }

    @When("user enter a vehicle {string}")
    public void user_enter_a_vehicle(String vehicleName) {
      vehicleContractsPage.vehicleInputBox.sendKeys(vehicleName);
    }
    @Then("Create a Vehicle popup should be displayed")
    public void create_a_vehicle_popup_should_be_displayed() {
        Assert.assertTrue(vehicleContractsPage.createAVehiclePopup.isDisplayed());

    }

    @Then("Contract details should be displayed")
    public void contract_details_should_be_displayed(Map<String,String> detailsList) {

        Assert.assertTrue(vehicleContractsPage.contractDetails.isDisplayed());

        Assert.assertEquals(vehicleContractsPage.vehicleName.getText(),detailsList.get("vehicle"));
        Assert.assertEquals(vehicleContractsPage.costType.getText(),detailsList.get("type"));
        Assert.assertEquals(vehicleContractsPage.activationCost.getText(),detailsList.get("activationCost"));
        Assert.assertEquals(vehicleContractsPage.recurringCostAmount.getText(),detailsList.get("recurringCostAmount"));
        Assert.assertEquals(vehicleContractsPage.recurringCostFrequency.getText(),detailsList.get("recurringCostFrequency"));

        // DELETING PART

        vehicleContractsPage.deleteContract();


    }

    @When("user should see Save and Discard button")
    public void user_should_see_save_and_discard_button() {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(vehicleContractsPage.saveButton.isDisplayed());
        Assert.assertTrue(vehicleContractsPage.discardButton.isDisplayed());
    }

    @Then("user should see Edit and Create button instead of Save button and Create button")
    public void user_should_see_edit_and_create_button_instead_of_save_button_and_create_button() {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(vehicleContractsPage.editButton.isDisplayed());
        Assert.assertTrue(vehicleContractsPage.createButton.isDisplayed());

        // DELETING PART

        vehicleContractsPage.deleteContract();
    }

    @When("user clicks the Edit button")
    public void user_clicks_the_edit_button() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(vehicleContractsPage.editButton));
        vehicleContractsPage.editButton.click();
    }
    @Then("the form should be display and ready to edit")
    public void the_form_should_be_display_and_ready_to_edit() {
        Assert.assertTrue(vehicleContractsPage.contractDetails.isDisplayed());

        Assert.assertTrue(vehicleContractsPage.vehicleInputBox.isEnabled());
        Assert.assertTrue(vehicleContractsPage.typeInputBox.isEnabled());
        Assert.assertTrue(vehicleContractsPage.activationCostInputBox.isEnabled());
        Assert.assertTrue(vehicleContractsPage.recurringCostInputBox.isEnabled());


        // DELETING PART

        vehicleContractsPage.deleteContract();


    }

    @Then("number should be displayed as float number")
    public void number_should_be_displayed_as_float_number() {

        String activationCost = vehicleContractsPage.activationCost.getText();

        try {
            Float.parseFloat(activationCost);
            Assert.assertTrue(true);
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }

        // DELETING PART

        vehicleContractsPage.deleteContract();
    }


    @Then("user should see service type as {string} by default")
    public void user_should_see_service_type_as_by_default(String expectedDefaultText) {

        Assert.assertEquals(expectedDefaultText,vehicleContractsPage.typeInputBox.getAttribute("value"));

    }









}
