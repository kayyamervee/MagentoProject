package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.WishListPOM;
import utilities.GWD;

import java.util.List;

public class WishList {
    WishListPOM element = new WishListPOM();
    int random=element.randomGenerator(element.products.size());

    @When("The user goes to the product they want to add to their favorites")
    public void theUserGoesToTheProductTheyWantToAddToTheirFavorites() {
        element.scrollToElement(element.products.get(random));

        new Actions(GWD.getDriver())
                    .moveToElement(element.products.get(random))
                    .build().perform();

    }

    @And("The user clicks on the Add to Favorites button")
    public void theUserClicksOnTheAddToFavoritesButton() {
        element.myClick(element.wishListBtn.get(random));
    }

    @And("The user confirms they added the product to favorites")
    public void theUserConfirmsTheyAddedTheProductToFavorites() {
        element.verifyContainsText(element.wishListConfirmMessage,"has been added to your Wish List.");
    }

    @And("The user clicks on the Dropdown Menu and My Account button")
    public void theUserClicksOnTheMyAccountButton(DataTable dt) {
        List<String> links= dt.asList(String.class);
       dataTableClick(links);
    }

    @When("The user clicks on the My Wish List button")
    public void theUserClicksOnTheMyWishListButton(DataTable dt) {
        List<String> links= dt.asList(String.class);
        dataTableClick(links);
    }

    @Then("The user verifies the product in their favorites list")
    public void theUserVerifiesTheProductInTheirFavoritesList() {
        Assert.assertTrue(element.products.get(random).isDisplayed());
    }

    @When("The user hovers over the product they view the remove from favorites icon")
    public void theUserHoversOverTheProductTheyViewTheRemoveFromFavoritesIcon() {
        new Actions(GWD.getDriver())
                .moveToElement(element.wishListProduct)
                .build().perform();
    }

    @Then("The user clicks the Remove from Favorites button")
    public void theUserClicksTheRemoveFromFavoritesButton(DataTable dt) {
        List<String> links= dt.asList(String.class);
        dataTableClick(links);
    }

    @And("The user confirms the product is removed from favorites")
    public void theUserConfirmsTheProductIsRemovedFromFavorites() {
        element.verifyContainsText(element.wishListConfirmMessage,"has been removed from your Wish List.");
    }

    public void dataTableClick(List<String> links ){
        for (int i = 0; i < links.size(); i++) {
            element.myClick(element.getWebElement(links.get(i)));
        }
    }
}
