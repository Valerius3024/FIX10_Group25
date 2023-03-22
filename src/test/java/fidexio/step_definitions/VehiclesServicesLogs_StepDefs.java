package fidexio.step_definitions;

import fidexio.pages.FleetPage;
import fidexio.pages.VehiclesServicesLogsPage;
import fidexio.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VehiclesServicesLogs_StepDefs {
FleetPage fleetPage = new FleetPage();
VehiclesServicesLogsPage servicesLogs = new VehiclesServicesLogsPage();
    @Then("User clicks Vehicles Services Logs button")
    public void userClicksVehiclesServicesLogsButton() {
        BrowserUtils.waitForClickablility(fleetPage.vehiclesFuelLogs,5);
        fleetPage.vehiclesFuelLogs.click();

    }

    @Given("user is on the Vehicles Services Logs")
    public void userIsOnTheVehiclesServicesLogs() {
        BrowserUtils.verifyTitle("Vehicles Services Logs - Odoo");
    }

    @And("user clicks create button")
    public void userClicksCreateButton() {
        servicesLogs.createBtn.click();

    }

    @And("user enters {string} to vehicle input box")
    public void userEntersToVehicleInputBox(String arg0) {
    }

    @And("user enters {string} to service type input box")
    public void userEntersToServiceTypeInputBox(String arg0) {
    }

    @And("user enters {string} to total price input box")
    public void userEntersToTotalPriceInputBox(String arg0) {
    }

    @And("user enters {string} to odometer value inout box")
    public void userEntersToOdometerValueInoutBox(String arg0) {
    }

    @Then("the new log should be displayed in the table")
    public void theNewLogShouldBeDisplayedInTheTable() {
    }
}
