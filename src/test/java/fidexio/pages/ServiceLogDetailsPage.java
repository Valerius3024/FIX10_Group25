package fidexio.pages;

import fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServiceLogDetailsPage {
    public ServiceLogDetailsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name = "vehicle_id")
    public WebElement vehicleField;

    @FindBy(name = "cost_subtype_id")
    public WebElement serviceTypeField;

    @FindBy(name = "amount")
    public WebElement totalPriceField;

    @FindBy(xpath = "//span[@name=\"odometer\"]")
    public WebElement odometerField;
}
