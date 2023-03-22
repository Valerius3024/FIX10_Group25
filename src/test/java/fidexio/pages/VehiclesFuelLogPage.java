package fidexio.pages;

import fidexio.utilities.Driver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesFuelLogPage {

    public VehiclesFuelLogPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
