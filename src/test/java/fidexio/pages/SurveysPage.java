package fidexio.pages;

import fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SurveysPage {

    public SurveysPage() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(tagName = "h1")
    public WebElement surveyTitleBox;
    @FindBy(xpath = "//button[normalize-space(text())='Save']")
    public WebElement saveSurveyButton;
    public WebElement discardButton;
    public WebElement editButton;
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
