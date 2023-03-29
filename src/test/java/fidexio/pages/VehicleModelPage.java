package fidexio.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleModelPage {


    @FindBy(xpath = "//*[contains(text(),'Vehicle Model')]")
    public WebElement VehicleModelButton;

    @FindBy(css = "input[placeholder*='Model']")
    public WebElement modelNameBox;

    @FindBy(css = "input[placeholder*='T']")
    public WebElement makeBox;

    @FindBy(css = "span[class*='select']")
    public WebElement imageUpload;

    @FindBy(css = "button[class$='save']")
    public WebElement saveButton;







}
