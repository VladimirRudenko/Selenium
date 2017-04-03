package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import util.WebDriverUtils;

/**
 * Created by vladimir on 27.03.17.
 */
public abstract class   AbstractPage {
    protected WebDriver driver;
    protected WebDriverUtils webDriverUtils;
    @FindBy(how = How.NAME, using = "q")
    private WebElement searchField;


    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        webDriverUtils = new WebDriverUtils(driver);
        PageFactory.initElements(driver,this);
    }

    public void sendSearchData(String search) {
        //WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys(search);
        searchField.submit();
    }
}
