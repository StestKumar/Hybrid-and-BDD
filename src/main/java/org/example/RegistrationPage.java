package org.example;

import org.openqa.selenium.By;

public class RegistrationPage extends Utility
{
    //created object for LoadProp
    LoadProp loadProp = new LoadProp();

    private By _firstName = By.id("FirstName");

    private By _lastName = By.id("LastName");

    private By _dateOfBirth = By.name("DateOfBirthDay");

    private By _monthOfBirth = By.name("DateOfBirthMonth");

    private By _yearOfBirth = By.name("DateOfBirthYear");

    private By _email = By.id("Email");

    private By _password = By.id("Password");

    private By _confirmPassword = By.id("ConfirmPassword");

    private By _submitButton = By.id("register-button");

    public void enterRegistrationDetail()
    {
        //click on Register Button
        clickOnElement(By.className("ico-register"));

        //enter the First Name
        findText(_firstName, loadProp.getProperty("firstname"));

        //enter the Last Name
        findText(_lastName, loadProp.getProperty("lastname"));

        //enter Day Of Birth
        selectByVisibleText(_dateOfBirth, loadProp.getProperty("dateOfBirthDay"));

        //enter Month Of Birth
        selectByVisibleText(_monthOfBirth, loadProp.getProperty("dateOfBirthMonth"));

        //enter Year Of Birth
        selectByVisibleText(_yearOfBirth, loadProp.getProperty("dateOfBirthYear"));

        //enter your Email id
        findText(_email, loadProp.getProperty("emailPart1")+randomDate()+loadProp.getProperty("emailPart2"));

        //enter your Password
        findText(_password, loadProp.getProperty("password"));

        //confirm Password
        findText(_confirmPassword, loadProp.getProperty("password"));

        //click on the Register Submit Button
        clickOnElement(_submitButton);

    }
}

