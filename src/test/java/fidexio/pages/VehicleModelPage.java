package fidexio.pages;

import fidexio.utilities.BrowserUtils;
import fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleModelPage {

    public VehicleModelPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(css = "a[data-menu='136'] span[class='oe_menu_text']")
    public WebElement VehicleModelButton;

    @FindBy(css = "button[class$='add']")
    public WebElement createButton;

    @FindBy(css = "input[class$='modifier']")
    public WebElement modelNameBox;

    @FindBy(css = "input[class$='ui-autocomplete-input']")
    public WebElement makeBox;

    @FindBy(xpath = "//li[.='Create and Edit...']")
    public WebElement createAndEditButton;

    @FindBy(css = "html > body > div:nth-of-type(5) > div > div > div:nth-of-type(2) > div > div > table > tbody > tr > td > div > h1 > input")
    public WebElement searchBox;

    @FindBy(xpath = "//span[.='Save']")
    public WebElement saveBrand;
/*
    @FindBy(xpath = "(//div/span)[8]")
    public WebElement imageUpload;

 */

    @FindBy(css = "button[class$='save']")
    public WebElement saveButton;

    @FindBy(css = "button[class$='edit']")
    public WebElement editButton;

    @FindBy(css = "button[accesskey='c']")
    public WebElement newCreateButton;

    @FindBy(xpath = "//th[.='Mustang (1)']")
    public WebElement findVehicleModel;

    @FindBy(xpath = "(//input[@type='checkbox'])[4]")
    public WebElement checkboxVehicleModel;

    @FindBy(xpath = "//*[contains(text(),'Action')]")
    public WebElement action;

    @FindBy(xpath = "//*[contains(text(),'Delete')]")
    public WebElement deleteButton;

    @FindBy(xpath = "//button[.='Ok']")
    public WebElement confirmOkButton;

    public void deleteVehicleModel(){
        BrowserUtils.waitForVisibility(action,5);
        action.click();

        BrowserUtils.waitForVisibility(deleteButton,5);
        deleteButton.click();

        BrowserUtils.waitForVisibility(confirmOkButton,5);
        confirmOkButton.click();


    }

    public void clearVehicleModel(){
        BrowserUtils.waitFor(3);
        VehicleModelButton.click();

        if (findVehicleModel.isDisplayed()){
            BrowserUtils.waitFor(3);
            findVehicleModel.click();

            BrowserUtils.waitForVisibility(checkboxVehicleModel,5);
            checkboxVehicleModel.click();

            BrowserUtils.waitForVisibility(action,5);
            action.click();

            BrowserUtils.waitForVisibility(deleteButton,5);
            deleteButton.click();

            BrowserUtils.waitForVisibility(confirmOkButton,5);
            confirmOkButton.click();

        }

    }



}
