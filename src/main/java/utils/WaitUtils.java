package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
    private static final WebDriverWait wait = Browser.getWait();

    public static boolean waitForPresence(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator)).isDisplayed();
    }

    public static boolean waitForElementToBeClickable(By locator) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        return element != null;
    }

    public static boolean waitForElementToBeVisible(By locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();
    }
}
