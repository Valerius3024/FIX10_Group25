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
        homePage.fleetButton.click();
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
    }
    @When("user fills all the fields in general properties")
    public void user_fills_all_the_fields_in_general_properties() {
        BrowserUtils.waitForClickablility(vehiclesPage.locationInputBox, 10);
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

    @Then("user should see The following fields are invalid notification")
    public void user_should_see_the_following_fields_are_invalid_notification() {
        Assert.assertTrue(vehiclesPage.notificationTitle.isDisplayed());
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






}
