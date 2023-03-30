package fidexio.step_definitions;

import fidexio.pages.VehicleContractsPage;
import fidexio.pages.VehicleCostsPage;
import fidexio.utilities.BrowserUtils;
import fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class VehicleCostsStepDefinitions {

    VehicleCostsPage vehicleCostsPage = new VehicleCostsPage();
    VehicleContractsPage vehicleContractsPage = new VehicleContractsPage();

    @When("Clicks Vehicle Costs button")
    public void clicks_vehicle_costs_button() {
        vehicleCostsPage.vehicleCostsButton.click();
    }
    @When("User clicks on create button")
    public void user_clicks_on_create_button() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.titleContains("Costs"));
        vehicleCostsPage.createButton.click();
    }

    @When("user enters {string} for Total Price")
    public void user_enters_for_total_price(String totalPrice) {
       vehicleCostsPage.totalPrice.clear();
       vehicleCostsPage.totalPrice.sendKeys(totalPrice);
    }
    @When("enters {string} in cost description")
    public void enters_in_cost_description(String description) {
       vehicleCostsPage.description.sendKeys(description);
    }

    @When("user selects {string} cost detail Type")
    public void user_selects_cost_detail_type(String costDetailType) {
        vehicleCostsPage.chooseCostDetailType(costDetailType);
    }

    @Then("the new vehicle costs should be displayed")
    public void the_new_vehicle_costs_should_be_displayed() {

        BrowserUtils.waitFor(1);
        vehicleCostsPage.showVehiclesButton.click();
        Assert.assertTrue(vehicleCostsPage.row.isDisplayed());

       vehicleCostsPage.deleteVehicleCost();
    }

    @Then("Cost details should be displayed")
    public void cost_details_should_be_displayed(Map<String,String> costList) {

        Assert.assertEquals(vehicleContractsPage.vehicleName.getText(),costList.get("vehicle"));
        Assert.assertEquals(vehicleContractsPage.costType.getText(),costList.get("type"));
        Assert.assertEquals(vehicleCostsPage.totalPrice.getText(),costList.get("totalPrice"));
        Assert.assertEquals(vehicleCostsPage.description.getText(),costList.get("costDescription"));

        // deleting part


        vehicleCostsPage.deleteVehicleCostNoCheckBox();

    }


    @Then("The form should be display and ready to edit")
    public void theFormShouldBeDisplayAndReadyToEdit() {



        BrowserUtils.waitForVisibility(vehicleCostsPage.totalPrice,7);
        BrowserUtils.waitForVisibility(vehicleCostsPage.description,7);

        Assert.assertTrue(vehicleCostsPage.totalPrice.isDisplayed());
        Assert.assertTrue(vehicleCostsPage.description.isDisplayed());


    }

    @And("user enters {string} Total Price")
    public void userEntersTotalPrice(String cost) {

        BrowserUtils.waitForVisibility(vehicleCostsPage.totalPrice,7);
        vehicleCostsPage.totalPrice.clear();
        BrowserUtils.waitForVisibility(vehicleCostsPage.totalPrice,7);
        vehicleCostsPage.totalPrice.sendKeys(cost);
    }
}
