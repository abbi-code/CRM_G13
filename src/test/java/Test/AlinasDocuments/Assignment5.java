package Test.AlinasDocuments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Assignment5 {


    /**
     * User should be able to click Grid Settings button
     */
    WebDriver driver;

    @BeforeMethod
    public void setupClass() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://qa3.vytrack.com/user/login");
    }

    @Test
    public void clickGridSettingsButton() throws InterruptedException {
        // find the login space and put the login
        WebElement UserName = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        UserName.sendKeys("user36");

        // find the password space and put the password.
        // Click to log in
        WebElement Password = driver.findElement(By.name("_password"));
        Password.sendKeys("UserUser123" + Keys.ENTER );
        Thread.sleep(1000);

        // find a fleetButton to go to page (Vehicle)
        List<WebElement> FleetButton = driver.findElements(By.xpath("//span[@class='title title-level-1']"));
        FleetButton.get(0).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // find a Vehicle button and click to go to page
        WebElement VehicleButton = driver.findElement(By.xpath("//a/span[.='Vehicles']"));
        VehicleButton.click();

        // find a Grid Settings and click on it
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement GridSettingButton = driver.findElement(By.xpath("//a[@title='Grid Settings']"));
        GridSettingButton.click();
        Thread.sleep(1000);
    }
}
