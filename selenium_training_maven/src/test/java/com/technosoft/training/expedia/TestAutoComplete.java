package com.technosoft.training.expedia;


import configuration.DriverWrapper;
import org.testng.annotations.Test;

public class TestAutoComplete extends DriverWrapper{

    @Test
    public  void  verifyAutocomplete() throws InterruptedException {

        ExpediaLandingPage expediaLandingPage = new ExpediaLandingPage();
        expediaLandingPage.navigateToFlightTab();
        expediaLandingPage.enterValueToFlyingfromFiled("New York");
        Thread.sleep(3000);
        expediaLandingPage.autoCompleteOriginFiledFlightTab("John F. Kennedy Intl");

    }
}


