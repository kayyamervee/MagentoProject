package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

public class RegisterPOM extends ParentPage {

    public RegisterPOM() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Create an Account']")
    public WebElement createAnAccount;

    @FindBy(xpath = "//span[text()='Create New Customer Account']")
    public WebElement createAccountPageControl;

    @FindBy(id = "firstname")
    public WebElement firstName;

    @FindBy(id = "lastname")
    public WebElement lastName;

    @FindBy(id = "email_address")
    public WebElement emailAddress;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "password-confirmation")
    public WebElement confirmPassword;

    @FindBy(css = "[class='action submit primary']")
    public WebElement createAccountButton;

    @FindBy(xpath = "//span[text()='My Account']")
    public WebElement myAccountText;

    @FindBy(xpath = "//span[@class='logged-in']")
    public WebElement welcomeText;

    @FindBy(xpath = "//div[@role='alert']/div/div")
    public WebElement registrationMessage;

    public WebElement getWebElement(String strWebElement) {
        switch (strWebElement) {
            case "firstName":
                return this.firstName;
            case "lastName":
                return this.lastName;
            case "emailAddress":
                return this.emailAddress;
            case "password":
                return this.password;
            case "confirmPassword":
                return this.confirmPassword;
            case "createAccountButton":
                return this.createAccountButton;
        }
        return null;
    }
}
