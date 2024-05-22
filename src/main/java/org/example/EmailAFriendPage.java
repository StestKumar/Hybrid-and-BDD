package org.example;


import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailAFriendPage extends Utility {
    static String expectedMessage = "Your message has been sent.";

    public void enterEmailAFriendDetails() {
        //enter friends email
        findText(By.className("friend-email"), "automationtesting@gmail.com");
        //enter personal message
        findText(By.id("PersonalMessage"), "This product is really awesome");
        //click on send email
        clickOnElement(By.xpath("//*[@class='button-1 send-email-a-friend-button']"));
        //compare actual vs expected message
        Assert.assertEquals(getTextOfElement(By.className("result")), expectedMessage);

    }

}
