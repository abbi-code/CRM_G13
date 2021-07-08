package G13.NextBase.tests.US9;

//US9. As a user, I should be able to send an event.

import G13.NextBase.pages.NextBasePageLocators;
import G13.NextBase.utilities.ConfigurationReader;
import G13.NextBase.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class AC3 {

    // 3. Verify users can check timers
    // 3. users can check modify event starting and ending time


    @Test
    public void checkTimers() {
        // login to the page
        LoginNextBase login = new LoginNextBase();
        login.loginNextBase();

        // object of NextBaseLoginPage class
        NextBasePageLocators locators = new NextBasePageLocators();

        // AC1. Verify users can send events by clicking "EVENT" tab with at least an event name
        // click on event tab
        locators.eventTab.click();

        // enter event name, // optional
        String url = ConfigurationReader.getProperty("eventName");
        locators.eventName.sendKeys(url);

        // locate start time
        locators.timeStart.click();

        // enter start time hour
        Actions action = new Actions(Driver.getDriver());

        action.doubleClick(locators.timeStartHour).perform();
        locators.timeStartHour.sendKeys("10");

        // enter minutes
        action.doubleClick(locators.timeStartMinute).perform();
        locators.timeStartMinute.sendKeys("45");

        // click settime button
        locators.setTimeButtonStart.click();

        //click end time
        locators.timeEnd.click();

        //double click on time end hour section
        action.doubleClick(locators.timeEndHour).perform();
        // enter hour
        locators.timeEndHour.sendKeys("12");

        // double click on time end minute section
        action.doubleClick(locators.timeEndMinute).perform();
        // enter minutes
        locators.timeEndMinute.sendKeys("35");

        // enter settime button
        locators.setTimeButtonEnd.click();
    }
}
