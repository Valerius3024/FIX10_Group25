package fidexio.pages;

import fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalenderPage {
    public CalenderPage () {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath= "(//div[@class='btn-group btn-group-sm']//button)[2]")
    public WebElement weekText;
    @FindBy(xpath= "(//div[@class='btn-group btn-group-sm']//button)[1]")
    public WebElement dayText;
    @FindBy(xpath= "(//div[@class='btn-group btn-group-sm']//button)[3]")
    public WebElement monthText;
    @FindBy(xpath= "//button[.='Day']")
    public WebElement dayButton;
    @FindBy(xpath= "//button[.='Week']")
    public WebElement weekButton;
    @FindBy(xpath= "//button[.='Month']")
    public WebElement monthButton;
    @FindBy(xpath= "//tr[@data-time='01:00:00']")
    public WebElement timeBoxButton;
    @FindBy(xpath= "//input[@class='o_input']")
    public WebElement summaryBox;
    @FindBy(xpath= "//button[@class='btn btn-sm btn-primary']")
    public WebElement createButton;
    @FindBy(xpath= "(//div[@class='fc-event-container']//a)[2]")
    public WebElement eventButton;
    @FindBy(xpath= "//span[.='Edit']")
    public WebElement editButton;
    @FindBy(xpath= "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement meetingSubjectBox;
    @FindBy(xpath= "//li[.='Feedback Meeting']")
    public WebElement feedback;
    @FindBy(xpath= "//span[.='Feedback Meeting']")
    public WebElement feedbackSelect;
    @FindBy(xpath= "(//input[@class='o_input ui-autocomplete-input'])[3]")
    public WebElement tagsBox;
    @FindBy(xpath= "(//input[@class='o_input ui-autocomplete-input'])[4]")
    public WebElement reminderBox;
    @FindBy(xpath= "//li[.='30 Minute(s)']")
    public WebElement number;
    @FindBy(xpath= "//input[@class='o_field_char o_field_widget o_input']")
    public WebElement locationBox;
    @FindBy(xpath= "//textarea[@class='o_field_text o_field_widget o_input']")
    public WebElement descriptionBox;
    @FindBy(xpath= "//a[.='Options']")
    public WebElement optionsButton;
    @FindBy(xpath= "(//select[@class='o_input o_field_widget'])[4]")
    public WebElement privacyButton;
    @FindBy(xpath= "//span[.='Save']")
    public WebElement saveButton;































}
