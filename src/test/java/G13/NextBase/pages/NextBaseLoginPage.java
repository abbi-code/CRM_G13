package G13.NextBase.pages;

import G13.NextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NextBaseLoginPage {

    //1- Create constructor and initialize driver and object of the class
    public NextBaseLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement loginInput;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordInput;

    @FindBy(id = "USER_REMEMBER")
    public WebElement rememberMe;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submit;

    @FindBy(xpath = "//a[@class='login-link-forgot-pass']")
    public WebElement forgotPassword;
}
