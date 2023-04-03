package fidexio.step_definitions;

import com.github.javafaker.Faker;
import fidexio.pages.HomePage;
import fidexio.pages.VehiclesPage;
import fidexio.utilities.BrowserUtils;
import fidexio.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class Vehicles_StepDefinitions {

    Faker faker = new Faker();
    HomePage homePage = new HomePage();
    VehiclesPage vehiclesPage = new VehiclesPage();

    String vehiclePlate;

    @Then("user navigates to Vehicles page")
    public void user_navigates_to_vehicles_page() {
        homePage.moreDropdown.click();
        BrowserUtils.waitForInvisibilityOfElement(vehiclesPage.loadingIndicator,10);
        homePage.fleetButton.click();
        BrowserUtils.waitForInvisibilityOfElement(vehiclesPage.loadingIndicator,10);
    }
    @When("user clicks on Create button in Vehicles page")
    public void user_clicks_on_create_button_in_vehicles_page() {
        vehiclesPage.createButton.click();
    }
    @When("user chooses the model for the new vehicle")
    public void user_chooses_the_model_for_the_new_vehicle() {
        vehiclesPage.modelInputBox.click();
        vehiclesPage.carModelOption.click();
    }
    @When("user enters license plate for the new vehicle")
    public void user_enters_license_plate_for_the_new_vehicle() {
        vehiclePlate = faker.bothify("???####");
        vehiclesPage.licensePlateInputBox.sendKeys(vehiclePlate);
    }
    @When("user chooses the car type from tags")
    public void user_chooses_the_car_type_from_tags() {
        vehiclesPage.carTypeInputBox.click();
        vehiclesPage.carTypeOption.click();
        BrowserUtils.waitForInvisibilityOfElement(vehiclesPage.loadingIndicator, 10);
    }
    @When("user fills all the fields in general properties")
    public void user_fills_all_the_fields_in_general_properties() {
        BrowserUtils.waitForClickablility(vehiclesPage.locationInputBox, 10);
        vehiclesPage.driverInputBox.sendKeys(faker.name().fullName());
        vehiclesPage.locationInputBox.click();
        vehiclesPage.createNewDriver.click();
        BrowserUtils.waitForInvisibilityOfElement(vehiclesPage.loadingIndicator, 10);
        vehiclesPage.locationInputBox.sendKeys(faker.address().cityName());
        vehiclesPage.chassisInputBox.sendKeys(faker.bothify("??##-#######"));
        vehiclesPage.modelYearInputBox.sendKeys(""+faker.number().numberBetween(1908, 2023));
        vehiclesPage.odometerInputBox.sendKeys(""+faker.number().numberBetween(0, 999));
        vehiclesPage.immatriculationInputBox.sendKeys(faker.number().numberBetween(1, 12) + "."+faker.number().numberBetween(1, 28) + "." + faker.number().numberBetween(1999, 2023));
        vehiclesPage.carValueInputBox.sendKeys(""+faker.number().numberBetween(10000, 100000));
        vehiclesPage.residualValueInputBox.sendKeys(""+faker.number().numberBetween(10000, 100000));
    }
    @When("user fills all the fields in additional properties")
    public void user_fills_all_the_fields_in_additional_properties() {
        vehiclesPage.seatsInputBox.sendKeys(""+faker.number().numberBetween(1,15));
        vehiclesPage.doorsInputBox.sendKeys(""+faker.number().numberBetween(1,6));
        vehiclesPage.colorInputBox.sendKeys(""+faker.color().name());
    }
    @When("user fills all the fields in engine properties")
    public void user_fills_all_the_fields_in_engine_properties() {
        vehiclesPage.selectTransmissionType();
        vehiclesPage.selectFuelType();
        vehiclesPage.co2InputBox.sendKeys(""+faker.number().numberBetween(0,200));
        vehiclesPage.horsePowerInputBox.sendKeys(""+faker.number().numberBetween(100,500));
        vehiclesPage.horsePowerTaxInputBox.sendKeys(""+faker.number().numberBetween(1,10));
        vehiclesPage.powerInputBox.sendKeys(""+faker.number().numberBetween(100,500));

    }
    @When("user clicks on Save button in Vehicles page")
    public void user_clicks_on_save_button_in_vehicles_page() {
        vehiclesPage.saveButton.click();
    }
    @Then("user should be able to see the registered vehicle")
    public void user_should_be_able_to_see_the_registered_vehicle() {
        BrowserUtils.waitForVisibility(vehiclesPage.registeredModelId, 10);
        Assert.assertTrue(vehiclesPage.addedToFleet.isDisplayed());
    }

    @Then("user should see The following fields are invalid notification for model and plate")
    public void user_should_see_the_following_fields_are_invalid_notification_for_model_and_plate() {
        Assert.assertTrue(vehiclesPage.notificationTitle.isDisplayed());
        Assert.assertTrue(vehiclesPage.modelError.isDisplayed());
        Assert.assertTrue(vehiclesPage.plateError.isDisplayed());
    }

    @When("user enters a new model for the vehicle")
    public void user_enters_a_new_model_for_the_vehicle() {
        vehiclesPage.modelInputBox.sendKeys("Machiavelli");
        vehiclesPage.licensePlateInputBox.click();
    }
    @Then("{string} popup should be displayed")
    public void popup_should_be_displayed(String expectedTitle) {
        BrowserUtils.waitForVisibility(vehiclesPage.createNewModelTitle, 10);
        String actualTitle = vehiclesPage.createNewModelTitle.getText();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Then("user navigates back to the Vehicles page")
    public void user_navigates_back_to_the_vehicles_page() {
        vehiclesPage.backToVehiclesButton.click();
    }


    @Then("user searches for the created vehicle going through the pages and finds it")
    public void user_searches_for_the_created_vehicle_going_through_the_pages_and_finds_it() {
        boolean checkNextPage = true;
        while(checkNextPage){
            BrowserUtils.waitForInvisibilityOfElement(vehiclesPage.loadingIndicator, 10);
            for(WebElement result : vehiclesPage.vehiclesResults){
                if(result.getText().contains(vehiclePlate)) {
                    checkNextPage = false;
                    break;
                }
            }
            if(checkNextPage==false){
                break;
            }
            vehiclesPage.nextPageButton.click();
        }

    }

    @Then("Edit and Create buttons should be displayed instead of Save and Discard in Vehicles page")
    public void edit_and_create_buttons_should_be_displayed_instead_of_save_and_discard_in_vehicles_page() {
        BrowserUtils.waitForVisibility(vehiclesPage.editButton, 10);
        Assert.assertTrue(vehiclesPage.editButton.isDisplayed());
        Assert.assertTrue(vehiclesPage.createButton.isDisplayed());
        Assert.assertFalse(vehiclesPage.saveButton.isDisplayed());
        Assert.assertFalse(vehiclesPage.discardButton.isDisplayed());

    }

    @Then("all the information should be displayed")
    public void all_the_information_should_be_displayed() {
        Assert.assertTrue(vehiclesPage.registeredModelId.isDisplayed());
        Assert.assertTrue(vehiclesPage.registeredLicense.isDisplayed());
        Assert.assertTrue(vehiclesPage.registeredTag.isDisplayed());
        Assert.assertTrue(vehiclesPage.registeredDriver.isDisplayed());
        Assert.assertTrue(vehiclesPage.registeredLocation.isDisplayed());
        Assert.assertTrue(vehiclesPage.registeredChassis.isDisplayed());
        Assert.assertTrue(vehiclesPage.registeredModelYear.isDisplayed());
        Assert.assertTrue(vehiclesPage.registeredOdometer.isDisplayed());
        Assert.assertTrue(vehiclesPage.registeredDate.isDisplayed());
        Assert.assertTrue(vehiclesPage.registeredCarValue.isDisplayed());
        Assert.assertTrue(vehiclesPage.registeredResidualValue.isDisplayed());
        Assert.assertTrue(vehiclesPage.registeredSeats.isDisplayed());
        Assert.assertTrue(vehiclesPage.registeredDoors.isDisplayed());
        Assert.assertTrue(vehiclesPage.registeredColor.isDisplayed());
        Assert.assertTrue(vehiclesPage.registeredTransmission.isDisplayed());
        Assert.assertTrue(vehiclesPage.registeredFuelType.isDisplayed());
        Assert.assertTrue(vehiclesPage.registeredCo2.isDisplayed());
        Assert.assertTrue(vehiclesPage.registeredHorsePower.isDisplayed());
        Assert.assertTrue(vehiclesPage.registeredHorsePowerTax.isDisplayed());
        Assert.assertTrue(vehiclesPage.registeredPower.isDisplayed());
    }
    @Then("form should be ready to be edited when user clicks Edit")
    public void form_should_be_ready_to_be_edited_when_user_clicks_edit() {
        vehiclesPage.editButton.click();
        BrowserUtils.waitForVisibility(vehiclesPage.modelInputBox, 10);
        Assert.assertTrue(vehiclesPage.modelInputBox.isDisplayed());
        Assert.assertTrue(vehiclesPage.licensePlateInputBox.isDisplayed());
        Assert.assertTrue(vehiclesPage.carTypeInputBox.isDisplayed());
        Assert.assertTrue(vehiclesPage.driverInputBox.isDisplayed());
        Assert.assertTrue(vehiclesPage.locationInputBox.isDisplayed());
        Assert.assertTrue(vehiclesPage.chassisInputBox.isDisplayed());
        Assert.assertTrue(vehiclesPage.modelYearInputBox.isDisplayed());
        Assert.assertTrue(vehiclesPage.odometerInputBox.isDisplayed());
        Assert.assertTrue(vehiclesPage.immatriculationInputBox.isDisplayed());
        Assert.assertTrue(vehiclesPage.carValueInputBox.isDisplayed());
        Assert.assertTrue(vehiclesPage.residualValueInputBox.isDisplayed());
        Assert.assertTrue(vehiclesPage.seatsInputBox.isDisplayed());
        Assert.assertTrue(vehiclesPage.doorsInputBox.isDisplayed());
        Assert.assertTrue(vehiclesPage.colorInputBox.isDisplayed());
        Assert.assertTrue(vehiclesPage.transmissionSelect.isDisplayed());
        Assert.assertTrue(vehiclesPage.fuelTypeSelect.isDisplayed());
        Assert.assertTrue(vehiclesPage.co2InputBox.isDisplayed());
        Assert.assertTrue(vehiclesPage.horsePowerInputBox.isDisplayed());
        Assert.assertTrue(vehiclesPage.horsePowerTaxInputBox.isDisplayed());
        Assert.assertTrue(vehiclesPage.powerInputBox.isDisplayed());
    }

    @When("user enters string for number of seats and doors")
    public void user_enters_string_for_number_of_seats_and_doors() {
        vehiclesPage.seatsInputBox.sendKeys(faker.bothify("????#"));
        vehiclesPage.doorsInputBox.sendKeys(faker.bothify("????#"));
        vehiclesPage.colorInputBox.sendKeys(faker.color().name());
    }
    @Then("user should see The following fields are invalid notification for seats and doors")
    public void user_should_see_the_following_fields_are_invalid_notification_for_seats_and_doors() {
        Assert.assertTrue(vehiclesPage.notificationTitle.isDisplayed());
        Assert.assertTrue(vehiclesPage.seatsNumberError.isDisplayed());
        Assert.assertTrue(vehiclesPage.doorsNumberError.isDisplayed());
    }



}
