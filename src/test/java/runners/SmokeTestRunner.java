package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@Smoke",
        features = {"src/test/java/featureFiles/Registration.feature",
                "src/test/java/featureFiles/Login.feature",
                "src/test/java/featureFiles/Address.feature",
                "src/test/java/featureFiles/ShoppingCart.feature",
                "src/test/java/featureFiles/Order.feature",
                "src/test/java/featureFiles/TabMenu.feature",
                "src/test/java/featureFiles/Search.feature",
                "src/test/java/featureFiles/WishList.feature"},
        glue = {"stepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class SmokeTestRunner extends AbstractTestNGCucumberTests {
}
