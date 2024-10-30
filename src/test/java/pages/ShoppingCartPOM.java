package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

import java.util.List;

public class ShoppingCartPOM extends ParentPage {

    public ShoppingCartPOM() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='content-heading']/h2")
    public WebElement hotSellerText;

    @FindBy(xpath = "//div[@class='content-heading']//p")
    public WebElement hotSellerDetailText;

    @FindBy(css = "[class='product-item']")
    public List<WebElement> productList;

    @FindBy(css = "[class='swatch-option text']")
    public List<WebElement> sizeList;

    @FindBy(css = "[class='swatch-option color']")
    public List<WebElement> colorList;

    @FindBy(css = "[title='Add to Cart']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//*[contains(text(),'You added')]")
    public WebElement addedSuccessMessage;

    @FindBy(linkText = "shopping cart")
    public WebElement shoppingCartLink;

    @FindBy(xpath = "//a[@class='action action-delete']")
    public WebElement deleteProductButton;

    @FindBy(css = "a[class='action action-edit']")
    public WebElement editProductButton;

    @FindBy(xpath = "(//div[@class='control'])[2]/input")
    public WebElement QtyBox;

    @FindBy(xpath = "//button[@title='Update Cart']")
    public WebElement updateButton;

    @FindBy(xpath = "(//*[contains(text(),'updated')])[1]")
    public WebElement updatedControlText;

    @FindBy(xpath = "(//button[@name='update_cart_action'])[2]")
    public WebElement updateShoppingCartBtn;

    public WebElement getWebElement(String strWebElement) {
        switch (strWebElement) {
            case "addToCartBtn": return this.addToCartButton;
            case "shoppingCartLink": return this.shoppingCartLink;
            case "deleteBtn": return this.deleteProductButton;
            case "editBtn": return this.editProductButton;
            case "updateShoppingCartBtn": return this.updateShoppingCartBtn;
        }
        return null;
    }
}
