package com.tecnosoft.training.first.maven.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

//Initialises driver and fields for testing and quite browser after testing
public class DriverWrapper {

    //Initialises variable
    private static WebDriver driver = null;
    //Initialises variable
    private String url = "https://www.facebook.com/";
    //Initialises variable
    private String expectedTitle = "Facebook - Log In or Sign Up";

    //Start of getters block
    public String getExpectedTitle() {
        return expectedTitle;
    }
    public String getUrl() {
        return url;
    }
    public static WebDriver getDriver() {
        return driver;
    }//end getters block


    @BeforeClass
    //Initialise driver, gets url
    public void initializeWebDriver(){
        //assigns chrome driver to variable
        driver = new ChromeDriver();
        driver.navigate().to(url);

    }

    @AfterClass
    //Quites browser
    public  void quiteWebDriver(){
        driver.quit();

    }


}
