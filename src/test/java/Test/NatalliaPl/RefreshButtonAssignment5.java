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

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RefreshButtonAssignment5 {

    WebDriver driver;


    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://qa3.vytrack.com/user/login");


    }
    @Test
    public void RefreshButton_test() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement login = driver.findElement(By.id("prependedInput"));
        login.sendKeys("user36");
        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123" + Keys.ENTER);
        Thread.sleep(1000);
        List<WebElement> FleetButton = driver.findElements(By.xpath("//span[@class='title title-level-1']"));
        FleetButton.get(0).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement VechleButton = driver.findElement(By.xpath("//a/span[.='Vehicles']"));
        VechleButton.click();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement refreshButton = driver.findElement(By.xpath("//a[@title='Refresh']"));
        refreshButton.click();
        Thread.sleep(1000);

    }
    @AfterMethod
    public void teardownClass()    {
        driver.close();
    }

}

