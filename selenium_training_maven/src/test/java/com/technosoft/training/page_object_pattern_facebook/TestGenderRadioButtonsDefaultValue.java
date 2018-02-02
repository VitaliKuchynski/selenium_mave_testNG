package com.technosoft.training.page_object_pattern_facebook;

import configuration.DriverWrapper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGenderRadioButtonsDefaultValue extends DriverWrapper {


    @Test
    //Verifies that male radio-button unchecked by default
    public void verifyMailRadioButtonDefault(){
        CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage();
        LogInPage logInPage = new LogInPage();
        logInPage.clickOnSignUpLink();
        Assert.assertFalse( createNewAccountPage.isMailRadioButtonSelected());
    }

    @Test
    //Verifies that female radio-button unchecked by default
    public void verifyFemaleRadioButtonDefault(){
            CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage();
            LogInPage logInPage = new LogInPage();
            logInPage.clickOnSignUpLink();
            Assert.assertFalse( createNewAccountPage.isFemaleRadioButtonSelected());
        }

    }

