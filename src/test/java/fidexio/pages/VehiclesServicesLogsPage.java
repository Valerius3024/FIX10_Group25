package fidexio.pages;

import fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesServicesLogsPage {

    public VehiclesServicesLogsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[contains(.,'Create')]")
    public WebElement createBtn;

    @FindBy(xpath = "//button[contains(.,'Save')]")
    public WebElement saveBtn;

    @FindBy(xpath = "//*[@id=\"o_field_input_2316\"]")
    public WebElement vehicleBox;

    @FindBy(id = "o_field_input_7")
    public WebElement serviceTypeBox;

    @FindBy(id = "o_field_input_8")
    public WebElement totalPriceBox;

    @FindBy(id = "o_field_input_9")
    public WebElement odometerBox;

    @FindBy(id = "o_field_input_16")
    public WebElement notesField;

}
