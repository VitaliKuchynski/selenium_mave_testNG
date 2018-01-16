package com.tecnosoft.training.first.maven.testNG;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIncorrectLogIn extends DriverWrapper{

    @Test
    //Checks LogIn with incorrect credentials
    public void incorrectLogIn(){
        getDriver().findElement(By.id("email")).sendKeys("test@test.com");
        getDriver().findElement(By.id("pass")).sendKeys("123123");
        getDriver().findElement(By.id("loginbutton")).click();
        String currentTitleID = getDriver().getTitle();
        Assert.assertEquals(currentTitleID,"Log into Facebook | Facebook", "Wrong page !!!!");

    }





}