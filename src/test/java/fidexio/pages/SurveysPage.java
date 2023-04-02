package fidexio.pages;

import fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SurveysPage {

    public SurveysPage() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//button[.='Design Survey']")
    public WebElement designSurveyButton;
    @FindBy(xpath = "//a[@class='btn btn-primary btn-lg']")
    public WebElement startSurveyButton;
    @FindBy(tagName = "h1")
    public WebElement surveyNotReadyWarning;
    @FindBy(xpath = "//a[@class='btn btn-default']")
    public WebElement backToSurveyButton;
    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement surveyTitleBox;
    @FindBy(xpath = "//button[normalize-space(text())='Save']")
    public WebElement saveSurveyButton;
    @FindBy(xpath = "//button[normalize-space(text())='Discard']")
    public WebElement discardSurveyButton;
    @FindBy(xpath = "//button[normalize-space(text())='Edit']")
    public WebElement editSurveyButton;
    @FindBy(xpath = "//button[normalize-space(text())='Create']")
    public WebElement createSurveyButton;
    @FindBy(xpath = "//button[normalize-space(text())='Attachment(s)']")
    public WebElement surveyAttachmentButton;
    @FindBy(xpath = "//button[normalize-space(text())='Action']")
    public WebElement surveyActionButton;
    @FindBy(xpath = "//button[normalize-space(text())='Test Survey']")
    public WebElement testSurveyButton;
    @FindBy(xpath = "//button[normalize-space(text())='Print Survey']")
    public WebElement printSurveyButton;
    @FindBy(xpath = "//button[normalize-space(text())='Share and invite by email']")
    public WebElement surveyShareAndInviteByEmailButton;
    @FindBy(xpath = "//button[@class='btn btn-sm btn-default'][.='View results']")
    public WebElement surveyViewResultButton;
    @FindBy(xpath = "//td[@colspan='3']")
    public WebElement surveyAddAnItemButtonIsNotThere;
    @FindBy(xpath = "//a[.='Options']")
    public WebElement surveyOptionsTabButton;
    @FindBy(xpath = "(//div[@class='o_field_boolean o_field_widget o_checkbox']//input)[1]")
    public WebElement surveyUserCanComeBackInThePreviousPageCheckbox;
    @FindBy(xpath = "(//div[@class='o_field_boolean o_field_widget o_checkbox']//input)[2]")
    public WebElement surveyLoginRequiredCheckbox;
    @FindBy(xpath = "//div[@class='o_thread_message_content']//p")
    public WebElement surveyCreatedMessage;
    @FindBy(xpath = "//a[@class='o_column_archive']")
    public WebElement surveyArchiveButton;


}
