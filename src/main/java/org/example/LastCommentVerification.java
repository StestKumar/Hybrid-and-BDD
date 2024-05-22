package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class LastCommentVerification extends Utility
{
    public void toVerifyThatCommentAddedIsLast(By by)
    {

        // prices arraylist created which stores web elements
        List<WebElement> prices = driver.findElements(by);
        //print size of prices web element
        System.out.println(prices.size());
        //empty array list products price created
        List<String> productsPrice = new ArrayList<>();

        for (WebElement price:prices)
        {
            productsPrice.add(price.getText());
        }


        System.out.println("All Comments: "+productsPrice);
        String lastElement = productsPrice.get(productsPrice.size()-1);
        System.out.println("Last Comment: "+lastElement);
        if (lastElement.contains("Automation"))
        {
            System.out.println("comment was added successfully at last position");
        }

    }








}
