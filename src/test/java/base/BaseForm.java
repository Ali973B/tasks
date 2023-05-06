package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Browser;
import utils.WaitUtils;

public abstract class BaseForm {
    private By uniqueFormLocator;
    private String formName;
    private WebDriver driver;

    public BaseForm(By uniqueFormLocator, String formName) {
        this.uniqueFormLocator = uniqueFormLocator;
        this.formName = formName;
        driver = Browser.getInstance();
    }

    public boolean isPageOpen() {
        return WaitUtils.waitForPresence(uniqueFormLocator);
    }

    public WebDriver getDriver() {
        return driver;
    }
}
