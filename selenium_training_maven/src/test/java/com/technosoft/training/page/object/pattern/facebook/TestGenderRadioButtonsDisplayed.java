package com.technosoft.training.page.object.pattern.facebook;


import configuration.DriverWrapper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGenderRadioButtonsDisplayed extends DriverWrapper {


    @Test
    //Verifies that male radio-button displayed
    public void verifyMailRadioButtonDisplayed(){
        CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage();
        LogInPage logInPage = new LogInPage();
        logInPage.clickOnSignUpLink();
        Assert.assertTrue( createNewAccountPage.isMailRadioButtonDisplayed());
    }

    @Test
    //Verifies that female radio-button displayed
    public void verifyFemaleRadioButtonDisplayed(){
        CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage();
        LogInPage logInPage = new LogInPage();
        logInPage.clickOnSignUpLink();
        Assert.assertTrue( createNewAccountPage.isFemaleRadioButtonDisplayed());
    }
}
