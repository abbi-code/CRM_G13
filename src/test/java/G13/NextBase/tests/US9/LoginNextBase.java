package G13.NextBase.tests.US9;

import G13.NextBase.pages.NextBasePageLocators;
import G13.NextBase.tests.base.TestBase;
import G13.NextBase.utilities.ConfigurationReader;
import G13.NextBase.utilities.Driver;

public class LoginNextBase extends TestBase {

    public void loginNextBase() {

        // Go to Login Page - https://login2.nextbasecrm.com/
        String url = ConfigurationReader.getProperty("nextBaseLoginPage");
        Driver.getDriver().get(url);

        // object of NextBaseLoginPage class
        NextBasePageLocators login = new NextBasePageLocators();

        // locate username and enter correct username for either of helpdesk/marketing/hr
        String username = ConfigurationReader.getProperty("helpdeskUsername");
        login.loginInput.sendKeys(username);

        // locate password and enter correct username for either of helpdesk/marketing/hr
        String password = ConfigurationReader.getProperty("helpdeskPassword");
        login.passwordInput.sendKeys(password);

        //locate and click "remember me"
        login.rememberMe.click();

        //locate submit
        login.submit.click();

    }

}
