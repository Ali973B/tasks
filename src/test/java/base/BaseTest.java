package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import page.GamePage;
import page.HomePage;
import utils.Browser;

public abstract class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage;
    protected GamePage gamePage;

    @BeforeTest
    public final void initializeValues() {
        homePage = new HomePage(By.xpath("//button[contains(text(), 'NO')]"), "Page");
        gamePage = new GamePage(By.xpath("//div[@class='login-form']"), "User Inyerface Game page");
        driver = Browser.getInstance();
    }

    @AfterTest
    public void quitDriver() {
        driver.close();
        driver.quit();
    }
}
