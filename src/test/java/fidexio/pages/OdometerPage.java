package fidexio.pages;


import fidexio.utilities.Driver;
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
     @FindBy(id = "o_field_input_2081" )
    public WebElement userEnterVehicleSelectInputBox;


    public OdometerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

 @FindBy(css = "a[data-menu='140']")
    public WebElement userClicksVehiclesOdometerButton;
}

