package org.example;

import org.openqa.selenium.By;

public class PaymentInformationPage extends Utility
{
    LoadProp loadProp = new LoadProp();
    private By _creditCard = By.id("CreditCardType");

    private By _cardHolderName = By.name("CardholderName");

    private By _cardNumber =By.id("CardNumber");

    private By _expiryMonth = By.id("ExpireMonth");

    private By _expiryYear = By.name("ExpireYear");

    private By _cardCode = By.id("CardCode");

    private By _continueButton = By.xpath("//div[@id='payment-info-buttons-container']/button");


    public void providePaymentDetails()
    {
        //select type of credit card
        selectByVisibleText(_creditCard,loadProp.getProperty("cardType"));

        //enter cardholders name
        findText(_cardHolderName, loadProp.getProperty("cardHolderName"));

        //enter card number
        findText(_cardNumber,loadProp.getProperty("cardNumber"));

        //enter card expiry month
        selectByVisibleText(_expiryMonth,loadProp.getProperty("expiryMonth"));

        //enter card expiry year
        selectByVisibleText(_expiryYear,loadProp.getProperty("expiryYear"));

        //enter card security number
        findText(_cardCode,loadProp.getProperty("cardCode"));

        //click on continue
        clickOnElement(_continueButton);

    }

}
