package fidexio.pages;

import fidexio.utilities.BrowserUtils;
import fidexio.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleCostsPage {
    public VehicleCostsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[contains(text(),'Vehicle Costs')]")
    public WebElement vehicleCostsButton;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy(xpath = "//*[@name='amount']")
    public WebElement totalPrice;

    @FindBy(xpath = "//*[@name='description']")
    public WebElement description;

    @FindBy(xpath = "(//div[@class='o_input_dropdown']/input)[2]")
    public WebElement serviceCostType;

    @FindBy(xpath = "//span[@class='fa fa-caret-right']")
    public WebElement showVehiclesButton;

    @FindBy(xpath = "(//input[@type='checkbox'])[3]")
    public WebElement selectAllCheckbox;

    @FindBy(xpath = "//*[contains(text(),'Action')]")
    public WebElement actionButton;

    @FindBy(xpath = "//*[contains(text(),'Delete')]")
    public WebElement deleteButton;

    @FindBy(xpath = "(//button[@type='button']/span)[5]/..")
    public WebElement okButton;

    @FindBy(xpath = "//tr[@class='o_data_row']")
    public WebElement row;

    public void chooseCostDetailType(String detailType){
        serviceCostType.click();
        BrowserUtils.waitFor(1);

        detailType = detailType.substring(0,1).toUpperCase() + detailType.substring(1).toLowerCase();
        WebElement element = Driver.getDriver().findElement(By.xpath("(//a[.='" + detailType + "'])[1]"));
        element.click();

    }

    public void deleteVehicleCost(){

        BrowserUtils.waitFor(1);
        selectAllCheckbox.click();
        BrowserUtils.waitFor(1);
        actionButton.click();
        BrowserUtils.waitFor(1);
        deleteButton.click();
        BrowserUtils.waitFor(1);
        okButton.click();

    }
}
