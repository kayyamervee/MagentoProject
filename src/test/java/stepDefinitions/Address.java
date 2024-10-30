package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.AddressPOM;
import utilities.ConfigReader;
import utilities.GWD;

public class Address {

    AddressPOM element =new AddressPOM();

    @When("The user clicks on drop-down menu and My Account button")
    public void theUserClicksOnDropDownMenuAndMyAccountButton() {
        element.myClick(element.dropDownMenuBtn);
        element.myClick(element.myAccountBtn);
    }

    @And("The user clicks on the Address Book button")
    public void theUserClicksOnTheAddressBookButton() {
        element.myClick(element.addressBookBtn);

        if (!GWD.getDriver().getCurrentUrl().equals("https://magento.softwaretestingboard.com/customer/address/new/"))
            element.jsClick(element.addAddressBtn);
    }

    @And("The user types Home location information")
    public void theUserTypesLocationInformation() {
        ConfigReader.updateProperty("company");
        element.mySendKeys(element.company,ConfigReader.getProperty("company"));

        ConfigReader.updateProperty("phoneNumber");
        element.mySendKeys(element.telephone,ConfigReader.getProperty("phoneNumber"));

        ConfigReader.updateProperty("street");
        element.mySendKeys(element.streetAddress,ConfigReader.getProperty("street"));

        ConfigReader.updateProperty("city");
        element.mySendKeys(element.city,ConfigReader.getProperty("city"));

        element.myClick(element.selectRegion);
        element.selectByText(element.selectRegion,"Michigan");

        ConfigReader.updateProperty("postalCode");
        element.mySendKeys(element.zipCode,ConfigReader.getProperty("postalCode"));

        element.myClick(element.country);
        element.selectByText(element.country,"United States");
    }

    @Then("The user clicks on Save button and displays verifies message")
    public void theUserClicksOnSaveButtonAndDisplaysVerifiesMessage() {
        element.myClick(element.saveBtn);
        element.verifyContainsText(element.confirmMessage,"You saved");
    }

    @When("The user clicks on My Account button in the Left Nav and clicks on Edit Address button")
    public void theUserClicksOnChangeBillingAddressButton() {
        element.myClick(element.myAccountBtnLeftNav);
        element.jsClick(element.editAddressBtn);
    }

    @And("The user types Company location information")
    public void theUserTypesCompanyLocationInformation() {
        ConfigReader.updateProperty("company");
        element.mySendKeys(element.company,ConfigReader.getProperty("company"));

        ConfigReader.updateProperty("phoneNumber");
        element.mySendKeys(element.telephone,ConfigReader.getProperty("phoneNumber"));

        ConfigReader.updateProperty("street");
        element.mySendKeys(element.streetAddress,ConfigReader.getProperty("street"));

        ConfigReader.updateProperty("city");
        element.mySendKeys(element.city,ConfigReader.getProperty("city"));

        element.myClick(element.selectRegion);
        element.selectByText(element.selectRegion,"Michigan");

        ConfigReader.updateProperty("postalCode");
        element.mySendKeys(element.zipCode,ConfigReader.getProperty("postalCode"));

        element.myClick(element.country);
        element.selectByText(element.country,"United States");
    }

    @And("The user displays two options and clicks on Save button")
    public void theUserChoosesOneOfTwoOptions() {
        if (!element.addressInfoMessage.isDisplayed()) {
            element.wait.until(ExpectedConditions.textToBePresentInElement(element.billingAddress,
                    "Use as my default billing address"));
            Assert.assertTrue(element.billingAddress.getText().contains("billing address"));
            element.wait.until(ExpectedConditions.textToBePresentInElement(element.shippingAddress,
                    "Use as my default shipping address"));
            Assert.assertTrue(element.shippingAddress.getText().contains("shipping address"));
        }
        element.myClick(element.saveBtn);
    }

    @Then("The user displays verifies message")
    public void theUserDisplaysVerifiesMessage() {
        element.verifyContainsText(element.confirmMessage,"You saved");
    }

    @Then("The user clicks on Delete button and displays verifies message")
    public void theUserClicksOnDeleteButtonAndDisplaysVerifiesMessage() {
        if (element.deleteEmpty.isDisplayed()){
            element.jsClick(element.addAddressBtn);

            ConfigReader.updateProperty("company");
            element.mySendKeys(element.company,ConfigReader.getProperty("company"));

            ConfigReader.updateProperty("phoneNumber");
            element.mySendKeys(element.telephone,ConfigReader.getProperty("phoneNumber"));

            ConfigReader.updateProperty("street");
            element.mySendKeys(element.streetAddress,ConfigReader.getProperty("street"));

            ConfigReader.updateProperty("city");
            element.mySendKeys(element.city,ConfigReader.getProperty("city"));

            element.myClick(element.selectRegion);
            element.selectByText(element.selectRegion,"Michigan");

            ConfigReader.updateProperty("postalCode");
            element.mySendKeys(element.zipCode,ConfigReader.getProperty("postalCode"));

            element.myClick(element.country);
            element.selectByText(element.country,"United States");

            element.myClick(element.saveBtn);

            element.jsClick(element.deleteBtn);
            element.myClick(element.okBtn);
            element.verifyContainsText(element.confirmMessage,"You deleted");
        }else {
            element.jsClick(element.deleteBtn);
            element.myClick(element.okBtn);
            element.verifyContainsText(element.confirmMessage,"You deleted");
        }
    }
}
