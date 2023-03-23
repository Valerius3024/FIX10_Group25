package fidexio.step_definitions;

import fidexio.pages.HomePage;
import fidexio.pages.SalesPage;
import fidexio.utilities.BrowserUtils;
import fidexio.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Us37_SalesStepDefinitions {
    HomePage homePage=new HomePage();
    SalesPage salesPage=new SalesPage();

    @When("user go to new customer page")
    public void user_go_to_new_customer_page() {
        homePage.salesButton.click();
        salesPage.CustomersLink.click();
        salesPage.createButton.click();

    }
    @Then("user check if all button work as expected")
    public void user_check_if_all_work_as_expected() {

        Assert.assertTrue(salesPage.saveButton.isEnabled());
        Assert.assertTrue(salesPage.discardButton.isEnabled());
        Assert.assertTrue(salesPage.contactCreateButton.isEnabled());

    }


}
