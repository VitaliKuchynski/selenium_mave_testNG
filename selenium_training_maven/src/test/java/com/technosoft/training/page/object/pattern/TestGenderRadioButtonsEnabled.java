package com.technosoft.training.page.object.pattern;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGenderRadioButtonsEnabled extends DriverWrapper {

    @Test
    //Verifies that male radio-button enabled
    public void verifyMailRadioButtonDisplayed(){
        CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage();
        LogInPage logInPage = new LogInPage();
        logInPage.clickOnSignUpLink();
        Assert.assertTrue( createNewAccountPage.isMailRadioButtonEnabled());
    }

    @Test
    //Verifies that female radio-button enabled
    public void verifyFemaleRadioButtonDefault(){
        CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage();
        LogInPage logInPage = new LogInPage();
        logInPage.clickOnSignUpLink();
        Assert.assertTrue(createNewAccountPage.isFimaleRadioButtonEnabled());
    }
}
