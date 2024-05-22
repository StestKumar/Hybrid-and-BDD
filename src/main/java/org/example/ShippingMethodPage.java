package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class ShippingMethodPage extends Utility
{
    private By _shippingOption = By.id("shippingoption_1");

    private By _confirmButton = By.xpath("//div[@id='shipping-method-buttons-container']/button");
    public void selectShippingOption()
    {   //select the shipping method
        clickOnElement(_shippingOption);

        //click on confirm button
        clickOnElement(_confirmButton);

    }
}
