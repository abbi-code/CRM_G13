package Test.NatalliaPl;

import G13.NextBase.utilities.ConfigurationReader;
import G13.NextBase.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NextBaseAssignment {


    WebDriver driver;


    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/auth/?backurl=%2Fstream%2F");
        WebElement UserName = driver.findElement(By.name("USER_LOGIN"));
        UserName.sendKeys("helpdesk25@cybertekschool.com");

        WebElement Password = driver.findElement(By.name("USER_PASSWORD"));
        Password.sendKeys("UserUser" + Keys.ENTER );}
         @Test
        public void LogoutButton() {
            WebElement profileButton = driver.findElement(By.xpath("//span[@id='user-name']"));
            profileButton.click();
            WebElement LogoutButton=driver.findElement(By.xpath("//*[@id=\"menu-popup-user-menu\"]/div/div/div/a[3]"));
            LogoutButton.click();
            String actualTitle=driver.getTitle();
            String expectedTitle= "Authorization";
             if (actualTitle.equals(expectedTitle)) {
                 System.out.println("Test:Pass");
             }else{
                 System.out.println("Test:Failed");
             }

        }
        @AfterMethod
        public void closeBrowser() {
            driver.quit();

        }
    }

