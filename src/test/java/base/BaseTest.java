package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public abstract class BaseTest {
    protected WebDriver driver;

    @BeforeTest
    public final void initializeDriver(){

        driver = Browser.newInstance()
    }
}
