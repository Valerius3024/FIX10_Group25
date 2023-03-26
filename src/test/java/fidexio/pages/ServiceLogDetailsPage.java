package fidexio.pages;

import fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServiceLogDetailsPage {
    public ServiceLogDetailsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@id='o_field_input_754']")
    public WebElement vehicleField;

    @FindBy(xpath = "//a[@id='o_field_input_755']")
    public WebElement serviceTypeField;

    @FindBy(xpath = "//span[@name=\"amount\"]")
    public WebElement totalPriceField;

    @FindBy(xpath = "//span[@name=\"odometer\"]")
    public WebElement odometerField;
}
