package fidexio.pages;

import fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesPage {

    public SalesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@data-menu='447']")
    public WebElement CustomersLink;

@FindBy(css = "button[accesskey='c']")
    public WebElement createButton;

    @FindBy(css = "button[accesskey='s']")
    public WebElement saveButton;

    @FindBy(css = "span[class*='select']")
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


    
    



}
