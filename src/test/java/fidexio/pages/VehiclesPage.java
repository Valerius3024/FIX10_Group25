package fidexio.pages;

import com.github.javafaker.Faker;
import fidexio.step_definitions.Vehicles_StepDefinitions;
import fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class VehiclesPage {

    public VehiclesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    public WebElement createButton;

    @FindBy(css = "button.btn.btn-primary.btn-sm.o_form_button_save")
    public WebElement saveButton;

    @FindBy(css = "button.btn.btn-default.btn-sm.o_form_button_cancel")
    public WebElement discardButton;

    @FindBy(css = "button.btn.btn-primary.btn-sm.o_form_button_edit")
    public WebElement editButton;

    @FindBy(xpath = "(//div[@class='o_input_dropdown']/input)[1]")
    public WebElement modelInputBox;

    @FindBy(xpath = "//a[contains(text(),'Acura')]")
    public WebElement carModelOption;

    @FindBy(css = "input[name='license_plate']")
    public WebElement licensePlateInputBox;

    @FindBy(xpath = "(//div[@class='o_input_dropdown'])[2]/input")
    public WebElement carTypeInputBox;

    @FindBy(xpath = "//a[contains(text(),'Employee')]")
    public WebElement carTypeOption;

//////////////////////////////////////////////////////////////////////////////////

    @FindBy(xpath = "(//div[@class='o_input_dropdown'])[3]/input")
    public WebElement driverInputBox;

    @FindBy(xpath = "(//a[contains(text(),'Plaines')])[1]")
    public WebElement driverOption;

    @FindBy(xpath = "//span[.='Create']")
    public WebElement createNewDriver;

    @FindBy(css = "input[name='name']")
    public WebElement newDriverName;

    @FindBy(xpath = "(//button[contains(text(),'Create')])[2]")
    public WebElement createNewDriverSecondButton;

    @FindBy(xpath = "(//input[@name='name'])[2]")
    public WebElement newDriverContactName;

    @FindBy(xpath = "//span[contains(text(),'Close')]")
    public WebElement newDriverSaveAndClose;

    @FindBy(xpath = "//span[.='Save']")
    public WebElement newDriverSave;

    @FindBy(xpath = "//input[@name='location']")
    public WebElement locationInputBox;

    @FindBy(xpath = "//input[@name='vin_sn']")
    public WebElement chassisInputBox;

    @FindBy(css = "input[name='model_year']")
    public WebElement modelYearInputBox;

    @FindBy(css = "input[name='odometer']")
    public WebElement odometerInputBox;

    @FindBy(css = "input[name='acquisition_date']")
    public WebElement immatriculationInputBox;

    @FindBy(css = "input[name='car_value']")
    public WebElement carValueInputBox;

    @FindBy(css = "input[name='residual_value']")
    public WebElement residualValueInputBox;

//////////////////////////////////////////////////////////////////////////////////

    @FindBy(css = "input[name='seats']")
    public WebElement seatsInputBox;

    @FindBy(css = "input[name='doors']")
    public WebElement doorsInputBox;

    @FindBy(css = "input[name='color']")
    public WebElement colorInputBox;

    @FindBy(css = "select[name='transmission']")
    public WebElement transmissionSelect;

    @FindBy(css = "select[name='fuel_type']")
    public WebElement fuelTypeSelect;

    @FindBy(css = "input[name='co2']")
    public WebElement co2InputBox;

    @FindBy(css = "input[name='horsepower']")
    public WebElement horsePowerInputBox;

    @FindBy(css = "input[name='horsepower_tax']")
    public WebElement horsePowerTaxInputBox;

    @FindBy(css = "input[name='power']")
    public WebElement powerInputBox;


    public void selectTransmissionType() {
    Select select = new Select(transmissionSelect);
    Faker faker = new Faker();
    select.selectByIndex(faker.number().numberBetween(1, 2));
}

    public void selectFuelType() {
        Select select = new Select(fuelTypeSelect);
        Faker faker = new Faker();
        select.selectByIndex(faker.number().numberBetween(1, 4));
    }

//////////////////////////////////////////////////////////////////////////////////

    @FindBy(xpath = "//p[contains(text(),'has been added to the fleet!')]")
    public WebElement addedToFleet;

    @FindBy(css = "a[name='model_id']")
    public WebElement registeredModelId;

    @FindBy(css = "span[name='license_plate']")
    public WebElement registeredLicense;

    @FindBy(className = "o_badge_text")
    public WebElement registeredTag;

    @FindBy(css = "a[name='driver_id']")
    public WebElement registeredDriver;

    @FindBy(css = "span[name='location']")
    public WebElement registeredLocation;

    @FindBy(css = "span[name='vin_sn']")
    public WebElement registeredChassis;

    @FindBy(css = "span[name='model_year']")
    public WebElement registeredModelYear;

    @FindBy(css = "span[name='odometer']")
    public WebElement registeredOdometer;

    @FindBy(css = "span[name='acquisition_date']")
    public WebElement registeredDate;

    @FindBy(css = "span[name='car_value']")
    public WebElement registeredCarValue;

    @FindBy(css = "span[name='residual_value']")
    public WebElement registeredResidualValue;

    @FindBy(css = "span[name='seats']")
    public WebElement registeredSeats;

    @FindBy(css = "span[name='doors']")
    public WebElement registeredDoors;

    @FindBy(css = "span[name='color']")
    public WebElement registeredColor;

    @FindBy(css = "span[name='transmission']")
    public WebElement registeredTransmission;

    @FindBy(css = "span[name='fuel_type']")
    public WebElement registeredFuelType;

    @FindBy(css = "span[name='co2']")
    public WebElement registeredCo2;

    @FindBy(css = "span[name='horsepower']")
    public WebElement registeredHorsePower;

    @FindBy(css = "span[name='horsepower_tax']")
    public WebElement registeredHorsePowerTax;

    @FindBy(css = "span[name='power']")
    public WebElement registeredPower;

//////////////////////////////////////////////////////////////////////////////////

    @FindBy(xpath = "//div[@class='o_notification_title']/span")
    public WebElement notificationTitle;

    @FindBy(className = "modal-title")
    public WebElement createNewModelTitle;

    @FindBy(css = "button[aria-label='Next']")
    public WebElement nextPageButton;

    @FindBy(xpath = "//a[.='Vehicles']")
    public WebElement backToVehiclesButton;

    @FindBy(xpath = "//div[@class='o_kanban_view o_kanban_ungrouped']//span[text()]")
    public List<WebElement> vehiclesResults;

    @FindBy(xpath = "//div[@class='o_kanban_view o_kanban_ungrouped']//span[text()]")
    public WebElement singleVehicleResult;

    @FindBy(css = "div.o_loading")
    public WebElement loadingIndicator;

    @FindBy(xpath = "//li[.='Seats Number']")
    public WebElement seatsNumberError;

    @FindBy(xpath = "//li[.='Doors Number']")
    public WebElement doorsNumberError;

    @FindBy(xpath = "//li[.='Model']")
    public WebElement modelError;

    @FindBy(xpath = "//li[.='License Plate']")
    public WebElement plateError;


}
