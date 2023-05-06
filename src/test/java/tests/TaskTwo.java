package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Browser;

public class TaskTwo extends BaseTest {

    @Test
    public void HelpResponseDisplayedTest(){
        Browser.navigateToHost();
        Assert.assertTrue(homePage.isPageOpen());
        homePage.clickHereLink();
        Assert.assertTrue(gamePage.isPageOpen());
        gamePage.clickHelpButton();
        Assert.assertTrue(gamePage.isHelpMessageDisplayed());
    }

    @Test
    public void timerStartsFromZeroTest(){
        Browser.navigateToHost();
        Assert.assertTrue(homePage.isPageOpen());
        homePage.clickHereLink();
        Assert.assertTrue(gamePage.isPageOpen());
        Assert.assertEquals(gamePage.getTimer().getMessageContext(),"00:00:00");
    }

}
