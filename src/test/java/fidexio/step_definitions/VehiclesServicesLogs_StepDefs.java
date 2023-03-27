package fidexio.step_definitions;

import fidexio.pages.FleetPage;
import fidexio.pages.HomePage;
import fidexio.pages.ServiceLogDetailsPage;
import fidexio.pages.VehiclesServicesLogsPage;
import fidexio.utilities.BrowserUtils;
import fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.junit.Assert.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VehiclesServicesLogs_StepDefs {
    FleetPage fleetPage = new FleetPage();
    VehiclesServicesLogsPage servicesLogs = new VehiclesServicesLogsPage();
    ServiceLogDetailsPage serviceLogDetails = new ServiceLogDetailsPage();

    @Then("User clicks Vehicles Services Logs button")
    public void userClicksVehiclesServicesLogsButton() {
        BrowserUtils.waitForClickablility(fleetPage.vehiclesServicesLogs, 5);
        fleetPage.vehiclesServicesLogs.click();

    }

    @Given("user is on the Vehicles Services Logs")
    public void userIsOnTheVehiclesServicesLogs() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        wait.until(ExpectedConditions.titleIs("Vehicles Services Logs - Odoo"));
        BrowserUtils.verifyTitle("Vehicles Services Logs - Odoo");
    }

    @And("user clicks create button")
    public void userClicksCreateButton() {
        BrowserUtils.waitForClickablility(servicesLogs.createBtn, 3);
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
        ;
        servicesLogs.totalPriceBox.clear();
        servicesLogs.totalPriceBox.sendKeys(totalPrice);
    }

    @And("user enters {string} to odometer value input box")
    public void userEntersToOdometerValueInoutBox(String odometerValue) {
        BrowserUtils.waitFor(3);
        servicesLogs.odometerBox.clear();
        servicesLogs.odometerBox.sendKeys(odometerValue);
        servicesLogs.notesField.sendKeys("delete");
    }

    @Then("the new log should be displayed in the table")
    public void theNewLogShouldBeDisplayedInTheTable() throws InterruptedException {
        fleetPage.vehiclesServicesLogs.click();
        assertTrue(servicesLogs.newLog.isDisplayed());
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
        servicesLogs.saveBtn.click();
    }


    @And("user select a vehicle from list")
    public void userSelectAVehicleFromList() {
        servicesLogs.vehicleList.click();

    }

    @Then("new service log details should be displayed")
    public void newServicesServiceLogDetailsShouldBeDisplayed() {
        BrowserUtils.waitForVisibility(serviceLogDetails.vehicleField, 5);
        assertEquals("FORD/FOCUS/S", serviceLogDetails.vehicleField.getText());
        assertEquals("Tax roll", serviceLogDetails.serviceTypeField.getText());
        assertEquals("75,000.00", serviceLogDetails.odometerField.getText());
        assertEquals("500.00", serviceLogDetails.totalPriceField.getText());


    }

    @Then("the form should be display and enabled")
    public void theFormShouldBeDisplayAndEnabled() {

        servicesLogs.odometerBox.isEnabled();
        servicesLogs.totalPriceBox.isEnabled();
        servicesLogs.vehicleBox.isEnabled();
        servicesLogs.serviceTypeBox.isEnabled();
    }

    @Then("odometer value should be displayed as a float number")
    public void numberShouldBeDisplayedAsAFloatNumber() {
        Assert.assertTrue(serviceLogDetails.odometerField.getText().contains("."));
    }

    @Then("Service Type default value should be Repair and Maintenance")
    public void serviceTypeDefaultValueShouldBeRepairAndMaintenance() {
        assertEquals("Repair and maintenance", servicesLogs.serviceTypeBox.getAttribute("value"));
    }

    @Then("user should see Edit and Create button instead of Save and Create button")
    public void userShouldSeeEditAndCreateButtonInsteadOfSaveAndCreateButton() {
        BrowserUtils.waitForVisibility(servicesLogs.saveBtn, 5);
        Assert.assertTrue(servicesLogs.saveBtn.isDisplayed());
        BrowserUtils.waitForVisibility(servicesLogs.createBtn, 5);

        Assert.assertTrue(servicesLogs.createBtn.isDisplayed());

    }
}