package org.example;

import org.openqa.selenium.By;

public class CartPage extends Utility
{
    private By _termsOfService = By.id("termsofservice");

    private By _checkOut = By.id("checkout");

    public void acceptTheTermsAndConditions()
    {
        clickOnElement(_termsOfService);

        clickOnElement(_checkOut);


    }

}
