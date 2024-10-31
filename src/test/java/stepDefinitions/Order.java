package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.OrderPOM;
import utilities.ConfigReader;
import utilities.GWD;

import java.util.List;

public class Order {
    OrderPOM element = new OrderPOM();

    @When("The user navigate to the products and adds the items to shopping cart and clicks on the cart icon")
    public void theUserGoesToTheProductsAndAddsTheItemsToCardIcon(DataTable dt) {
        List<String> buttons = dt.asList(String.class);
        int randomProduct = element.randomGenerator(element.products.size());

        element.scrollToElement(element.products.get(randomProduct));
        new Actions(GWD.getDriver())
                .moveToElement(element.products.get(randomProduct))
                .perform();
        element.myClick(element.products.get(randomProduct));

        boolean hasSize = !element.sizeList.isEmpty();
        boolean hasColor = !element.colorList.isEmpty();

        if (!hasSize && !hasColor) {
            dataTableClick(buttons);
        }else {
            if (hasSize) {
                int sizeRandom = element.randomGenerator(element.sizeList.size());
                element.myClick(element.sizeList.get(sizeRandom));
            }

            if (hasColor) {
                int colorRandom = element.randomGenerator(element.colorList.size());
                element.myClick(element.colorList.get(colorRandom));
            }

            dataTableClick(buttons);
        }
    }

    @Then("The user displays the product in the shopping cart and updates the quantity they want")
    public void theUserDisplaysTheProductInTheCardIconAndUpdatesTheQuantityItWants() {
        element.mySendKeys(element.inputQuantity, "2");
    }

    @And("The user clicks on the Proceed to Checkout")
    public void theUserClicksOnTheProceedToCheckout(DataTable dt) {
        List<String> button = dt.asList(String.class);
        dataTableClick(button);
    }

    @Then("The user displays the Shipping Address")
    public void theUserDisplaysTheShippingAddress() {
        element.verifyContainsText(element.shippingAddressControl, ConfigReader.getProperty("street"));
    }

    @And("The user clicks on the random Shipping methods and Next button")
    public void theUserClicksOnTheRandomShippingMethodsAndNextButton(DataTable dt) {
        List<String> button=dt.asList(String.class);

        element.myClick(element.shippingMethods);

        dataTableClick(button);
    }

    @Then("The user verifies the Shipping address and clicks on the Checkbox")
    public void theUserVerifiesTheShippingAddressAndClicksOnTheCheckbox(DataTable dt) {
        List<String> button=dt.asList(String.class);

        element.verifyContainsText(element.addressControl,ConfigReader.getProperty("street"));

        if (!element.checkbox.isSelected()) {
            dataTableClick(button);
        }
    }

    @And("The user clicks on the Place Order button")
    public void theUserClicksOnThePlaceOrderButton(DataTable dt) {
        List<String> button=dt.asList(String.class);
        dataTableClick(button);
    }

    @Then("The user displays successfully message")
    public void theUserDisplaysSuccessfullyMessage() {
        element.verifyContainsText(element.orderMsg,"Thank you");
    }

    public void dataTableClick(List<String> links) {
        for (int i = 0; i < links.size(); i++) {
            element.myClick(element.getWebElement(links.get(i)));
        }
    }
}
