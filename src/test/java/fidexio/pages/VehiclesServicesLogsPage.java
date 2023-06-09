package fidexio.pages;

import fidexio.utilities.BrowserUtils;
import fidexio.utilities.Driver;
import org.openqa.selenium.By;
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

    @FindBy(xpath = "(//div[@class='o_input_dropdown']/input)[1]")
    public WebElement vehicleBox;

    @FindBy(xpath = "(//div[@class='o_input_dropdown']/input)[2]")
    public WebElement serviceTypeBox;

    @FindBy(xpath = "//td[.='delete']")
    public WebElement newLog;

    @FindBy(xpath = "//td[.='delete']/preceding-sibling::td[7]")
    public WebElement newLogCheckBox;

    @FindBy(xpath = "(//div[@class='btn-group o_dropdown'])[2]")
    public WebElement actionBtn;

    @FindBy(xpath = "//a[@data-index='1']")
    public WebElement deleteBtn;
    @FindBy(xpath = "//input[@name='amount']")
    public WebElement totalPriceBox;

    @FindBy(name="odometer")
    public WebElement odometerBox;

    @FindBy(name = "notes")
    public WebElement notesField;

    @FindBy(xpath = "//li[@class=\"ui-menu-item\"]")
    public WebElement vehicleList;

    @FindBy(xpath = "//li[.='Tax roll']")
    public WebElement taxRoll;

    @FindBy(xpath = "//button[.='Ok']")
    public WebElement okBtn;

    @FindBy(xpath = "//th[.='Date']")
    public WebElement dateBtn;

    @FindBy(xpath = "//div[@class='o_notification undefined o_error']")
    public WebElement errorMessage;


    public void deleteLog() {
        FleetPage fleetPage = new FleetPage();
        fleetPage.vehiclesServicesLogs.click();
        dateBtn.click();
        BrowserUtils.waitFor(2);
        dateBtn.click();
        BrowserUtils.waitFor(2);
        newLogCheckBox.click();
        BrowserUtils.waitFor(2);
        actionBtn.click();
        BrowserUtils.waitFor(2);
        deleteBtn.click();
        BrowserUtils.waitFor(2);
        okBtn.click();
    }

    public void serviceType(String type){
        String locator="//li[.='"+type+"']";
        Driver.getDriver().findElement(By.xpath(locator)).click();
    }


}
