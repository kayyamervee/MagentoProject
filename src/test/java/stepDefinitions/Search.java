package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.SearchPOM;
import utilities.ConfigReader;
import utilities.GWD;
import java.util.List;

public class Search {
    SearchPOM elements=new SearchPOM();

    @When("The user enters a product number in the search bar")
    public void the_user_enters_a_product_number_in_the_search_bar() {
        elements.myClick(elements.searchText);
        elements.mySendKeys(elements.searchText, ConfigReader.getProperty("productCode"));
    }
    @When("The user clicks the search button")
    public void the_user_clicks_the_search_button(DataTable dt) {
        List<String>searchButton=dt.asList();
        for (int i = 0; i <searchButton.size() ; i++) {
            elements.myClick(elements.getWebelement(searchButton.get(i)));
        }
    }

    @Then("The user verifies that the product appears in the search results")
    public void the_user_verifies_that_the_product_appears_in_the_search_results() {
        elements.verifyEqualsText(elements.landoGymJacketText,"Lando Gym Jacket");
    }

    @When("The user navigates to Jackets from the tab menu")
    public void the_user_navigates_to_jackets_from_the_tab_menu() {
        elements.verifyContainsText(elements.menuList,elements.menuList.getText());
        elements.myClick(elements.menuList);

        new Actions(GWD.getDriver()).moveToElement(elements.menButton).perform();
        elements.verifyContainsText(elements.menButton,elements.menButton.getText());

        new Actions(GWD.getDriver()).moveToElement(elements.topsButton).perform();
        elements.verifyContainsText(elements.topsButton,elements.topsButton.getText());

        elements.verifyContainsText(elements.jacketButton,elements.jacketButton.getText());
        elements.myClick(elements.jacketButton);
    }

    @Then("The user verifies the product number on the product page")
    public void the_user_verifies_the_product_number_on_the_product_page() {
         elements.myClick(elements.landoGymJacket);
         elements.verifyContainsText(elements.productNumberText,elements.productNumberText.getText());
    }

    @When("The user enters an invalid product number")
    public void the_user_enters_an_invalid_product_number() {
        elements.myClick(elements.searchText);
        elements.mySendKeys(elements.searchText, ConfigReader.getProperty("invalidProductCode"));
    }

    @Then("The user receives a message indicating that no products were found")
    public void the_user_receives_a_message_indicating_that_no_products_were_found() {
        elements.verifyEqualsText(elements.message,"Your search returned no results.");
    }
}