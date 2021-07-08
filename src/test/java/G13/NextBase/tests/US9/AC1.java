package G13.NextBase.tests.US9;

//US9. As a user, I should be able to send an event.

//AC
//1. Verify users can send events by clicking "EVENT" tab with at least an event name.
//2. Verify users can cancel events.
//3. Verify users can check timers
//4. Verify users can choose all day for the event time

//TS
//1. users (hr, marketing and helpdesk) send event.
//2. users can cancel events with "CANCEL" button
//3. users can check modify event tarting and ending time
//4. users can check "All day"

import G13.NextBase.pages.NextBasePageLocators;
import G13.NextBase.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class AC1 {

    // AC1. Verify users can send events by clicking "EVENT" tab with at least an event name.
    // TS1. users (hr, marketing and helpdesk) send event.

    @Test
    public void sendEvent(){
        // login to the page
        LoginNextBase login = new LoginNextBase();
        login.loginNextBase();

        // object of NextBaseLoginPage class
        NextBasePageLocators locators = new NextBasePageLocators();

        // AC1. Verify users can send events by clicking "EVENT" tab with at least an event name
        // click on event tab
        locators.eventTab.click();

        // enter event name
        String url = ConfigurationReader.getProperty("eventName");
        locators.eventName.sendKeys(url);

        // click submit button
        locators.sendButton.click();
    }

}
