import core.WebDriverTestBase;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.GoogleSearchPage;
import pages.ResultPage;

import static org.junit.Assert.assertEquals;

public class GoogleSearchTest extends WebDriverTestBase {
    private String url = "https://www.google.com.ua/";
    private String searchSelenium ;


    @Test
    public void searchTest() {
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
        googleSearchPage.openURL("https://www.google.com.ua/");
        googleSearchPage.sendSearchData("Selenium");
        ResultPage resultPage = new ResultPage(driver);
        assertEquals(resultPage.findLink().getText().contains("Selenium"), true);
    }



}
