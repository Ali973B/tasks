package page;

import base.BaseForm;
import element.Button;
import org.openqa.selenium.By;
import utils.WaitUtils;

public class HomePage extends BaseForm {
    By hereLinkLocator = By.xpath("//a[contains(text(), here)]");
    private Button hereLink;

    public HomePage(By uniqueFormLocator, String formName) {
        super(uniqueFormLocator, formName);
        hereLink = new Button(hereLinkLocator, "here link");
    }

    public void clickHereLink() {
        WaitUtils.waitForPresence(hereLinkLocator);
        WaitUtils.waitForElementToBeClickable(hereLinkLocator);
        hereLink.clickButton();
    }

}
