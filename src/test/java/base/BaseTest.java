package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;
import java.time.Duration;

public class BaseTest {
protected WebDriver driver;

    public WebDriver getDriver(){
        return driver;
    }
    @BeforeMethod
    public void setup(){
        //Log.info("launching Chrome...");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open base URL here
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }
    @AfterMethod
    public void tearDown(){
        if (driver != null){
            //Log.info("Closing browser...");
            driver.quit();
        }
    }


}
