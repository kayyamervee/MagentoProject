package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

import java.util.List;

public class TABMenuPOM extends ParentPage{

    public TABMenuPOM() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//div[@id='store.menu']//ul)[1]/li")
    public List<WebElement> tabMenuConfirm;

    @FindBy(css = "[id='ui-id-3'] span")
    public WebElement whatsNewButton;

    @FindBy(css = "[id='page-title-heading'] span")
    public WebElement pageTextControl;

    @FindBy(id = "ui-id-4")
    public WebElement womenButton;

    @FindBy(xpath = "//li[@class='item']/a")
    public WebElement topsButton;

    @FindBy(xpath = "(//li[@class='item']/a)[2]")
    public WebElement bottomsButton;

    @FindBy(xpath = "//div[@class='filter-options-title']")
    public WebElement categoryButton;

    @FindBy(xpath = "//ol[@class='items']//a")
    public WebElement subcategoryButton;

    @FindBy(xpath = "(//li[@class='item']/span)[2]")
    public WebElement productTextControl;

    @FindBy(css = "[class='action remove']")
    public WebElement exitButton;

    @FindBy(xpath = "(//ol[@class='items']//a)[2]")
    public WebElement subcategorySecondButton;

    @FindBy(xpath = "(//ol[@class='items']//a)[3]")
    public WebElement categoryButtonTees;

    @FindBy(xpath = "(//ol[@class='items']//a)[4]")
    public WebElement categoryButtonBrasAndTanks;

    @FindBy(xpath = "//a[@id='ui-id-10']//span")
    public WebElement hoverOverBottomsButton;

    @FindBy(xpath = "//span[text()='Men']")
    public WebElement menButton;

    @FindBy(id ="ui-id-6")
    public WebElement gearButton;

    @FindBy(xpath = "//li[@class='item']/a")
    public WebElement gearBagsButton;

    @FindBy(xpath = "(//li[@class='item']/a)[2]")
    public WebElement gearFitnessButton;

    @FindBy(xpath = "(//li[@class='item']/a)[3]")
    public WebElement gearWatchesButton;

    @FindBy(id = "ui-id-7")
    public WebElement trainingButton;

    @FindBy(xpath = "//li[@class='item']/a")
    public WebElement videoDownloadButton;

    @FindBy(id = "ui-id-8")
    public WebElement saleButton;

    public WebElement getWebElement(String strWebElement) {
        switch (strWebElement) {
            case "whatsNewButton":
                return this.whatsNewButton;
            case "womenButton":
                return this.womenButton;
            case "menButton":
                return this.menButton;
            case "gearButton":
                return this.gearButton;
            case "trainingButton":
                return this.trainingButton;
            case "saleButton":
                return this.saleButton;
        }
        return null;
    }
}
