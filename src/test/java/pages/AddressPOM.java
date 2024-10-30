package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

public class AddressPOM extends ParentPage {

    public AddressPOM() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "(//ul[@class='header links']//button)[1]")
    public WebElement dropDownMenuBtn;

    @FindBy(xpath = "(//ul[@class='header links']//a)[1]")
    public WebElement myAccountBtn;

    @FindBy(linkText = "Address Book")
    public WebElement addressBookBtn;

    @FindBy(css = "[title='Add New Address']")
    public WebElement addAddressBtn;

    @FindBy(id = "company")
    public WebElement company;

    @FindBy(id = "telephone")
    public WebElement telephone;

    @FindBy(id = "street_1")
    public WebElement streetAddress;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "region_id")
    public WebElement selectRegion;

    @FindBy(id = "zip")
    public WebElement zipCode;

    @FindBy(id = "country")
    public WebElement country;

    @FindBy(css = "[for='primary_billing']>span")
    public WebElement billingAddress;

    @FindBy(css = "[for='primary_shipping']>span")
    public WebElement shippingAddress;

    @FindBy(css = "[class='action save primary']")
    public WebElement saveBtn;

    @FindBy(linkText = "My Account")
    public WebElement myAccountBtnLeftNav;

    @FindBy(xpath = "(//a[@class='action edit'])[3]")
    public WebElement editAddressBtn;

    @FindBy(css = "[data-ui-id='message-success']")
    public WebElement confirmMessage;

    @FindBy(css = "[class='action delete']")
    public WebElement deleteBtn;

    @FindBy(css = "[class='action-primary action-accept']")
    public WebElement okBtn;

    @FindBy(css = "[class='message info']")
    public WebElement addressInfoMessage;

    @FindBy(css = "p[class='empty']")
    public WebElement deleteEmpty;
}
