package page;

import base.BaseForm;
import element.Button;
import element.Message;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.WaitUtils;

public class GamePage extends BaseForm {

    private final By helpButtonLocator = By.xpath("//a[contains(@class,'help-form')]");
    private final By helpMessageLocator = By.xpath("//div[contains(@class, 'help-form') and text()]");
    private final By timerLocator = By.xpath("//div[contains(@class,'timer')]");
    private Button helpButton;
    private Message helpMessage;
    private Message timer;

    public GamePage(By uniqueFormLocator, String formName) {
        super(uniqueFormLocator, formName);
        PageFactory.initElements(getDriver(), this);
        helpButton = new Button(helpButtonLocator, "help button");
        helpMessage = new Message(helpButtonLocator, "helpMessage");
        timer = new Message(timerLocator, "timer");
    }

    public void clickHelpButton() {
        WaitUtils.waitForPresence(By.xpath("//a[contains(@class,'help-form')]"));
        WaitUtils.waitForElementToBeClickable(helpButtonLocator);
        helpButton.clickButton();
    }

    public boolean isHelpMessageDisplayed() {
        return WaitUtils.waitForElementToBeVisible(helpMessageLocator);
    }

    public Button getHelpButton() {
        return helpButton;
    }

    public Message getHelpMessage() {
        return helpMessage;
    }

    public Message getTimer() {
        return timer;
    }
}
