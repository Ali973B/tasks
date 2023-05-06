package element;

import base.BaseElement;
import org.openqa.selenium.By;
import utils.WaitUtils;

public class Button extends BaseElement {
    public Button(By uniqueLocator, String name) {
        super(uniqueLocator, name);
    }

    public void clickButton(){
        WaitUtils.waitForPresence(uniqueLocator);
        WaitUtils.waitForElementToBeClickable(uniqueLocator);
        getElement().click();
    }

}
