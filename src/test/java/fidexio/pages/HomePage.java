package fidexio.pages;

import fidexio.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//a[@class='oe_menu_leaf']")
    public WebElement discussButton;

    @FindBy(css = "a[data-menu='120']")
    public WebElement calenderButton;

    @FindBy(css = "a[data-menu='194']")
    public WebElement notesButton;

    @FindBy(css = "a[data-menu='68']")
    public WebElement contactsButton;

    @FindBy(css = "a[data-menu='261']")
    public WebElement crmButton;

    @FindBy(css = "a[data-menu='445']")
    public WebElement salesButton;

    @FindBy(css = "a[data-menu='382']")
    public WebElement websiteButton;

    @FindBy(css = "a[data-menu='484']")
    public WebElement pointOfSaleButton;

    @FindBy(css = "a[data-menu='504']")
    public WebElement purchasesButton;

    @FindBy(css = "a[data-menu='347']")
    public WebElement inventoryButton;

    @FindBy(css = "a[data-menu='535']")
    public WebElement repairsButton;

    @FindBy(css = "a[data-menu='199']")
    public WebElement invoicingButton;

    @FindBy(css = "div[class$='active']")
    public WebElement inboxButton;

    @FindBy(css = "div[class*='starred']")
    public WebElement starredButton;

    @FindBy(css = "i[class$='fa-clock-o']")
    public WebElement clockButton;

    @FindBy(css = "i[class$='fa-comments']")
    public WebElement commentsButton;

    @FindBy(css = "input[class='o_searchview_input']")
    public WebElement searchBox;

    @FindBy(xpath = "//a[.//span[@class='oe_topbar_name']]")
    public WebElement profileName;

    @FindBy(xpath = "//a[@data-menu='documentation']")
    public WebElement documentationButton;

    @FindBy(xpath = "//a[@data-menu='support']")
    public WebElement supportButton;

    @FindBy(xpath = "//a[.='Preferences']")
    public WebElement preferencesButton;

    @FindBy(xpath = "//a[.='My Odoo.com account']")
    public WebElement myOdooAccountButton;

    @FindBy(xpath = "//a[.='Log out']")
    public WebElement logoutButton;

    @FindBy(xpath = "//div[@class='modal-content']")
    public WebElement error;

    @FindBy(xpath = "(//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder'])/li[@style='display: block;']")
    public List<WebElement> allComponents;

    @FindBy(css = "a[data-menu='415']")
    public WebElement manufacturingButton;

    @FindBy(css = "a[data-menu='535']")
    public WebElement repairButton;

    @FindBy(css = "li[id$='container'] a[data-toggle='dropdown']")
    public WebElement moreDropdown;

    @FindBy(css = "a[data-menu='157']")
    public WebElement employeesButton;

    @FindBy(css = "a[data-menu='281']")
    public WebElement attendancesButton;

    @FindBy(css = "a[data-menu='295']")
    public WebElement leavesButton;

    @FindBy(css = "a[data-menu='388']")
    public WebElement expensesButton;

    @FindBy(css = "a[data-menu='165']")
    public WebElement maintenanceButton;

    @FindBy(css = "a[data-menu='134']")
    public WebElement fleetButton;

    public  void navigateToThisModule(String moduleName){
        moduleName = moduleName.substring(0,1).toUpperCase() + moduleName.substring(1).toLowerCase();
        WebElement module = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'"+moduleName+"')]"));

        if(moreDropdown.isDisplayed()){
            moreDropdown.click();
            module.click();
        }else
        module.click();
    }

}
