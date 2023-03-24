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

    @FindBy(css = "button.btn.btn-primary.btn-sm.o_form_button_save")
    public WebElement vehiclesFuelLogsSaveButton;

    @FindBy(css = "button.btn.btn-default.btn-sm.o_form_button_cancel")
    public WebElement vehiclesFuelLogsDiscardButton;

    @FindBy(xpath = "(//table[1]/tbody/tr[2]/td[1]/label)[1]")
    public WebElement vehicleLabel;

    public String vehicleLabelValid = "o_form_label o_required_modifier";
    public String vehicleLabelInvalid = "o_form_label o_required_modifier o_field_invalid";

    @FindBy(css = "input#o_field_input_399")
    public WebElement vehicleInputBox;

    @FindBy(css = "h4.modal-title")
    public WebElement createVehiclePopUp;


}
