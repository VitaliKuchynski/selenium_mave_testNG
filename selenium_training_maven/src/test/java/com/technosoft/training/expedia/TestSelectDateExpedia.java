package com.technosoft.training.expedia;



import configuration.DriverWrapper;
import org.testng.annotations.Test;

public class TestSelectDateExpedia extends DriverWrapper {



    @Test //
    //Selects current date in the flight tab Departing field
    public void selectCurrentDatedOnExpedia() throws InterruptedException {
        ExpediaLandingPage expediaLandingPage = new ExpediaLandingPage();
        expediaLandingPage.navigateToFlightTab();
        expediaLandingPage.clickOnDepartingFieldFlightTab();
        expediaLandingPage.selectCurrentDepartingDateFlightTab();






    }





}
