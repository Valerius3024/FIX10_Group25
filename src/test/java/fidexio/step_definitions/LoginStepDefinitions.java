package fidexio.step_definitions;

import fidexio.pages.LoginPage;
import fidexio.utilities.ConfigurationReader;
import fidexio.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("urlLoginPage"));
    }
    @When("User logs in as a SalesManager with valid credentials")
    public void User_logs_in_as_a_SalesManager_with_valid_credentials() {
        loginMethod("userSalesManager", "passwordSalesManager");
    }

    @When("User logs in as a PosManager with valid credentials")
    public void User_logs_in_as_a_PosManager_with_valid_credentials() {
        loginMethod("userPosManager", "passwordPosManager");
    }

    private void loginMethod(String userSalesManager, String passwordSalesManager) {
        loginPage.usernameInputField.sendKeys(ConfigurationReader.getProperty(userSalesManager));
        loginPage.passwordInputField.sendKeys(ConfigurationReader.getProperty(passwordSalesManager));
        loginPage.loginButton.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.titleIs("#Inbox - Odoo"));
        Assert.assertEquals("#Inbox - Odoo", Driver.getDriver().getTitle());
    }

}
