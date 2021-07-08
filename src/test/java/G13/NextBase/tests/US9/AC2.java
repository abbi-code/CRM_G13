package G13.NextBase.tests.US9;

//US9. As a user, I should be able to send an event.

import G13.NextBase.pages.NextBasePageLocators;
import G13.NextBase.utilities.BrowserUtils;
import G13.NextBase.utilities.ConfigurationReader;
import G13.NextBase.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AC2 {

    // 2. Verify users can cancel events.
    // 2. users can cancel events with "CANCEL" button

    @Test public void cancelEvent() {
        // login to the page
        LoginNextBase login = new LoginNextBase();
        login.loginNextBase();

        // object of NextBaseLoginPage class
        NextBasePageLocators locators = new NextBasePageLocators();

        // AC1. Verify users can send events by clicking "EVENT" tab with at least an event name
        // click on event tab
        locators.eventTab.click();

        // enter event name, // optional since we will cancel the event
        String url = ConfigurationReader.getProperty("eventName");
        locators.eventName.sendKeys(url);

        // optional, just to show the button
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(locators.cancelButton);

        BrowserUtils.sleep(3);
        // AC2 Verify users can cancel events
        locators.cancelButton.click();

    }


}
