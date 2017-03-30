package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


/**
 * Created by vladimir on 23.03.17.
 */
public abstract class WebDriverTestBase {
    protected WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.gecko.driver", "/home/vladimir/Selenium/src/test/resources/geckodriver");
         driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }


}
