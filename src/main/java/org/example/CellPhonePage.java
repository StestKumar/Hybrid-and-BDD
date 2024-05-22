package org.example;

import org.openqa.selenium.By;

public class CellPhonePage extends Utility
{
    private By _selectPhone = By.partialLinkText("HTC One M8 Android L 5.0 Lol");
    public void clickOnHTCOneM8AndroidL5_0Lollipop()
    {
        //select the phone you want to buy
        clickOnElement(_selectPhone);

    }

}
