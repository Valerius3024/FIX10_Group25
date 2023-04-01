package fidexio.pages;

import fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FuelLogPage {

    public FuelLogPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "a[data-menu='147']")
    public WebElement vehiclesFuelLogsButton;

    @FindBy(css = "button.btn.btn-primary.btn-sm.o_list_button_add")
    public WebElement vehiclesFuelLogsCreateButton;

    @FindBy(css = "button.btn.btn-default.btn-sm.o_form_button_create")
    public WebElement afterSaveCreateButton;

    @FindBy(css = "button.btn.btn-primary.btn-sm.o_form_button_save")
    public WebElement vehiclesFuelLogsSaveButton;

    @FindBy(css = "button.btn.btn-default.btn-sm.o_form_button_cancel")
    public WebElement vehiclesFuelLogsDiscardButton;

    @FindBy(css = "button.btn.btn-primary.btn-sm.o_form_button_edit")
    public WebElement vehiclesFuelLogsEditButton;

    @FindBy(xpath = "(//table[1]/tbody/tr[2]/td[1]/label)[1]")
    public WebElement vehicleLabel;

    @FindBy(css = "input.o_input.ui-autocomplete-input")
    public WebElement vehicleInputBox;

    @FindBy(xpath = "//ul[@id='ui-id-3']//li//a")
    public WebElement vehicleSelectFirst;

    @FindBy(css = "h4.modal-title")
    public WebElement createVehiclePopUp;

    @FindBy(xpath = "//button[normalize-space(text())='Action']")
    public WebElement actionDropDown;

    @FindBy(xpath = "//a[normalize-space(text())='Delete']")
    public WebElement actionDropDownDeleteButton;

    @FindBy(css = "label.o_form_label.o_field_invalid")
    public WebElement odometerLabelInvalid;

    // @FindBy(css = "input#o_field_input_392")
    @FindBy(xpath = "//input[@name='odometer']")

    public WebElement odometerInputBox;

    @FindBy(xpath = "//span[@name='odometer']")
    public WebElement odometerSavedInput;

    @FindBy(xpath = "//button[.='Ok']")
    public WebElement deleteOkButton;

    @FindBy(xpath = "//table[1]/tbody/tr[2]/td[2]//a")
    public WebElement detailInfoLabel;

    @FindBy(css = "input.o_field_float.o_field_number.o_field_widget.o_input")
    public WebElement literFieldBox;

    public String vehicleLabelInvalid = "o_form_label o_required_modifier o_field_invalid";

    public String vehicleNameSaved;

}
