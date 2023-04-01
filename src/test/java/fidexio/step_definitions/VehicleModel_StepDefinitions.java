package fidexio.step_definitions;

import fidexio.pages.VehicleModelPage;
import fidexio.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VehicleModel_StepDefinitions {
    VehicleModelPage vehicleModelPage = new VehicleModelPage();
    //String path = "/Users/a.mesut.dal/Desktop/HTML Class/Used-1967-Ford-Mustang-Shelby-GT500.jpg";
    @Then("user clicks Vehicle Model button")
    public void user_clicks_vehicle_model_button() {
        vehicleModelPage.VehicleModelButton.click();
    }

    @And("User clicks the create button")
    public void userClicksTheCreateButton() {
        vehicleModelPage.createButton.click();
    }
    @When("user enters {string} model name")
    public void user_enters_model_name(String model) {
        vehicleModelPage.modelNameBox.sendKeys(model);
    }
    @When("user enters {string} brand name")
    public void user_enters_brand_name(String brand) {
        vehicleModelPage.makeBox.click();
        vehicleModelPage.createAndEditButton.click();
        vehicleModelPage.searchBox.sendKeys(brand);
        vehicleModelPage.saveBrand.click();
    }

    @And("user clicks the save button")
    public void userClicksTheSaveButton() {
        vehicleModelPage.saveButton.click();
    }
    @Then("User see the new vehicle model")
    public void user_see_the_new_vehicle_model() {
        BrowserUtils.waitFor(3);
        BrowserUtils.verifyTitle("Mustang/Shelby 1967 - Odoo");
        vehicleModelPage.deleteVehicleModel();
    }


    @Then("user should see Edit and Create buttons")
    public void userShouldSeeEditAndCreateButton() {
        vehicleModelPage.editButton.isDisplayed();
        vehicleModelPage.newCreateButton.isDisplayed();
    }

    @Then("user should see everything as editable")
    public void userShouldSeeEverythingAsEditable() {
        vehicleModelPage.modelNameBox.isDisplayed();
        vehicleModelPage.makeBox.isDisplayed();
        vehicleModelPage.saveButton.isDisplayed();
        vehicleModelPage.clearVehicleModel();
    }

    /*
    @When("user adds the vehicle model image")
    public void user_adds_the_vehicle_model_image() {
        vehicleModelPage.imageUpload.sendKeys(path);
    }

 */
}
