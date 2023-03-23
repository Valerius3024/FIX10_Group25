package fidexio.step_definitions;

import fidexio.pages.FleetPage;
import fidexio.pages.HomePage;
import fidexio.pages.VehiclesServicesLogsPage;
import fidexio.utilities.BrowserUtils;
import fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VehiclesServicesLogs_StepDefs {
    FleetPage fleetPage = new FleetPage();
    VehiclesServicesLogsPage servicesLogs = new VehiclesServicesLogsPage();

    @Then("User clicks Vehicles Services Logs button")
    public void userClicksVehiclesServicesLogsButton() {
        BrowserUtils.waitForClickablility(fleetPage.vehiclesServicesLogs, 5);
        fleetPage.vehiclesServicesLogs.click();

    }

    @Given("user is on the Vehicles Services Logs")
    public void userIsOnTheVehiclesServicesLogs() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.titleIs("Vehicles Services Logs - Odoo"));
        BrowserUtils.verifyTitle("Vehicles Services Logs - Odoo");
    }

    @And("user clicks create button")
    public void userClicksCreateButton() {
        BrowserUtils.waitForClickablility(servicesLogs.createBtn,3);
        servicesLogs.createBtn.click();

    }

    @And("user enters {string} to vehicle input box")
    public void userEntersToVehicleInputBox(String vehicle) {
        BrowserUtils.waitFor(2);
        servicesLogs.vehicleBox.sendKeys(vehicle);

    }

    @And("user enters {string} to service type input box")
    public void userEntersToServiceTypeInputBox(String serviceType) {
        servicesLogs.serviceTypeBox.clear();
        servicesLogs.serviceTypeBox.click();
       servicesLogs.serviceType(serviceType);

    }

    @And("user enters {string} to total price input box")
    public void userEntersToTotalPriceInputBox(String totalPrice) {
        servicesLogs.totalPriceBox.clear();
        servicesLogs.totalPriceBox.sendKeys(totalPrice);
    }

    @And("user enters {string} to odometer value input box")
    public void userEntersToOdometerValueInoutBox(String odometerValue) {
        servicesLogs.odometerBox.clear();
        servicesLogs.odometerBox.sendKeys(odometerValue);
    }

    @Then("the new log should be displayed in the table")
    public void theNewLogShouldBeDisplayedInTheTable() throws InterruptedException {
        fleetPage.vehiclesServicesLogs.click();
        Assert.assertTrue(servicesLogs.newLog.isDisplayed());
        servicesLogs.deleteLog();
    }

    @And("User navigates to fleet option")
    public void userNavigatesToFleetOption() {
        HomePage homePage = new HomePage();
        if (homePage.moreDropdown.isDisplayed()) {
            BrowserUtils.waitForClickablility(homePage.moreDropdown, 5);
            homePage.moreDropdown.click();
            BrowserUtils.waitForClickablility(homePage.fleetButton, 5);
            homePage.fleetButton.click();
        } else {
            BrowserUtils.waitForClickablility(homePage.fleetButton, 5);
            homePage.fleetButton.click();
        }
    }

    @And("user clicks save button")
    public void userClicksSaveButton() {
        servicesLogs.notesField.sendKeys("delete");
        servicesLogs.saveBtn.click();
    }


    @And("user select a vehicle from list")
    public void userSelectAVehicleFromList() {
        servicesLogs.vehicleList.click();

    }
}