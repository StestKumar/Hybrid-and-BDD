package org.example;


import org.openqa.selenium.By;

public class HTCOneM8AndroidL5_0LollipopPage extends Utility
{
    private By _addToCart = By.id("add-to-cart-button-18");

    private By _shoppingCart = By.className("cart-label");
    public void ClickOnAddToCart()
    {
        //add the product to the cart
        clickOnElement(_addToCart);

        //click on shopping cart
        clickOnElement(_shoppingCart);

    }
}
