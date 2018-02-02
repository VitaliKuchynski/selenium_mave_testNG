package com.technosoft.training.maven_testNG;

import configuration.DriverWrapper;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEmptyLogIn extends DriverWrapper {

    @Test
    //Checks LogIn with empty credentials
    public void checkEmptyLogIn() {
        getDriver().manage().window().maximize();
        getDriver().findElement(By.id("loginbutton")).click();
        String currentTitleID = getDriver().getTitle();
        Assert.assertEquals(currentTitleID,"Log into Facebook | Facebook", "Wrong page !!!!");
    }


}
