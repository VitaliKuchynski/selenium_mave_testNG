package com.technosoft.training.maven_testNG;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTitleFirefox extends DriverWrapperFF{


    @Test
    //Check titleID of the page
    public void testID(){
        String currentTitleID = getDriver().getTitle();
        Assert.assertEquals(currentTitleID, getExpectedTitle(),"Invalid Page Title ID");

    }
}
