package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SearchedProductPage extends Utility {
    private By _productName = By.xpath("//div[@class='item-grid']/div//h2");

    public void productNameVerification(String name)

        {
            String expectedProductName = getTextOfElement(_productName);
            Assert.assertTrue(expectedProductName.startsWith(name), "Searched product does not contain" + name);
        }



        public void toVerifyURLOfThePageWithProductSearched (String name)
        {
            String URl = driver.getCurrentUrl();
            Assert.assertTrue(URl.contains(name), "URL Does Not Contains" +name);
        }

    }

