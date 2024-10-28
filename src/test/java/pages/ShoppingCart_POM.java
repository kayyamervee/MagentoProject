package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

import java.util.List;

public class ShoppingCart_POM extends ParentPage {

    public ShoppingCart_POM() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='content-heading']/h2")
    public WebElement hotSellerText;

    @FindBy(xpath = "//div[@class='content-heading']//p")
    public WebElement hotSellerDetailText;

    @FindBy(xpath = "//ol[@class='product-items widget-product-grid']//li")
    public List<WebElement> productList;

    @FindBy(xpath = "//div[@class='swatch-option text']")
    public List<WebElement> sizeList;

    @FindBy(xpath = "//div[@class='swatch-option color']")
    public List<WebElement> colorList;

    @FindBy(xpath = "(//button[@type='submit']/span)[2]")
    public WebElement addToCartButton;

    @FindBy(xpath = "//*[contains(text(),'You added')]")
    public WebElement addedSuccessMessage;

    @FindBy(linkText = "shopping cart")
    public WebElement shoppingCartLink;

    @FindBy(xpath = "//span[.='Shopping Cart']")
    public WebElement shoppingCartTitle;

    @FindBy(xpath = "//tbody[@class='cart item']")
    public List<WebElement> shoppingCartProducts;

    @FindBy(xpath = "(//a[@title='Remove item'])[4]")
    public WebElement deleteProductButton;

    @FindBy(css = "[class='action action-edit']")
    public List<WebElement> editProductButton;

    @FindBy(xpath = "//span[.='Qty']")
    public WebElement QtyText;

    @FindBy(xpath = "(//div[@class='control'])[2]/input")
    public WebElement QtyBox;

    @FindBy(xpath = "//button[@title='Update Cart']")
    public WebElement updateButton;

    @FindBy(xpath = "(//*[contains(text(),'updated')])[1]")
    public WebElement updatedControlText;

    @FindBy(xpath = "(//button[@name='update_cart_action'])[2]")
    public WebElement updateShoppingCartBtn;





}
