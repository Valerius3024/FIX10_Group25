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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        vehicleContractsPage.saveButton.click();
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


        try {
            vehicleContractsPage.okButton.click();
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
    }
    @When("user enters {string} Recurring Cost Amount")
    public void user_enters_recurring_cost_amount(String amount) {
        Select select = new Select(vehicleContractsPage.recurringCostDropdown);
        select.selectByVisibleText("Yearly");

        try {
            vehicleContractsPage.okButton.click();
        } catch (Exception e) {
            Assert.assertTrue(true);
        }

        vehicleContractsPage.recurringCostInputBox.clear();
        vehicleContractsPage.recurringCostInputBox.sendKeys(amount);

        try {
            vehicleContractsPage.okButton.click();
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
    }



}
