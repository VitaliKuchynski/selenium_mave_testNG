package com.technosoft.training.page_object_pattern_facebook;

import configuration.DriverWrapper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNavigationToPolicyPage extends DriverWrapper {


     @Test
     public void navigateSwitchToPolicyPage(){
     CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage();
     createNewAccountPage.navigateToDatePolicyPage();
     createNewAccountPage.switchToWindow(1);
     String expectedTitle= "Data Policy";
     String actualTitle = getDriver().getTitle();
     //Verify that policy page opens
     Assert.assertEquals(expectedTitle,actualTitle);
     createNewAccountPage.switchToCreateNewAccountPage();


 }

}
