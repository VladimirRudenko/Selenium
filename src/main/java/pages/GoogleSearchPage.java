package pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by vladimir on 23.03.17.
 */
public class GoogleSearchPage extends AbstractPage {
    //private String url;

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    public void openURL(String url){
        driver.get(url);
    }
}
