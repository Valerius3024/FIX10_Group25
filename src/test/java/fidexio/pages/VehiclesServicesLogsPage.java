package fidexio.pages;

import fidexio.utilities.BrowserUtils;
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
    @FindBy(id = "o_field_input_756")
    public WebElement totalPriceBox;

    @FindBy(id = "o_field_input_757")
    public WebElement odometerBox;

    @FindBy(id = "o_field_input_764")
    public WebElement notesField;

    @FindBy(xpath = "//li[@class=\"ui-menu-item\"]")
    public WebElement vehicleList;

    @FindBy(xpath = "//li[.='Tax roll']")
    public WebElement taxRoll;

    @FindBy(xpath = "//button[.='Ok']")
    public WebElement okBtn;

    @FindBy(xpath = "//th[.='Date']")
    public WebElement dateBtn;
    public void deleteLog() throws InterruptedException {
        dateBtn.click();
        Thread.sleep(3000);
        dateBtn.click();
        Thread.sleep(3000);
        newLogCheckBox.click();
        Thread.sleep(5000);
        actionBtn.click();
        Thread.sleep(3000);
        deleteBtn.click();
        Thread.sleep(3000);
        okBtn.click();
    }


}
