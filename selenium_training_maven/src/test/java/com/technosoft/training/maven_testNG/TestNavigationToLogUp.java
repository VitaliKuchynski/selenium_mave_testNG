package com.technosoft.training.maven_testNG;


import configuration.DriverWrapper;
import com.technosoft.training.page_object_pattern_facebook.LogInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNavigationToLogUp extends DriverWrapper {

    @Test
    //Navigates to Log Uo page through test link
    public void testNavigationThroughSignUp(){
        LogInPage logInPage = new LogInPage();
        logInPage.clickOnSignUpLink();
        String currentUrl = DriverWrapper.getDriver().getTitle();
        //verify
        Assert.assertEquals("Sign Up for Facebook | Facebook",currentUrl);
    }
}
