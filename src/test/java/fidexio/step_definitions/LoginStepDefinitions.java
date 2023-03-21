package fidexio.step_definitions;

import fidexio.pages.LoginPage;
import fidexio.utilities.ConfigurationReader;
import fidexio.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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



    @When("User enters {string} and {string} for Pos Manager")
    public void userEntersAndForPosManager(String usr, String password) {
        loginPage.usernameInputField.sendKeys(usr);
        loginPage.passwordInputField.sendKeys(password);
    }

    @Then("User clicks login button")
    public void userClicksLoginButton() {
        loginPage.loginButton.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.titleIs("#Inbox - Odoo"));
        Assert.assertEquals("#Inbox - Odoo", Driver.getDriver().getTitle());

    }
}
