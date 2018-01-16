package com.tecnosoft.training.first.maven.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestTitleChrome extends DriverWrapper{



    @Test
    //Check titleID of the page
    public void testID(){
        String currentTitleID = getDriver().getTitle();
        Assert.assertEquals(currentTitleID, getExpectedTitle(),"Invalid Page Title ID");

    }
}
