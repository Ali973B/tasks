package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public abstract class Browser {
    private static WebDriver driver;
    private Browser(){}
    public static WebDriver newInstance(){
        if (driver == null){
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static WebDriver newInstance(ChromeOptions options){
        if (driver == null){
            driver = new ChromeDriver(options);
        }
        return driver;
    }
}
