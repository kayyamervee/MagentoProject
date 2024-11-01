package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.TABMenuPOM;
import utilities.GWD;

import java.util.List;

public class TABMenu {
    TABMenuPOM tb = new TABMenuPOM();

    @Given("The user displays the TAB menu on the home page")
    public void theUserMainCategoriesShouldBeDisplayedInTheTABMenu() {
        List<WebElement> tabMenuConfirm = tb.tabMenuConfirm;

        for (WebElement item : tabMenuConfirm) {
            if (item.isDisplayed()) {
                System.out.println(item.getText());
            }
        }
    }

    @When("The user clicks on the TAB Menu button")
    public void theUserClicksOnTheTABMenuButton(DataTable button) {
        List<String> links = button.asList();

        for (int i = 0; i < links.size(); i++) {
            tb.myClick(tb.getWebElement(links.get(i)));
        }
    }

    @Then("The user confirms that they accessed the What's New page")
    public void theUserConfirmsThatTheyAccessedTheWhatSNewPage() {
        tb.verifyContainsText(tb.pageTextControl, tb.pageTextControl.getText());
    }

    @Then("The user confirms that they accessed the Women page")
    public void theUserConfirmsThatTheyAccessedTheWomenPage() {
        tb.verifyContainsText(tb.pageTextControl, tb.pageTextControl.getText());
    }

    @And("The user displays and clicks the sub-buttons of the Women button")
    public void theUserDisplaysAndClicksTheSubButtonsOfTheWomenButton() {
        tb.myClick(tb.topsButton);
        tb.verifyContainsText(tb.pageTextControl, tb.pageTextControl.getText());

        tb.myClick(tb.categoryButton);

        tb.myClick(tb.subcategoryButton);
        tb.verifyContainsText(tb.productTextControl, tb.productTextControl.getText());
        tb.myClick(tb.exitButton);

        tb.myClick(tb.categoryButton);

        tb.myClick(tb.subcategorySecondButton);
        tb.verifyContainsText(tb.productTextControl, tb.productTextControl.getText());
        tb.myClick(tb.exitButton);

        tb.myClick(tb.categoryButton);

        tb.myClick(tb.categoryButtonTees);
        tb.verifyContainsText(tb.productTextControl, tb.productTextControl.getText());
        tb.myClick(tb.exitButton);

        tb.myClick(tb.categoryButton);

        tb.myClick(tb.categoryButtonBrasAndTanks);
        tb.verifyContainsText(tb.productTextControl, tb.productTextControl.getText());
        tb.myClick(tb.exitButton);

        tb.myClick(tb.womenButton);

        tb.myClick(tb.bottomsButton);
        tb.verifyContainsText(tb.pageTextControl, tb.pageTextControl.getText());

        tb.jsClick(tb.categoryButton);

        tb.myClick(tb.subcategoryButton);
        tb.verifyContainsText(tb.productTextControl, tb.productTextControl.getText());
        tb.myClick(tb.exitButton);

        tb.myClick(tb.categoryButton);

        tb.myClick(tb.subcategorySecondButton);
        tb.verifyContainsText(tb.pageTextControl, tb.pageTextControl.getText());
        tb.myClick(tb.exitButton);
    }

    @Then("The user confirms that they accessed the Men page")
    public void theUserConfirmsThatTheyAccessedTheMenPage() {
        tb.verifyContainsText(tb.pageTextControl, tb.pageTextControl.getText());
    }

    @And("The user displays and clicks the sub-buttons of the Men button")
    public void theUserDisplaysAndClicksTheSubButtonsOfTheMenButton() {
        tb.myClick(tb.topsButton);
        tb.verifyContainsText(tb.pageTextControl, tb.pageTextControl.getText());

        tb.myClick(tb.categoryButton);

        tb.myClick(tb.subcategoryButton);
        tb.verifyContainsText(tb.productTextControl, tb.productTextControl.getText());
        tb.myClick(tb.exitButton);

        tb.myClick(tb.categoryButton);

        tb.myClick(tb.subcategorySecondButton);
        tb.verifyContainsText(tb.productTextControl, tb.productTextControl.getText());
        tb.myClick(tb.exitButton);

        tb.myClick(tb.categoryButton);

        tb.myClick(tb.categoryButtonTees);
        tb.verifyContainsText(tb.productTextControl, tb.productTextControl.getText());
        tb.myClick(tb.exitButton);

        tb.myClick(tb.categoryButton);

        tb.myClick(tb.categoryButtonBrasAndTanks);
        tb.verifyContainsText(tb.productTextControl, tb.productTextControl.getText());
        tb.myClick(tb.exitButton);

        tb.myClick(tb.menButton);

        tb.myClick(tb.bottomsButton);
        tb.verifyContainsText(tb.pageTextControl, tb.pageTextControl.getText());

        tb.jsClick(tb.categoryButton);

        tb.myClick(tb.subcategoryButton);
        tb.verifyContainsText(tb.productTextControl, tb.productTextControl.getText());
        tb.myClick(tb.exitButton);

        tb.myClick(tb.categoryButton);

        tb.myClick(tb.subcategorySecondButton);
        tb.verifyContainsText(tb.pageTextControl, tb.pageTextControl.getText());
        tb.myClick(tb.exitButton);
    }

    @Then("The user confirms that they accessed the Gear page")
    public void theUserConfirmsThatTheyAccessedTheGearPage() {
        tb.verifyContainsText(tb.pageTextControl, tb.pageTextControl.getText());
    }

    @And("The user views and clicks on the Bags, Fitness Equipment, and Watches buttons")
    public void theUserViewsAndClicksOnTheBagsFitnessEquipmentAndWatchesButtons() {
        tb.myClick(tb.gearBagsButton);
        tb.verifyContainsText(tb.pageTextControl, tb.pageTextControl.getText());

        GWD.getDriver().navigate().back();

        tb.myClick(tb.gearFitnessButton);
        tb.verifyContainsText(tb.pageTextControl, tb.pageTextControl.getText());

        GWD.getDriver().navigate().back();

        tb.myClick(tb.gearWatchesButton);
        tb.verifyContainsText(tb.pageTextControl, tb.pageTextControl.getText());
    }

    @Then("The user confirms that they accessed the Training page")
    public void theUserConfirmsThatTheyAccessedTheTrainingPage() {
        tb.verifyContainsText(tb.pageTextControl, tb.pageTextControl.getText());
    }

    @And("The user view and clicks on the Video Download button")
    public void theUserViewAndClicksOnTheVideoDownloadButton() {
        tb.myClick(tb.videoDownloadButton);
        tb.verifyContainsText(tb.pageTextControl, tb.pageTextControl.getText());
    }

    @Then("The user confirms that they accessed the Sale page")
    public void theUserConfirmsThatTheyAccessedTheSalePage() {
        tb.verifyContainsText(tb.pageTextControl, tb.pageTextControl.getText());
    }
}