package com.technosoft.training.expedia;


import configuration.DriverWrapper;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static configuration.BasePage.mouseOverElement;


public class TestHoverOver extends DriverWrapper{

    @Test
    //Mouses over the element and navigate to visual designer page
    public static void mouseOver() throws InterruptedException {
        mouseOverElement(By.linkText("Products"),By.linkText("Visual designer"));
        String expectedTitle = getDriver().getTitle();
        //Verifies navigation to visual designer page
        Assert.assertEquals(expectedTitle,"Visual Designer for DHTMLX JavaScript Library - Build Web Apps Easily");

    }
}
