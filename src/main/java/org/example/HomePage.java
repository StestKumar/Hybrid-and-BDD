package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utility
{   LoadProp loadProp = new LoadProp();

    private By _register = By.className("ico-register");

    private By _searchButton = By.xpath("//input[@placeholder='Search store']");

    private By _submitButton = By.xpath("//button[@type='submit']");

    private By _electronicButton = By.xpath("//a[@title='Show products in category Electronics']");


    //click on register button
    public void clickOnRegisterButton()

    {
        clickOnElement(_register);
    }
    //click on
    public void clickOnSearchButton(String name)
    {
        findText(By.cssSelector(".search-box-text.ui-autocomplete-input"),name);

     //   findText((_searchButton),loadProp.getProperty("enterProductName"));

        clickOnElement(_submitButton);
    }

        //click on electronics button
        public void clickOnElectronics()
        {
            clickOnElement(_electronicButton);
        }

        public void clickOnGivenButton(String buttonName)
        {
        clickOnElement(By.xpath("//a[.a=' "+buttonName+" '"));

        }

    public void clickOnDetailsButtonOnNewsNewRelease()
    {
        //click on details button at bottom on nopcommerce new release
        clickOnElement(By.xpath("//div[@class='buttons']/a[@href=\"/nopcommerce-new-release\"]"));
    }





    }




