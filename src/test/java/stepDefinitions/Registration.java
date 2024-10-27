package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegisterPOM;
import utilities.ConfigReader;
import utilities.GWD;

import java.util.List;
import java.util.Map;

public class Registration {
    RegisterPOM rg=new RegisterPOM();
    Faker faker=new Faker();

    @Given("The user navigates to the Magento website")
    public void theUserNavigatesToTheMagentoWebsite() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
    }

    @When("The user clicks on Create an Account button")
    public void theUserClicksOnCreateAnAccountButton() {
        rg.myClick(rg.createAnAccount);
    }

    @When("The user types their information in the first name and last name fields")
    public void theUserTypesTheirInformationInTheFirstNameAndLastNameFields(DataTable dt) {
        List<Map<String, String>> list=dt.asMaps(String.class, String.class);

        for (Map<String ,String> e: list){
            String firstName=e.get("firstName");
            String lastName=e.get("lastName");
            if (firstName.equals("firstNameRandom")){
                firstName=faker.name().firstName();
                rg.mySendKeys(rg.firstName, firstName);
            }

            if (lastName.equals("lastNameRandom")){
                lastName=faker.name().lastName();
                rg.mySendKeys(rg.lastName, lastName);
            }
        }
    }

    @And("The user types their information in the email address and password fields")
    public void theUserTypesTheirInformationInTheEmailAddressAndPasswordFields(DataTable dt) {
        List<Map<String, String>> list=dt.asMaps(String.class, String.class);

        for (Map<String ,String> e: list){
            String emailAddress=e.get("emailAddress");
            String password=e.get("password");
            if (emailAddress.equals("emailAddressRandom")){
                ConfigReader.updateProperty("email");
                rg.mySendKeys(rg.emailAddress, ConfigReader.getProperty("email"));
            }

            if (password.equals("passwordRandom")){
                ConfigReader.updateProperty("password");
                rg.mySendKeys(rg.password, ConfigReader.getProperty("password"));
            }
        }
    }

    @And("The user types the same password in the password confirmation field")
    public void theUserTypesTheSamePasswordInThePasswordConfirmationField() {
    }

    @And("The user clicks the create an account button")
    public void theUserClicksTheCreateAnAccountButton() {
    }

    @Then("The user receives a confirmation that they have been successfully registered")
    public void theUserReceivesAConfirmationThatTheyHaveBeenSuccessfullyRegistered() {
    }

    @And("The user can log in to the site")
    public void theUserCanLogInToTheSite() {
    }

}
