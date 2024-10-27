package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.LoginPOM;
import utilities.ConfigReader;

public class Login {
    private static final Logger log = LoggerFactory.getLogger(Login.class);
    LoginPOM login=new LoginPOM();
    Faker faker=new Faker();

    @When("The user clicks on the Sign in Link")
    public void theUserClicksOnTheSignInLink() {
        login.myClick(login.signInLink);
        login.verifyContainsText(login.signInLink,"Sign In");
    }

    @Then("The user types username and password with valid credentials")
    public void theUserTypesUsernameAndPasswordWithValidCredentials() {
        login.verifyContainsText(login.customerLogin,"Customer Login");

        if (login.customerLogin.isDisplayed()) {
            login.mySendKeys(login.emailBox, ConfigReader.getProperty("email"));
            login.mySendKeys(login.passwordBox, ConfigReader.getProperty("password"));
        }
    }

    @And("The user clicks on the Sign in button")
    public void theUserClicksOnTheSignInButton() {
        login.myClick(login.signInButton);
    }

    @Then("The user verifies logged in successfully")
    public void theUserVerifiesLoggedInSuccessfully() {
        login.wait.until(ExpectedConditions.visibilityOf(login.welcomeText));
        login.verifyContainsText(login.welcomeText,"Welcome");
    }

    @Then("The user types the email and password with invalid credentials")
    public void theUserTypesTheEmailAndPasswordWithInvalidCredentials() {
        login.verifyContainsText(login.customerLogin,"Customer Login");

        if (login.customerLogin.isDisplayed()) {
            login.mySendKeys(login.emailBox, faker.internet().emailAddress());
            login.mySendKeys(login.passwordBox, faker.internet().password());
        }
    }

    @And("The user clicks on Sign in button")
    public void theUserClicksOnSignInButton() {
        login.myClick(login.signInButton);
    }

    @Then("The user verifies the warning message")
    public void theUserVerifiesTheWarningMessage() {
        login.wait.until(ExpectedConditions.visibilityOf(login.warningMessage));
        System.out.println(login.warningMessage.getText());
        login.verifyContainsText(login.warningMessage,"incorrect");
    }

    @And("The user clicks on the Forgot Password button")
    public void theUserClicksOnTheForgotPasswordButton() {
        login.myClick(login.forgotPasswordButton);
        login.verifyContainsText(login.forgetPasswordText,"Forgot Your Password?");
        login.verifyContainsText(login.forgotPasswordConfirmText,"Please enter your email address");
    }
}
