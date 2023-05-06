package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.Browser;

public abstract class BaseTest {
    protected WebDriver driver;

    @BeforeTest
    public final void initializeDriver() {
        driver = Browser.getInstance();
    }

    @AfterTest
    public void quitDriver() {
        driver.close();
        driver.quit();
    }
}
