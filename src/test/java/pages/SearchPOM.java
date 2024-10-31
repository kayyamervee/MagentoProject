package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;
import java.util.List;

public class SearchPOM extends ParentPage {
    public SearchPOM() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//input[@class='input-text'])[1]")
    public WebElement searchText;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement searchButton;

    @FindBy(xpath = "(//a[@class='product-item-link'])[7]")
    public WebElement landoGymJacket;

    @FindBy(css = "a[class='product-item-link']")
    public WebElement landoGymJacketText;

    @FindBy(xpath = "//div[text()='MJ08']")
    public WebElement productNumber;

    @FindBy(xpath = "//div[@class='message notice']")
    public WebElement message;

    @FindBy(linkText = "Men")
    public WebElement menButton;

    @FindBy(xpath = "(//span[text()='Tops'])[2]")
    public WebElement topsButton;

    @FindBy(xpath = "(//span[text()='Jackets'])[2]")
    public WebElement jacketButton;

    @FindBy(xpath = "//a[@id='ui-id-5']")
    public WebElement menuList;

    @FindBy(xpath = "//div[text()='MJ08']")
    public WebElement productNumberText;

    public WebElement getWebelement(String strWebelement) {
        switch (strWebelement) {
            case "searchButton":
                return this.searchButton;
            case "menButton":
                return this.menButton;
            case "topsButton":
                return this.topsButton;
            case "jacketButton":
                return this.jacketButton;
        }
        return null;
    }
}
