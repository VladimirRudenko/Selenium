package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by vladimir on 27.03.17.
 */
public class ResultPage extends AbstractPage {
    //WebDriver driver;
    @FindBy(how = How.XPATH, using = ".//*[@id='rso']/div/div/div[1]/div/h3/a")
     private WebElement seleniumLink;

    public ResultPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement findLink(){
        webDriverUtils.waitForExpectedCondition(ExpectedConditions.invisibilityOf(seleniumLink));

        return seleniumLink;
    }
}
