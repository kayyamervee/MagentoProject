package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.ShoppingCartPOM;
import utilities.ConfigReader;
import utilities.GWD;

import java.util.List;

public class ShoppingCart {
    ShoppingCartPOM shopping = new ShoppingCartPOM();
    Actions actions = new Actions(GWD.getDriver());

    @Given("The user starts browsing the main page")
    public void theUserStartsBrowsingTheMainPage() {
        shopping.wait.until(ExpectedConditions.visibilityOf(shopping.hotSellerText));
        shopping.scrollToElement(shopping.hotSellerText);
        System.out.println(shopping.hotSellerText.getText());
        shopping.verifyContainsText(shopping.hotSellerText, "Hot Seller");
        System.out.println(shopping.hotSellerDetailText.getText());
        shopping.verifyContainsText(shopping.hotSellerDetailText, "Here is");
    }

    @When("The user selects first product by selecting the size and color of the product")
    public void theUserSelectsFirstProductBySelectingTheSizeAndColorOfTheProduct(DataTable dtBtn) {
        List<String> button = dtBtn.asList();
        int randomProduct = shopping.randomGenerator(shopping.productList.size());
        actions.moveToElement(shopping.productList.get(randomProduct)).click().perform();

        boolean size = !shopping.sizeList.isEmpty();
        boolean color = !shopping.colorList.isEmpty();

        if (!size && !color) {
            for (int i = 0; i < button.size(); i++) {
                shopping.myClick(shopping.getWebElement(button.get(i)));
            }
        } else {
            if (size) {
                int randomSize = shopping.randomGenerator(shopping.sizeList.size());
                shopping.myClick(shopping.sizeList.get(randomSize));
            }
            if (color) {
                int randomColor = shopping.randomGenerator(shopping.colorList.size());
                shopping.myClick(shopping.colorList.get(randomColor));
            }
            for (int i = 0; i < button.size(); i++) {
                shopping.myClick(shopping.getWebElement(button.get(i)));
            }
        }
    }

    @Then("The user verifies that the product has been successfully added")
    public void theUserVerifiesThatTheProductHasBeenSuccessfullyAdded() {
        shopping.wait.until(ExpectedConditions.visibilityOf(shopping.addedSuccessMessage));
        shopping.verifyContainsText(shopping.addedSuccessMessage, "You added");
        shopping.addedSuccessMessage.isDisplayed();
    }

    @When("The user selects second product by selecting the size and color of the product")
    public void theUserSelectsSecondProductBySelectingTheSizeAndColorOfTheProduct(DataTable dtBtn) {
        GWD.getDriver().navigate().back();

        List<String> button = dtBtn.asList();
        int randomProduct = shopping.randomGenerator(shopping.productList.size());
        actions.moveToElement(shopping.productList.get(randomProduct)).click().perform();

        boolean size = !shopping.sizeList.isEmpty();
        boolean color = !shopping.colorList.isEmpty();

        if (!size && !color) {
            for (int i = 0; i < button.size(); i++) {
                shopping.myClick(shopping.getWebElement(button.get(i)));
            }
        } else {
            if (size) {
                int randomSize = shopping.randomGenerator(shopping.sizeList.size());
                shopping.myClick(shopping.sizeList.get(randomSize));
            }
            if (color) {
                int randomColor = shopping.randomGenerator(shopping.colorList.size());
                shopping.myClick(shopping.colorList.get(randomColor));
            }
            for (int i = 0; i < button.size(); i++) {
                shopping.myClick(shopping.getWebElement(button.get(i)));
            }
        }
    }

    @And("The user clicks on the Shopping Cart")
    public void theUserClicksOnTheShoppingCart(DataTable dtBtn) {
        List<String> links = dtBtn.asList();

        for (int i = 0; i < links.size(); i++) {
            shopping.myClick(shopping.getWebElement(links.get(i)));
        }
    }

    @And("The user removes a product from the Shopping Cart")
    public void theUserRemovesAProductFromTheShoppingCart(DataTable dtBtn) {
        List<String> button = dtBtn.asList();

        for (int i = 0; i < button.size(); i++) {
            shopping.myClick(shopping.getWebElement(button.get(i)));
        }
    }

    @And("The user edits the product from the Shopping Cart")
    public void theUserEditsTheProductFromTheShoppingCart(DataTable dtBtn) {
        List<String> button = dtBtn.asList();

        for (int i = 0; i < button.size(); i++) {
            shopping.myClick(shopping.getWebElement(button.get(i)));
        }
        boolean size = !shopping.sizeList.isEmpty();
        boolean color = !shopping.colorList.isEmpty();

        if (!size && !color) {
            shopping.mySendKeys(shopping.QtyBox, "2");
            shopping.myClick(shopping.updateButton);
        } else {
            if (size) {
                int randomSize = shopping.randomGenerator(shopping.sizeList.size());
                shopping.myClick(shopping.sizeList.get(randomSize));
            }
            if (color) {
                int randomColor = shopping.randomGenerator(shopping.colorList.size());
                shopping.myClick(shopping.colorList.get(randomColor));
            }
            shopping.myClick(shopping.updateButton);
        }
        shopping.verifyContainsText(shopping.updatedControlText, "updated");
    }

    @Then("The user clicks on the Update Shopping Cart")
    public void theUserClicksOnTheUpdateShoppingCart(DataTable dtBtn) {
        List<String> button = dtBtn.asList();
        for (int i = 0; i < button.size(); i++) {
            shopping.myClick(shopping.getWebElement(button.get(i)));
        }
    }
}