package fidexio.step_definitions;

import fidexio.pages.VehicleCostsPage;
import fidexio.utilities.BrowserUtils;
import fidexio.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VehicleCostsStepDefinitions {

    VehicleCostsPage vehicleCostsPage = new VehicleCostsPage();

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

}
