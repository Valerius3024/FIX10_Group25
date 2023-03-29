package fidexio.pages;

import fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SurveysPage {

    public SurveysPage() {PageFactory.initElements(Driver.getDriver(), this);}

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
    public WebElement attachmentButton;
    public WebElement actionButton;
    public WebElement testSurveyButton;
    public WebElement printSurveyButton;
    public WebElement shareAndInviteByEmailButton;
    public WebElement viewResultButton;
    public WebElement addAnItemButton;
    public WebElement optionsTabButton;
    public WebElement userCanComeBackInThePreviousPageCheckbox	;
    public WebElement loginRequiredCheckbox;
    public WebElement surveyCreatedMessage;
    public WebElement surveyNameBoxUnderSurveysTab;






}
