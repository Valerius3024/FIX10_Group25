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
}
