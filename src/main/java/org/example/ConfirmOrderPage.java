package org.example;

import org.openqa.selenium.By;

public class ConfirmOrderPage extends Utility
{
    private By _confirmOrder = By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
    public void confirmOrder()
    {
        clickOnElement(_confirmOrder);

    }

}
