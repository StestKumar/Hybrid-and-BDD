package org.example;

import org.openqa.selenium.By;

public class OnePageCheckoutPage extends Utility
{
    LoadProp loadProp = new LoadProp();
    private By _firstName = By.id("BillingNewAddress_FirstName");

    private By _lastName = By.id("BillingNewAddress_LastName");

    private By _emailId = By.name("BillingNewAddress.Email");

    private By _country = By.id("BillingNewAddress_CountryId");

    private By _city = By.id("BillingNewAddress_City");

    private By _address = By.id("BillingNewAddress_Address1");

    private By _postalCode = By.id("BillingNewAddress_ZipPostalCode");

    private By _phoneNumber = By.id("BillingNewAddress_PhoneNumber");

    private By _continueButton = By.name("save");

    public void enterGuestDetails()
    {
        //enter first name
        findText(_firstName, loadProp.getProperty("1stname"));

        //enter last name
        findText(_lastName,loadProp.getProperty("2ndName"));

        //enter the email id
        findText(_emailId, loadProp.getProperty("email"));

        //select the country
        selectByVisibleText(_country,loadProp.getProperty("country"));

        //select the city
        findText(_city, loadProp.getProperty("city"));

        //enter the address
        findText(_address, loadProp.getProperty("address"));

        //enter the postal code
        findText(_postalCode,loadProp.getProperty("postalCode"));

        //enter the phone number
        findText(_phoneNumber, loadProp.getProperty("phoneNumber"));

        //click on continue
        clickOnElement(_continueButton);

    }

}
