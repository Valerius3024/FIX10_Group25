package fidexio.step_definitions;

import com.github.javafaker.Faker;
import fidexio.pages.EmployeesPage;
import fidexio.pages.HomePage;
import fidexio.pages.LoginPage;
import fidexio.utilities.BrowserUtils;
import fidexio.utilities.ConfigurationReader;
import fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.util.Locale;

public class Employees_StepDefinitions {

    HomePage homePage = new HomePage();
    EmployeesPage employeesPage = new EmployeesPage();
    Faker faker = Faker.instance(new Locale("tr-TR"));
    String employeeName;


    @And("user navigates to Employees page")
    public void user_navigates_to_employees_page() {
        homePage.employeesButton.click();
    }
    @When("user clicks on Follow button")
    public void user_clicks_on_follow_button() {
        employeesPage.followButton.click();
    }
    @Then("Following button should be displayed")
    public void following_button_should_be_displayed() {
        BrowserUtils.waitForVisibility(employeesPage.followingButton, 15);
        Assert.assertTrue(employeesPage.followingButton.isDisplayed());
        employeesPage.followingButton.click();
    }
    @When("user clicks on Create button")
    public void user_clicks_on_create_button() {
        employeesPage.createButton.click();

    }
    @Then("user should go to New Employee page")
    public void user_should_go_to_new_employee_page() {
        Assert.assertTrue(employeesPage.createFormEmployeeName.isDisplayed());
        Driver.getDriver().navigate().back();
    }
    @When("user clicks on Advanced Search button")
    public void user_clicks_on_advanced_search_button() {
        employeesPage.advancedSearchButton.click();
    }
    @Then("user should be able to see Filters, Group By and Favorites")
    public void user_should_be_able_to_see_filters_group_by_and_favorites() {
        BrowserUtils.waitForVisibility(employeesPage.filtersButton, 15);
        Assert.assertTrue(employeesPage.filtersButton.isDisplayed());
        Assert.assertTrue(employeesPage.groupByButton.isDisplayed());
        Assert.assertTrue(employeesPage.favoritesButton.isDisplayed());
    }
    @When("user clicks on Filters")
    public void user_clicks_on_filters() {
        employeesPage.filtersButton.click();
    }
    @Then("Absent Today, Unread Messages, Archived, Add Custom Filter should be visible")
    public void absent_today_unread_messages_archived_add_custom_filter_should_be_visible() {
        BrowserUtils.waitForVisibility(employeesPage.filtersAbsentToday, 15);
        Assert.assertTrue(employeesPage.filtersAbsentToday.isDisplayed());
        Assert.assertTrue(employeesPage.filtersUnreadMessages.isDisplayed());
        Assert.assertTrue(employeesPage.filtersArchived.isDisplayed());
        Assert.assertTrue(employeesPage.filtersAddCustomFilter.isDisplayed());
    }
    @When("user clicks on Group By")
    public void user_clicks_on_group_by() {
        employeesPage.groupByButton.click();
    }
    @Then("Manager, Coach, Department, Job, Add custom group should be visible")
    public void manager_coach_department_job_add_custom_group_should_be_visible() {
        BrowserUtils.waitForVisibility(employeesPage.groupByManager, 15);
        Assert.assertTrue(employeesPage.groupByManager.isDisplayed());
        Assert.assertTrue(employeesPage.groupByCoach.isDisplayed());
        Assert.assertTrue(employeesPage.groupByDepartment.isDisplayed());
        Assert.assertTrue(employeesPage.groupByJob.isDisplayed());
        Assert.assertTrue(employeesPage.groupByCustomGroup.isDisplayed());
    }
    @When("user clicks on Favorites")
    public void user_clicks_on_favorites() {
        employeesPage.favoritesButton.click();
    }
    @Then("Save current search, Add to my Dashboard should be visible")
    public void save_current_search_add_to_my_dashboard_should_be_visible() {
        BrowserUtils.waitForVisibility(employeesPage.favoritesSaveCurrentSearch, 15);
        Assert.assertTrue(employeesPage.favoritesSaveCurrentSearch.isDisplayed());
        Assert.assertTrue(employeesPage.favoritesAddToDashboard.isDisplayed());
    }
    @When("user clicks on Next Page, next page should open")
    public void user_clicks_on_next_page() {
        employeesPage.verifyNextPage();
    }

    @When("user clicks on Previous Page, previous page should open")
    public void user_clicks_on_previous_page() {
        employeesPage.verifyPreviousPage();
    }

    @When("user enters Employee's Name input")
    public void user_enters_employee_s_name_input() {
        BrowserUtils.waitForInvisibilityOfElement(employeesPage.loadingIndicator,10);
        employeeName = faker.name().fullName();
        employeesPage.createFormEmployeeName.sendKeys(employeeName);
    }
    @When("user clicks Save button to register the employee")
    public void user_clicks_save_button_to_register_the_employee() {
        employeesPage.employeeSaveButton.click();
    }
    @Then("employee information should be displayed")
    public void employee_information_should_be_displayed() {
        BrowserUtils.waitForVisibility(employeesPage.registeredEmployeeName, 15);
        Assert.assertTrue(employeesPage.registeredEmployeeName.getText().contains(employeeName));
    }

    @When("user uploads a picture using the edit button in the image field")
    public void user_uploads_a_picture_using_the_edit_button_in_the_image_field() {
        employeesPage.employeeUploadPicture.sendKeys("C:/Users/simge/Desktop/baris/homer.jpg");
    }
    @Then("uploaded picture should be deletable")
    public void uploaded_picture_should_be_deletable() {
        employeesPage.employeeDeletePicture.click();
        String expectedValue = "/web/static/src/img/placeholder.png";
        String actualValue = employeesPage.employeePicture.getAttribute("src");
        Assert.assertTrue(actualValue.contains(expectedValue));
    }

    @Then("Edit and Create buttons should be displayed instead of Save and Discard")
    public void edit_and_create_buttons_should_be_displayed_instead_of_save_and_discard() {
        BrowserUtils.waitForVisibility(employeesPage.employeeEditButton, 15);
        Assert.assertTrue(employeesPage.employeeEditButton.isDisplayed());
        Assert.assertTrue(employeesPage.employeeCreateButton.isDisplayed());
        Assert.assertFalse(employeesPage.employeeSaveButton.isDisplayed());
        Assert.assertFalse(employeesPage.employeeDiscardButton.isDisplayed());
    }

    @When("user enters the employee name on the search box and presses the Enter key")
    public void user_enters_the_employee_name_on_the_search_box_and_presses_the_enter_key() {
        BrowserUtils.waitForInvisibilityOfElement(employeesPage.loadingIndicator,10);
        BrowserUtils.waitForClickablility(employeesPage.employeeSearchBox, 10);
        employeesPage.employeeSearchBox.sendKeys(employeeName);
        employeesPage.employeeSearchBox.sendKeys(Keys.ENTER);
    }
    @When("user finds the employee and clicks on it")
    public void user_finds_the_employee_and_clicks_on_it() {
        boolean checkNextPage = true;
        while(checkNextPage){
            BrowserUtils.waitForInvisibilityOfElement(employeesPage.loadingIndicator, 10);
            for(WebElement result : employeesPage.employeesResults){
                if(result.getText().contains(employeeName)) {
                    checkNextPage = false;
                    result.click();
                    break;
                }
            }
            if(checkNextPage==false){
                break;
            }
            employeesPage.nextPageButton.click();
        }

    }

    @Then("{string} message should appear under full profile")
    public void message_should_appear_under_full_profile(String expectedMessage) {
        BrowserUtils.waitForVisibility(employeesPage.employeeCreated, 15);
        String actualMessage = employeesPage.employeeCreated.getText();
        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }

}
