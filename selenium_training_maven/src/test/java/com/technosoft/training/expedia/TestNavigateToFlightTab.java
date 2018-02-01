package com.technosoft.training.expedia;


import configuration.DriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNavigateToFlightTab extends DriverWrapper{

    @Test
    public void verifyNavigationToFlightTab(){
        ExpediaLandingPage expediaLandingPage = new ExpediaLandingPage();
        expediaLandingPage.navigateToFlightTab();
        WebElement elementButton = getDriver().findElement(By.xpath(".//div[@class=\"tabs-wrapper\"]/descendant::button[position()=1]"));
        String expectedResult = elementButton.getAttribute("class");
        //Verifies that flight tab is active
        Assert.assertEquals("on",expectedResult);

    }
}
