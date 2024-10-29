package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.ShoppingCartPOM;
import utilities.GWD;

import java.util.List;

public class ShoppingCart {
    ShoppingCartPOM shopping = new ShoppingCartPOM();
    Actions actions=new Actions(GWD.getDriver());

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
//        List<String> button = dtBtn.asList();
//
//        for (int i = 0; i < shopping.productList.size(); i++) {
//            int randomProduct = shopping.randomGenerator(shopping.productList.size());
//            int randomColor = shopping.randomGenerator(shopping.colorList.size());
//            int randomSize = shopping.randomGenerator(shopping.sizeList.size());
//
//            String selectedProduct = shopping.productList.get(randomProduct).getText();
//
//            actions.moveToElement(shopping.productList.get(randomProduct)).click().perform();
//            shopping.myClick(shopping.sizeList.get(randomSize));
//            shopping.myClick(shopping.colorList.get(randomColor));
//            if (!shopping.sizeList.get(randomSize).isDisplayed() || shopping.colorList.get(randomColor).isDisplayed()) {
//                for (int i = 0; i < button.size(); i++) {
//                    shopping.myClick(shopping.getWebElement(button.get(i)));
//                }
//            }
//        }
//
//        shopping.Wait(3);
//
//        for (int i = 0; i < button.size(); i++) {
//            shopping.myClick(shopping.getWebElement(button.get(i)));
//        }

    }

    @Then("The user verifies that the product has been successfully added")
    public void theUserVerifiesThatTheProductHasBeenSuccessfullyAdded() {
        shopping.verifyContainsText(shopping.addedSuccessMessage,"You added");
        shopping.addedSuccessMessage.isDisplayed();
    }

    @When("The user selects second product by selecting the size and color of the product")
    public void theUserSelectsSecondProductBySelectingTheSizeAndColorOfTheProduct() {
    }

    @And("The user clicks on the Shopping Cart")
    public void theUserClicksOnTheShoppingCart() {
        shopping.myClick(shopping.shoppingCartLink);
        shopping.verifyContainsText(shopping.shoppingCartTitle,"Shopping Cart");
    }

    @And("The user removes a product from the Shopping Cart")
    public void theUserRemovesAProductFromTheShoppingCart() {
        if (shopping.shoppingCartTitle.isDisplayed()){

        }
    }

    @And("The user edits the product from the Shopping Cart")
    public void theUserEditsTheProductFromTheShoppingCart() {
    }

    @Then("The user clicks on the Update Shopping Cart")
    public void theUserClicksOnTheUpdateShoppingCart() {
    }


}
