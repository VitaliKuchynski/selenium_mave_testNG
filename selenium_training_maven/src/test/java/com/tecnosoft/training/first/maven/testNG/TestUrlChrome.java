package com.tecnosoft.training.first.maven.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestUrlChrome extends DriverWrapper{


    @Test
    //Checks URL of the page
    public void testUrl(){
        String currentURL = getDriver().getCurrentUrl();
        Assert.assertEquals(currentURL,getUrl(),"Invalid URL:");
    }


}
