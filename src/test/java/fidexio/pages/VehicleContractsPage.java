package fidexio.pages;

import fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehicleContractsPage {
    public VehicleContractsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[contains(text(),'Vehicles Contracts')]")
    public WebElement vehiclesContractsButton;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy(xpath = "(//div[@class='o_input_dropdown']/input)[1]")
    public WebElement vehicleInputBox;

    @FindBy(xpath = "(//div[@class='o_input_dropdown']/input)[2]")
    public WebElement typeInputBox;

    @FindBy(xpath = "(//td[@style='width: 100%;'])[4]/input")
    public WebElement activationCostInputBox;

    @FindBy(xpath = "(//td[@style='width: 100%;'])[5]/div/select")
    public WebElement recurringCostDropdown;

    @FindBy(xpath = "(//button[@type='button']/span)[5]/..")
    public WebElement okButton;

    @FindBy(xpath = "(//td[@style='width: 100%;'])[5]/div/select/../input")
    public WebElement recurringCostInputBox;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy(xpath = "//a[.='Mercedes/Class A/1-MER-001']")
    public WebElement mercedes;

    @FindBy(xpath = "//tr[@class='o_data_row']")
    public WebElement row;

    @FindBy(xpath = "(//input[@type='checkbox'])[4]")
    public WebElement checkbox;

    @FindBy(xpath = "//*[contains(text(),'Action')]")
    public WebElement actionButton;

    @FindBy(xpath = "//*[contains(text(),'Delete')]")
    public WebElement deleteButton;

    @FindBy(xpath = "//div[@class='o_notification undefined o_error']")
    public WebElement error;

    @FindBy(xpath = "//div[@class='modal-content']")
    public WebElement createAVehiclePopup;

    @FindBy(xpath = "//a[@name='vehicle_id']")
    public WebElement vehicleName;

    @FindBy(xpath = "//a[@name='cost_subtype_id']")
    public WebElement costType;

    @FindBy(xpath = "//*[@name='amount']")
    public WebElement activationCost;

    @FindBy(xpath = "//*[@name='cost_generated']")
    public WebElement recurringCostAmount;

    @FindBy(xpath = "//*[@name='cost_frequency']")
    public WebElement recurringCostFrequency;

    @FindBy(xpath = "(//table[@class='o_group o_inner_group o_group_col_6'])[1]//td[@style='width: 100%;']")
    public List<WebElement> contractDetailsList;

    @FindBy(xpath = "(//*[.='Contract details'])[2]")
    public WebElement contractDetails;










}
