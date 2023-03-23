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
        BrowserUtils.waitFor(10);
        salesPage.createButton.click();

    }

    @Then("user check if all button work as expected")
    public void user_check_if_all_work_as_expected() {

        Assert.assertTrue(salesPage.saveButton.isEnabled());
        Assert.assertTrue(salesPage.discardButton.isEnabled());
        Assert.assertTrue(salesPage.contactCreateButton.isEnabled());

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

//    @Then("user add new picture {string}")
//    public void user_add_new_picture(String imagePath) {
//        BrowserUtils.waitFor(3);
//        salesPage.imageLoad.sendKeys(imagePath);
//        BrowserUtils.waitFor(3);
    //}

    @Then("user should see {string} and {string} text button")
    public void user_should_see_and_text_button(String expectedEditText, String expectedCreateText) {
        BrowserUtils.waitFor(2);
        String actualEditText=salesPage.editButton.getText();
        String actualCreateText=salesPage.createButton.getText();
        System.out.println("actualEditText = " + actualEditText);
        System.out.println("actualCreateText = " + actualCreateText);
        Assert.assertEquals(expectedEditText,actualEditText);
        Assert.assertEquals(expectedCreateText,actualCreateText);

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

        salesPage.stateInput.sendKeys(stateName,Keys.ENTER,Keys.ENTER);
        BrowserUtils.waitFor(3);
    }

    @And("user enter city{string} to zip input")
    public void userEnterCityToZipInput(String zipCode) {
        salesPage.zipInput.sendKeys(zipCode);
    }

    @Then("check every input print on the customer card")
    public void check_every_input_print_on_the_customer_card(List<String> inputValues) {
        String actualText="";
        BrowserUtils.waitFor(5);


        for (WebElement eachElement : salesPage.addressCard) {
            actualText+=eachElement.getText()+" ";
        }


        for (String eachValue : inputValues) {
            if (actualText.contains(eachValue)){
                Assert.assertTrue(true);
            }else {
                Assert.assertTrue(false);
            }
        }

    }
}
