package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationResultPage extends Utility
{
    String expectedMsgEqualsActualMsg = loadProp.getProperty("registrationExpectedMessage");

    private By _result = By.className("result");

    private By _nopcommerce = By.xpath("//img[@alt='nopCommerce demo store']");
    public void compareActualMsgWithExpectedMessage()
    {

        String actual = getTextOfElement(_result);
        Assert.assertEquals(actual,expectedMsgEqualsActualMsg,loadProp.getProperty("registrationFailureMessage"));

        //click on nop commerce logo
        clickOnElement(_nopcommerce);
    }

}