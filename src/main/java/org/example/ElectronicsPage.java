package org.example;

import org.openqa.selenium.By;

public class ElectronicsPage extends Utility
{   private By _cellPhoneButton = By.xpath("//img[@title='Show products in category Cell phones']");

    private By _cameraAndPhoto = By.xpath("//a[@title='Show products in category Camera & photo']");
    public void clickOnCellPhones()
    {
        //click on cell phone from the electronics menu
        clickOnElement(_cellPhoneButton);

    }
    public void clickOnCameraAndPhoto() {

        //Click on Camera & Photo
        clickOnElement(_cameraAndPhoto);

    }


}
