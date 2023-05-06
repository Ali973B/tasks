package element;

import base.BaseElement;
import org.openqa.selenium.By;
import utils.WaitUtils;

public class Message extends BaseElement {
    public Message(By uniqueLocator, String name) {
        super(uniqueLocator, name);
    }

    public String getMessageContext(){
        WaitUtils.waitForElementToBeVisible(uniqueLocator);
        return getElement().getText();
    }
}
