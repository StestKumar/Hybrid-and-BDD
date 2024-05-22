package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class PaymentMethodPage extends Utility
{
    private By _paymentMethod = By.xpath("//input[@id='paymentmethod_1']");

    private By _nextStep = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    public void selectPaymentMethod()
    {
        clickOnElement(_paymentMethod);

        clickOnElement(_nextStep);
    }

}
