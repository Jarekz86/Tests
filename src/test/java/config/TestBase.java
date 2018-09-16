package config;

import driver.manager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {



    @BeforeMethod
    public void before() {
        DriverManager.getWebdriver();
        DriverManager.getWebdriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        DriverManager.getWebdriver().manage().window().maximize();
        DriverManager.getWebdriver().get("http://pracuj.pl");
    }

    @AfterMethod
    public void after() {
        DriverManager.disposeDriver();
    }
}
