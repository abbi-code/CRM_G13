package Test.AlinasDocuments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CRM24_TenUS {

    /**
     * 1. Users can check "High Priority"
     * 2. Users can click on "Checklist" to create checklists items
     * 3. Users can add Deadline, Time Planningby using date pickers. (chekc box pracitce)
     */

    public class taskHighPriority {

        WebDriver driver;

        @BeforeMethod
        public void setupMethod() {
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.get("https://login2.nextbasecrm.com/auth/?backurl=%2Fstream%2F");

            WebElement UserName = driver.findElement(By.name("USER_LOGIN"));
            UserName.sendKeys("helpdesk25@cybertekschool.com");

            WebElement Password = driver.findElement(By.name("USER_PASSWORD"));
            Password.sendKeys("UserUser" + Keys.ENTER );
        }

        @Test
        public void high_priority() {

            WebElement Task = driver.findElement(By.id("feed-add-post-form-tab-tasks"));
            Task.click();

            WebElement highPriorityBox = driver.findElement(By.id("tasks-task-priority-cb"));
            highPriorityBox.click();

            WebElement checklist = driver.findElement(By.xpath("//span[@class='tasks-task-mpf-link']"));
            checklist.click();

            WebElement dateSetup = driver.findElement(By.xpath("//input[@class='task-options-inp']"));
            dateSetup.click();

            WebElement timeSetup = driver.findElement(By.xpath("//span[@class='task-dashed-link task-dashed-link-terms task-dashed-link-add']"));
            timeSetup.click();

            WebElement startSetup = driver.findElement(By.xpath("//input[@class='task-options-inp']"));
            startSetup.click();

            WebElement finishSetup = driver.findElement(By.xpath("//input[@class='task-options-inp']"));
            finishSetup.click();

        }

        @AfterMethod
        public void closeBrowser() {
            driver.quit();

        }
    }


}
