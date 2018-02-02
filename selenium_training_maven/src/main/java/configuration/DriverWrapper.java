package configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

//Initialises driver and fields for testing and quite browser after testing
public class DriverWrapper {

    //Initialises WebDriver variable and assigns it to null
    private static WebDriver driver = null;
    //Initialises variables
    private String facebookUrl = "https://www.facebook.com/";
    private String expediaUrl = "https://www.expedia.com/";
    private String amasonUrl = "https://www.amazon.com/";
    private String w3SchoolUrl =  "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert";
    private String mouseOverUrl = "https://dhtmlx.com/";
    private String expectedTitle = "Facebook - Log In or Sign Up";



    //Start of getters block
    public String getExpectedTitle() {
        return expectedTitle;
    }
    public String getFacebookUrl() {
        return facebookUrl;
    }
    public static WebDriver getDriver() {
        return driver;
    }//end getters block


    @BeforeClass
    //Initialise driver, gets facebookUrl
    public void initializeWebDriver(){
        //assigns chrome driver to variable
        driver = new ChromeDriver();
        driver.navigate().to("https://darksky.net/forecast/40.7127,-74.0059/us12/en");
    }

    @AfterClass
    //Quites browser
    public  void quiteWebDriver(){
        driver.manage().deleteAllCookies();
        driver.quit();

    }


}
