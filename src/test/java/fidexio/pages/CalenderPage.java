package fidexio.pages;

import fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalenderPage {
    public CalenderPage () {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath= "//li[.='Meetings (Week 12)']")
    public WebElement weekText;
    @FindBy(xpath= "//li[.='Meetings (March 25, 2023)']")
    public WebElement dayText;
    @FindBy(xpath= "//li[.='Meetings (March 2023)']")
    public WebElement monthText;
    @FindBy(xpath= "//button[.='Day']")
    public WebElement dayButton;
    @FindBy(xpath= "//button[.='Week']")
    public WebElement weekButton;
    @FindBy(xpath= "//button[.='Month']")
    public WebElement monthButton;
    @FindBy(xpath= "//tr[@data-time='01:30:00']")
    public WebElement timeBoxButton;
    @FindBy(xpath= "//input[@class='o_input']")
    public WebElement summaryBox;
    @FindBy(xpath= "//button[@class='btn btn-sm btn-primary']")
    public WebElement createButton;
    @FindBy(xpath= "//div[@class='fc-content']")
    public WebElement eventButton;















}
