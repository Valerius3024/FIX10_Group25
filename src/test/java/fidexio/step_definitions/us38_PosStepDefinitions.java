package fidexio.step_definitions;

import fidexio.pages.HomePage;
import fidexio.pages.InventoryPage;
import fidexio.utilities.BrowserUtils;
import fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class us38_PosStepDefinitions {
    InventoryPage inventoryPage = new InventoryPage();

    @When("user clicks inventory button")
    public void userClicksInventoryButton() {
        inventoryPage.inventoryButton.click();
    }

    @And("user clicks products button")
    public void userClicksProductsButton() {
        BrowserUtils.sleep(3);
        inventoryPage.productsButton.click();

    }

    @And("user clicks the create button")
    public void user_clicks_create_button()  {
        BrowserUtils.sleep(5);
        inventoryPage.createButton.click();
    }

    @And("user enter {string} product name")
    public void userEnterProductName(String productname) {
        BrowserUtils.sleep(3);
        inventoryPage.enterProductName.sendKeys(productname);
        BrowserUtils.sleep(2);

    }

    @Then("user clicks product save button")
    public void userClicksSaveButton() {
        BrowserUtils.sleep(3);
        inventoryPage.saveButton.click();
        BrowserUtils.sleep(2);
    }

    @Then("user clicks Ok button")
    public void userClicksOkButton() {
        inventoryPage.okButtonAfterSava.click();
    }


    @And("user enters {string} to searchBox")
    public void userEntersToSearchBox(String arg0) {
        BrowserUtils.sleep(2);
        inventoryPage.searchBox.sendKeys(arg0);
        inventoryPage.searchBox.sendKeys(Keys.RETURN);
        BrowserUtils.sleep(2);
    }

    @And("user clicks the product file")
    public void userClicksTheProductFile() {
        inventoryPage.productFile.click();
    }

    @And("user clicks edit button")
    public void userClicksEditButton() {
        inventoryPage.editButton.click();
    }

    @And("user clicks editProfile button")
    public void userClicksEditProfileButton() {
        inventoryPage.profileEditButton.click();
    }

    @And("user selects foto file {string}")
    public void userSelectsFotoFile(String arg1) {
        inventoryPage.fotoFile.sendKeys(arg1);

    }

    @And("user clicks delete foto button")
    public void userClicksDeleteFotoButton() {
        inventoryPage.deleteFoto.click();
    }


    @And("user check can be sold check box is checked by default")
    public void userCheckCanBeSoldCheckBoxIsCheckedByDefault() {
        BrowserUtils.sleep(2);
        inventoryPage.canBESold.isSelected();
        Assert.assertTrue(inventoryPage.canBESold.isSelected());
    }

    @And("user check can be purchased check box is checked by default")
    public void userCheckCanBePurchasedCheckBoxIsCheckedByDefault() {
        BrowserUtils.sleep(2);
        inventoryPage.canBePurchased.isSelected();
        Assert.assertTrue(inventoryPage.canBePurchased.isSelected());
        BrowserUtils.sleep(3);
    }


    @And("user should see the Edit and the Create button instead of Save and Create button")
    public void userShouldSeeEditAndCreateButtonInsteadOfSaveAndCreateButton() {
        BrowserUtils.waitForVisibility(inventoryPage.createButton,5);
        Assert.assertTrue(inventoryPage.createButton.isDisplayed());
        BrowserUtils.waitForVisibility(inventoryPage.editButton,5);
        Assert.assertTrue(inventoryPage.editButton.isDisplayed());
    }

    @And("user clicks action button")
    public void userClicksActionButton() {
        BrowserUtils.sleep(3);
        inventoryPage.actionButton.click();
    }

    @And("user clicks delete button")
    public void userClicksDeleteButton() {
        BrowserUtils.sleep(3);
        inventoryPage.deleteButton.click();
    }


    @Then("user clicks ok button after delete")
    public void userClicksOkButtonAfterDelete() {
        BrowserUtils.sleep(2);
        inventoryPage.okButtonAfterDelete.click();
    }

    @Then("user should see the informations")
    public void userShouldSeeTheInformations() {
        Assert.assertTrue(inventoryPage.information.isDisplayed());
    }


    @And("user enters {string} Total Price of Cost")
    public void userEntersTotalPriceOfCost(String cost) {
        inventoryPage.costNumber.click();
        BrowserUtils.waitFor(2);
        inventoryPage.costNumber.clear();
        BrowserUtils.waitFor(2);
        inventoryPage.costNumber.sendKeys(cost);
    }

    @Then("price should displayed as a float number")
    public void priceShouldDisplayedAsAFloatNumber() {
        Assert.assertTrue(inventoryPage.costNumberDisplayed.isDisplayed());
    }

    @Then("verify new product can be found")
    public void verifyNewProductCanBeFound() {
        Assert.assertTrue(inventoryPage.verifyProduct.isDisplayed());
    }
}
