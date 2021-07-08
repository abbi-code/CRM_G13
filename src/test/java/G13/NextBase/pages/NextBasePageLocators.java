package G13.NextBase.pages;

import G13.NextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NextBasePageLocators {

    //1- Create constructor and initialize driver and object of the class
    public NextBasePageLocators() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // login page locators
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

    // main page locators
    @FindBy(xpath = "//span[.='Event']//span")
    public WebElement eventTab;

    @FindBy(id = "feed-cal-event-namecal_3Jcl")
    public WebElement eventName;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(id = "blog-submit-button-cancel")
    public WebElement cancelButton;

    @FindBy(id = "feed_cal_event_from_timecal_3Jcl")
    public WebElement timeStart;

    @FindBy(id = "feed_cal_event_to_timecal_3Jcl")
    public WebElement timeEnd;

    @FindBy(xpath = "//input[@title='Hours']")
    public WebElement timeStartHour;

    @FindBy(xpath = "//input[@title='Minutes']")
    public WebElement timeStartMinute;

    @FindBy(xpath = "//input[@value='Set Time']")
    public WebElement setTimeButtonStart;

    @FindBy(xpath = "(//input[@title='Hours'])[2]")
    public WebElement timeEndHour;

    @FindBy(xpath = "(//input[@title='Minutes'])[2]")
    public WebElement timeEndMinute;

    @FindBy(xpath = "(//input[@value='Set Time'])[2]")
    public WebElement setTimeButtonEnd;

}
