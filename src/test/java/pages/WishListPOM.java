package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

import java.util.List;

public class WishListPOM extends ParentPage{

    public WishListPOM() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "(//ul[@class='header links']//button)[1]")
    public WebElement dropDownMenuBtn;

    @FindBy(xpath = "(//ul[@class='header links']//a)[1]")
    public WebElement myAccountBtn;

    @FindBy(css = "li[class='product-item']")
    public List<WebElement> products;

    @FindBy(css = "[class='product-item-link']")
    public List<WebElement> productName;

    @FindBy(xpath = "//a[@class='action towishlist']")
    public List<WebElement> wishListBtn;

    @FindBy(linkText = "My Wish List")
    public WebElement myAccountWishListBtn;

    @FindBy(css = "[data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    public WebElement wishListConfirmMessage;

    @FindBy(xpath = "//div[@class='actions-secondary']/a")
    public WebElement deleteWishListBtn;

    public WebElement getWebElement(String strWebElement) {
        switch (strWebElement) {
            case "myAccountButton":
                return this.myAccountBtn;
            case "wishListButton":
                return this.myAccountWishListBtn;
            case "dropDownMenu ":
                return this.dropDownMenuBtn;
            case "removeFavoritesButton":
                return this.deleteWishListBtn;
        }
        return null;
    }
}
