package fidexio.pages;

import fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {
    public InventoryPage () { PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//*[contains(text(),'Inventory')]")
    public WebElement inventoryButton;

    @FindBy(xpath = "(//span[contains(text(),'Product')])[7]/..")
    public WebElement productsButton;

    @FindBy(xpath = "//*[contains(text(),'Create')]")
    public WebElement createButton;

    @FindBy(xpath= "//*[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement enterProductName;

    @FindBy(xpath = "(//*[@class='btn btn-primary btn-sm o_form_button_save'])")
    public WebElement saveButton;
    //xpath = "(//*[contains(text(),'Save')])[1]/.."
    //(//*[@class='btn btn-primary btn-sm o_form_button_save'])

    @FindBy(xpath = "//*[contains(text(),'Ok')]")
    public WebElement okButtonAfterSava;

   @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBox;

   @FindBy(xpath = "//div[@class='oe_kanban_details']")
    public WebElement productFile;

   @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_edit']")
    public WebElement editButton;

   @FindBy(xpath = "//span[@class='fa fa-pencil fa-lg pull-left o_select_file_button']")
    public WebElement profileEditButton;

   @FindBy(xpath = "(//input[@type='file'])[2]")
   public WebElement fotoFile;

   @FindBy(css = "span[class*='fa fa-trash-o fa-lg pull-right o_clear_file_button']")
   public WebElement deleteFoto;

   @FindBy(xpath = "(//input[contains(@id,'o_field_input') and @type='checkbox'])[2]")
    public WebElement canBESold;

    @FindBy(xpath = "(//input[contains(@id,'o_field_input') and @type='checkbox'])[3]")
    public WebElement canBePurchased;

    @FindBy(xpath = "(//*[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[3]")
    public WebElement actionButton;


    @FindBy(xpath = "//*[contains(text(),'Delete')]")
    public WebElement deleteButton;

    @FindBy(xpath = "(//*[@class='btn btn-sm btn-primary'])")
    public WebElement okButtonAfterDelete;

    @FindBy(xpath = "(//*[@class='o_field_char o_field_widget o_required_modifier'])")
    public WebElement information;

    @FindBy(xpath = "(//*[@class='o_input'])[2]")
    public WebElement costNumber;

    @FindBy(xpath = "(//*[@class='o_field_monetary o_field_number o_field_widget'])[2]")
    public WebElement costNumberDisplayed;

    @FindBy(xpath = "(//*[@class='oe_kanban_details'])")
    public WebElement verifyProduct;







}
