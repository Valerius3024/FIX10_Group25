package fidexio.step_definitions;

import fidexio.pages.HomePage;
import fidexio.pages.SalesPage;
import fidexio.utilities.BrowserUtils;
import fidexio.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Us37_SalesStepDefinitions {
    HomePage homePage = new HomePage();
    SalesPage salesPage = new SalesPage();

    @When("user go to new customer page")
    public void user_go_to_new_customer_page() {
        homePage.salesButton.click();
        salesPage.CustomersLink.click();
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.titleContains("Customers"));
        BrowserUtils.waitFor(5);
        salesPage.createButton.click();

    }

    @Then("user check if all button work as expected")
    public void user_check_if_all_work_as_expected() {

        Assert.assertTrue(salesPage.saveButton.isEnabled());
        Assert.assertTrue(salesPage.discardButton.isEnabled());
        Assert.assertTrue(salesPage.contactCreateButton.isEnabled());

    }

    @Then("user add new picture {string}")
    public void user_add_new_picture(String imagePath) {
        BrowserUtils.waitFor(3);
        System.out.println(imagePath);
        salesPage.imageLoad.sendKeys(imagePath);

    }

    @When("user enters name {string} to name input")
    public void user_enters_name_to_name_input(String customerName) {
        BrowserUtils.waitFor(4);
        salesPage.nameInput.sendKeys(customerName);
    }

    @When("user click to save button")
    public void user_click_to_save_button() {
        salesPage.saveButton.click();
    }

    @Then("user display profile image")
    public void user_display_profile_image() {
        Assert.assertTrue(salesPage.profilImage.isDisplayed());
    }

    @When("user sees the {string} card")
    public void user_sees_the_card(String customerName) {
        Assert.assertTrue(salesPage.customerNameText.isDisplayed());
    }

    @Then("user delete the card")
    public void user_delete_the_card() {
        BrowserUtils.waitFor(3);
        salesPage.actionDropdown.click();
        salesPage.deleteCustomerButton.click();
        salesPage.deleteCustomerConfirmationButton.click();
    }


    @Then("user should see {string} and {string} text button")
    public void user_should_see_and_text_button(String expectedEditText, String expectedCreateText) {
        BrowserUtils.waitFor(2);
        String actualEditText = salesPage.editButton.getText();
        String actualCreateText = salesPage.createButton.getText();
        Assert.assertEquals(expectedEditText, actualEditText);
        Assert.assertEquals(expectedCreateText, actualCreateText);

    }


    @And("user enters streetName{string} to street input")
    public void userEntersStreetNameToStreetInput(String streetName) {
        salesPage.streetInput.sendKeys(streetName);

    }

    @And("user enter city{string} to city input")
    public void userEnterCityToCityInput(String cityName) {
        salesPage.cityInput.sendKeys(cityName);
    }

    @And("user enter state{string} to state input")
    public void userEnterCityToStateInput(String stateName) {

        salesPage.stateInput.sendKeys(stateName, Keys.ENTER, Keys.ENTER);
        BrowserUtils.waitFor(3);
    }

    @And("user enter city{string} to zip input")
    public void userEnterCityToZipInput(String zipCode) {
        salesPage.zipInput.sendKeys(zipCode);
    }

    @Then("check every input print on the customer card")
    public void check_every_input_print_on_the_customer_card(List<String> inputValues) {
        String actualText = "";
        BrowserUtils.waitFor(5);


        for (WebElement eachElement : salesPage.addressCard) {
            actualText += eachElement.getText() + " ";
        }


        for (String eachValue : inputValues) {
            if (actualText.contains(eachValue)) {
                Assert.assertTrue(true);
            } else {
                Assert.assertTrue(false);
            }
        }

    }

    @When("user enters email {string} to email input")
    public void user_enters_email_to_email_input(String emailAdress) {
        salesPage.emailInput.sendKeys(emailAdress);

    }

    @When("user go to customer list page")
    public void user_go_to_customer_list_page() {
        BrowserUtils.waitFor(4);
        salesPage.CustomersLink.click();

    }

    @When("user search {string} in search bar")
    public void user_search_in_search_bar(String name) {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.titleContains("Customers"));
        salesPage.searchBarInput.click();
        salesPage.searchBarInput.sendKeys(name,Keys.ENTER);

    }

    @When("user find the customer by email {string}")
    public void user_find_the_customer_by_email(String email) {
        BrowserUtils.waitFor(4);
        Assert.assertTrue(salesPage.locatingElementByText(email).isDisplayed());
        salesPage.locatingElementByText(email).click();

    }

    @When("user sees the {string} text at the buttom")
    public void user_sees_the_text_at_the_buttom(String contactCreatedText) {
       Assert.assertTrue(salesPage.locatingElementByText(contactCreatedText).isDisplayed());
    }
    @When("user display the name {string} on the title")
    public void user_display_the_name_on_the_title(String name) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(name));

    }


}
