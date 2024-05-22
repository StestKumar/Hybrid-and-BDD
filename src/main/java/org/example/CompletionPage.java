package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CompletionPage extends Utility
{
    LoadProp loadProp = new LoadProp();
    static String expectedMessage = "ORDER NUMBER";

    static String orderConfirmation = "Your order has been successfully processed!";

    private By _orderConfirmationMessage = By.xpath("//div[@class='section order-completed']/div/strong");

    private By _orderNumber = By.xpath("//div[@class='order-number']/strong");

    private By _loginVerification = By.xpath("//a[@class='ico-login']");

    public void verifyOrderConfirmationMessage()
    {
        //Verify the message to confirm the order
        Assert.assertEquals(getTextOfElement(_orderConfirmationMessage),loadProp.getProperty("orderConfirmationMessage"));
        System.out.println(orderConfirmation);

        //Verify the message ORDER NUMBER:
        Assert.assertTrue(getTextOfElement(_orderNumber).contains(expectedMessage));
        System.out.println("ORDER NUMBER");

        //Verify that you are not logged in
        Assert.assertTrue(driver.findElement(_loginVerification).isDisplayed(), "login text not displayed");

    }

}
