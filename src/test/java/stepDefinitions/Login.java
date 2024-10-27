package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPOM;

import java.util.List;

public class Login {
    LoginPOM login=new LoginPOM();
    Faker faker=new Faker();

    @When("The user clicks on the Sign in button")
    public void theUserClicksOnTheSignInButton() {
        login.verifyContainsText(login.signInLink, "Sign In");
        login.myClick(login.signInLink);
    }


    @And("The user types the email and password with valid credentials")
    public void theUserTypesTheEmailAndPasswordWithValidCredentials(DataTable dtEmailAndPassword) {
        List<List<String>> emailAndPassword =dtEmailAndPassword.asLists();


    }

    @Then("The user verifies logged in successfully")
    public void theUserVerifiesLoggedInSuccessfully() {
    }

    @And("The user types the email and password with invalid credentials")
    public void theUserTypesTheEmailAndPasswordWithInvalidCredentials() {
    }

    @Then("The user verifies the warning message")
    public void theUserVerifiesTheWarningMessage() {
    }

    @And("The user clicks on the Forgot Password button")
    public void theUserClicksOnTheForgotPasswordButton() {
    }
}
