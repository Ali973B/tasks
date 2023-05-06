package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Browser;
import utils.WaitUtils;

public abstract class BaseForm {
    private final By uniqueFormLocator;
    private final String formName;
    private final WebDriver driver;

    public BaseForm(By uniqueFormLocator, String formName) {
        this.uniqueFormLocator = uniqueFormLocator;
        this.formName = formName;
        driver = Browser.getInstance();
    }

    public boolean isPageOpen() {
        WaitUtils.waitForPresence(uniqueFormLocator);
        WebElement element = driver.findElement(uniqueFormLocator);
        return element != null;
    }

}
