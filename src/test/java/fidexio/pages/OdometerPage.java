package fidexio.pages;


import com.fasterxml.jackson.core.JsonParser;
import fidexio.step_definitions.FuelLogStepDefinitions;
import fidexio.utilities.Driver;

import io.github.bonigarcia.wdm.cache.ResolutionCache;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

public class OdometerPage {



    // input[@class='o_input ui-autocomplete-input']
    @FindBy(css = "button[accesskey='c']")
    public WebElement userClicksCreateButton;
    @FindBy(xpath = "(//div[@class='o_input_dropdown']/input)[2]")
    public WebElement vehicleBox;


    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;
    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement vehiclesOdometerCreateButton;

    @FindBy(xpath = "//ul[@ id='ui-id-3']//li")
    public WebElement userSelectFirstFromDropdown;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement userClickSaveButton;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_edit']")
    public WebElement userClickEditButton;

    @FindBy(xpath = "//button[.='Ok']")
    public WebElement userClickOkButton;

@FindBy(xpath ="(//td[@style='width: 100%;'])[2]/input")
             public WebElement OdometerValueInputBox;


  @FindBy(name = "notes")
    public WebElement notesField;


   @FindBy(xpath = "(//td[@style='width: 100%;'])[2]/input")
    public WebElement odometerInputBox;


    public OdometerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "a[data-menu='140']")
    public WebElement userClicksVehiclesOdometerButton;


     @FindBy(css = "button.btn.btn-primary.btn-sm.o_list_button_add")
    public WebElement createOdometerButton;

    @FindBy(xpath = "//div[@class='o_notification undefined o_error']")
    public WebElement userShouldSeeItIsInvalidInputBox;
 @FindBy(css = "button.btn.btn-primary.btn-sm.o_form_button_save")
     public WebElement userClicksOdometerSaveButton;
    @FindBy(xpath = "//input[@class='o_input ui-autocomplete-input']")
    public WebElement userEnterVehicleSelectInputBox;
       @FindBy(xpath = "//input[@class='o_input ui-autocomplete-input']")
    public WebElement vehicleInputBox;

    @FindBy(css = "btn btn-primary btn-sm o_form_button_edit")
    public WebElement vehiclesOdometerEditButton;


    @FindBy(xpath = "//a[.='Bmw/520ES/01adana01']")
    public WebElement Bmw;
    public long vehicleNameSaved;

    @FindBy(xpath = "o_group o_inner_group")
    public WebElement detailInfoLabel;

    @FindBy(xpath = "btn btn-default btn-sm o_form_button_create")
    public WebElement userVerifiesCreateAndButtonIsSeen;


    @FindBy(xpath = "btn btn-primary btn-sm o_form_button_edit")
    public WebElement vehiclesOdemeterEditButton;

    @FindBy(css = "button.btn.btn-default.btn-sm.o_form_button_cancel")
    public WebElement user_click_discard_button;


    @FindBy(css = "button.btn btn-primary btn-sm o_form_button_edit")
    public WebElement vehiclesFuelLogsDiscardButton;



}