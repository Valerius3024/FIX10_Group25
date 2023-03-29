package fidexio.step_definitions;

import fidexio.pages.HomePage;
import fidexio.pages.OdometerPage;
import fidexio.utilities.BrowserUtils;
import fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OdometerStepDefinitions {

    HomePage homePage = new HomePage();
    OdometerPage odometerPage = new OdometerPage();


    @Then("user clikcs Vehicles Odometer button")
    public void userClikcsVehiclesOdometerButton() {
        odometerPage.userClicksVehiclesOdometerButton.click();
    }

    @When("user clicks More Odometer button")
    public void userClicksMoreButton() {
        homePage.moreDropdown.click();
    }



    @Then("User clicks Vehicles Odometer button")
    public void userClicksVehiclesOdometerButton() {
        odometerPage.userClicksVehiclesOdometerButton.click();
    }



    @When("User clicks  odometer Create button")
    public void userClicksOdometerCreateButton() {
        BrowserUtils.waitForClickablility(odometerPage.vehiclesOdometerCreateButton,10);
        odometerPage.vehiclesOdometerCreateButton.click();
    }

    @And("user enters  vehicle select input box")
    public void userEntersVehicleSelectInputBox() {
        odometerPage.userEnterVehicleSelectInputBox.click();
    }

    @And("User clicks Fleet Button")
    public void userClicksFleetButton() {
        homePage.fleetButton.click();
    }

    @And("user clicks create odometer button")
    public void userClicksCreateOdometerButton() {
        BrowserUtils.waitFor(3);
    odometerPage.createOdometerButton.click();

    }

    @And("user select first from dropdown")
    public void userSelectFirstFromDropdown() {
        odometerPage.userSelectFirstFromDropdown.click();
    }

    @And("user click save button")
    public void userClickSaveButton() {
        odometerPage.userClickSaveButton.click();
    }
}