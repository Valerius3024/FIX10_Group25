package fidexio.pages;

import fidexio.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.util.List;

public class SalesPage {

    public SalesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@name='email']")
    public WebElement emailInputPrint;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBarInput;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailInput;


    @FindBy(xpath = "//img[@name='image']")
    public WebElement profilImage;

    @FindBy(xpath = "//div[@class='o_address_format']")
    public List<WebElement> addressCard;


    @FindBy(css = "button[accesskey='a']")
    public WebElement editButton;


    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement deleteCustomerConfirmationButton;

    @FindBy(xpath = "//button[contains(text(),'Action')]")
    public WebElement actionDropdown;

    @FindBy(xpath = "//a[contains(text(),'Delete')]")
    public WebElement deleteCustomerButton;

    @FindBy(xpath ="//h1/span[@name='name']")
    public WebElement customerNameText;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameInput;

    @FindBy(xpath = "//a[@data-menu='447']")
    public WebElement CustomersLink;

    @FindBy(css = "button[accesskey='c']")
    public WebElement createButton;

    @FindBy(css = "button[accesskey='s']")
    public WebElement saveButton;

    @FindBy(xpath = "(//input[@type='file'])[2]")
    public WebElement imageLoad;

    @FindBy(css = "span[class*='pull-right']")
    public WebElement imageDelete;

    @FindBy(css = "input[id$='person']")
    public WebElement individualRadio;


    @FindBy(css = "input[id$='company']")
    public WebElement companyRadio;

    @FindBy(css = "button[class$='cancel']")
    public WebElement discardButton;

    @FindBy(css = "input[id$='526']")
    public WebElement streetInput;

    @FindBy(css = "input[id$='527']")
    public WebElement streetInput2;

    @FindBy(css = "input[id$='528']")
    public WebElement cityInput;

    @FindBy(css = "input[id$='529']")
    public WebElement stateInput;

    @FindBy(css = "input[id$='530']")
    public WebElement zipInput;

    @FindBy(xpath = "//button[contains(@class, 'o-kanban-button-new')]")
    public WebElement contactCreateButton;

    public WebElement locatingElementByText(String text){
        String xpathLocator="//*[contains(text(),'"+text+"')]";

        return Driver.getDriver().findElement(By.xpath(xpathLocator));
    }


}
