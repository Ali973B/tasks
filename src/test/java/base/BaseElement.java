package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Browser;
import utils.WaitUtils;

import java.util.NoSuchElementException;

public abstract class BaseElement {
    protected By uniqueLocator;
    protected WebDriver driver;
    private String name;
    private WebDriverWait wait;

    public BaseElement(By uniqueLocator, String name) {
        this.uniqueLocator = uniqueLocator;
        this.name = name;
        driver = Browser.getInstance();
        wait = Browser.getWait();
    }

    public WebElement getElement(){
        boolean waitedForPresence = WaitUtils.waitForPresence(uniqueLocator);
        if (waitedForPresence){
            WebElement element = driver.findElement(uniqueLocator);
            return element;
        }
        throw new NoSuchElementException("Element is not found");
    }

    public boolean isElementVisible(){
        WaitUtils.waitForPresence(uniqueLocator);
        return WaitUtils.waitForElementToBeVisible(uniqueLocator);
    }
}
