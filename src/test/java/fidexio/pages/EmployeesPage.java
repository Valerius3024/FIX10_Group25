package fidexio.pages;

import fidexio.step_definitions.Employees_StepDefinitions;
import fidexio.utilities.BrowserUtils;
import fidexio.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeesPage {

    public EmployeesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(css = "input.o_searchview_input")
    public WebElement employeeSearchBox;

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    public WebElement createButton;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement createFormEmployeeName;

    @FindBy(css = "button.btn.btn-primary.btn-sm.o_form_button_save")
    public WebElement employeeSaveButton;

    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[3]")
    public WebElement employeeActionButton;

    @FindBy(xpath = "//a[contains(text(),'Delete')]")
    public WebElement employeeDeleteButton;

    @FindBy(xpath = "//span[.='Attendance']")
    public WebElement employeeAttendance;

    @FindBy(xpath = "//a[.='HR Settings']")
    public WebElement employeeHrSettings;

    @FindBy(xpath = "(//input[@name='ufile'])[2]")
    public WebElement employeeUploadPicture;

    @FindBy(xpath = "//span[@title='Clear']")
    public WebElement employeeDeletePicture;

    @FindBy(css = "img.img.img-responsive")
    public WebElement employeePicture;

    @FindBy(css = "button.btn.btn-primary.btn-sm.o_form_button_edit")
    public WebElement employeeEditButton;

    @FindBy(css = "button.btn.btn-default.btn-sm.o_form_button_create")
    public WebElement employeeCreateButton;

    @FindBy(css = "button.btn.btn-default.btn-sm.o_form_button_cancel")
    public WebElement employeeDiscardButton;

    @FindBy(css = "span.o_field_char.o_field_widget.o_required_modifier")
    public WebElement registeredEmployeeName;

    @FindBy(xpath = "//div[@class='o_thread_message_content']/p")
    public WebElement employeeCreated;


///////////////////////////////////////////////////////////////

    @FindBy(xpath = "//button[contains(text(),'Import')]")
    public WebElement importButton;

    @FindBy(xpath = "(//button[.='Follow'])[1]")
    public WebElement followButton;

    @FindBy(xpath = "//button[@data-name='action_unfollow']")
    public WebElement followingButton;

    @FindBy(css = "span.o_searchview_more.fa.fa-search-plus")
    public WebElement advancedSearchButton;

////////////////////////////////////////////////////////////////

    @FindBy(xpath = "//div[@class='btn-group o_dropdown'][1]")
    public WebElement filtersButton;

    @FindBy(xpath = "//a[.='Absent Today']")
    public WebElement filtersAbsentToday;

    @FindBy(xpath = "//a[.='Unread Messages']")
    public WebElement filtersUnreadMessages;

    @FindBy(xpath = "//a[.='Archived']")
    public WebElement filtersArchived;

    @FindBy(xpath = "//a[.='Add Custom Filter']")
    public WebElement filtersAddCustomFilter;

////////////////////////////////////////////////////////////////

    @FindBy(css = "div.btn-group.hidden-xs.o_dropdown")
    public WebElement groupByButton;

    @FindBy(xpath = "//a[.='Manager']")
    public WebElement groupByManager;

    @FindBy(xpath = "//a[.='Coach']")
    public WebElement groupByCoach;

    @FindBy(xpath = "//a[.='Department']")
    public WebElement groupByDepartment;

    @FindBy(xpath = "//a[.='Job']")
    public WebElement groupByJob;

    @FindBy(xpath = "//a[.='Add custom group']")
    public WebElement groupByCustomGroup;

////////////////////////////////////////////////////////////////

    @FindBy(xpath = "//div[@class='btn-group o_dropdown'][2]")
    public WebElement favoritesButton;

    @FindBy(xpath = "//a[.='Save current search']")
    public WebElement favoritesSaveCurrentSearch;

    @FindBy(xpath = "//a[.='Add to my Dashboard']")
    public WebElement favoritesAddToDashboard;

////////////////////////////////////////////////////////////////

    @FindBy(xpath = "//button[@aria-label='Next']")
    public WebElement nextPageButton;

    @FindBy(xpath = "//button[@aria-label='Previous']")
    public WebElement previousPageButton;

    public void verifyNextPage(){
        int pageResultsEndingPoint = Integer.parseInt(Driver.getDriver().findElement(By.cssSelector("span.o_pager_value")).getText().substring(Driver.getDriver().findElement(By.cssSelector("span.o_pager_value")).getText().indexOf('-')+1));
        nextPageButton.click();
        BrowserUtils.waitForClickablility(previousPageButton, 10);
        int pageResultsStartingPoint = Integer.parseInt(Driver.getDriver().findElement(By.cssSelector("span.o_pager_value")).getText().substring(0,Driver.getDriver().findElement(By.cssSelector("span.o_pager_value")).getText().indexOf('-')));
        Assert.assertEquals(pageResultsEndingPoint, (pageResultsStartingPoint-1));
    }

    public void verifyPreviousPage(){
        int pageResultsStartingPoint = Integer.parseInt(Driver.getDriver().findElement(By.cssSelector("span.o_pager_value")).getText().substring(0,Driver.getDriver().findElement(By.cssSelector("span.o_pager_value")).getText().indexOf('-')));
        previousPageButton.click();
        BrowserUtils.waitForClickablility(previousPageButton, 10);
        int pageResultsEndingPoint = Integer.parseInt(Driver.getDriver().findElement(By.cssSelector("span.o_pager_value")).getText().substring(Driver.getDriver().findElement(By.cssSelector("span.o_pager_value")).getText().indexOf('-')+1));
        Assert.assertEquals(pageResultsEndingPoint, (pageResultsStartingPoint-1));
    }

////////////////////////////////////////////////////////////////

    @FindBy(xpath = "//button[@aria-label='list']")
    public WebElement listButton;

    @FindBy(css = "div.table-responsive")
    public WebElement listTable;

    @FindBy(xpath = "//button[@aria-label='kanban']")
    public WebElement kanbanButton;

    @FindBy(css = "div.o_kanban_view.o_hr_employee_kanban.o_kanban_ungrouped")
    public WebElement kanbanGroup;

////////////////////////////////////////////////////////////////


}

