package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class Browser {
    private static WebDriver driver;
    private static WebDriverWait wait;

    private Browser() {
    }

    public static WebDriver getInstance() {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static WebDriver getInstance(ChromeOptions options) {
        if (driver == null) {
            driver = new ChromeDriver(options);
        }
        return driver;
    }

    public static WebDriverWait getWait() {
        if (wait == null) {
            wait = new WebDriverWait(getInstance(), Duration.ofSeconds(10));
        }
        return wait;
    }

    public static void navigateToHost() {
        driver.get(GetProperties.getHostUrl());
    }
}
