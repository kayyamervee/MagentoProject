package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

public class Login extends ParentPage{

    public Login() {
        PageFactory.initElements(GWD.getDriver(),this);
    }
}
