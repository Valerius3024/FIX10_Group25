package fidexio.pages;

import fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalenderPage {
    public CalenderPage () {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath= "//li[.='Meetings (Week 12)']")
    public WebElement weekText;
    @FindBy(xpath= "//button[.='Day']")
    public WebElement dayButton;
    @FindBy(xpath= "//button[.='Week']")
    public WebElement weekButton;
    @FindBy(xpath= "//button[.='Month']")
    public WebElement monthButton;






}
