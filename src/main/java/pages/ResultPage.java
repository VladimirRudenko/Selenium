package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by vladimir on 27.03.17.
 */
public class ResultPage extends AbstractPage {
    WebDriver driver;

    public ResultPage(WebDriver driver) {
        super(driver);
    }

    public WebElement findLink(){
        WebElement seleniumLink = driver.findElement(By.xpath(".//*[@id='rso']/div/div/div[1]/div/h3/a"));
        return seleniumLink;
    }
}
