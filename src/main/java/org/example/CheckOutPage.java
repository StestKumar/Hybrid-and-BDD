package org.example;

import org.openqa.selenium.By;

public class CheckOutPage extends Utility
{
    private By _checkOutButton = By.xpath("//button[@class='button-1 checkout-as-guest-button']");
    public void clickOnCheckOutAsGuest ()
    {

        //click on checkout button
        clickOnElement(_checkOutButton);
    }

}
