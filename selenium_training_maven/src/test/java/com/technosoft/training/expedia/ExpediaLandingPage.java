package com.technosoft.training.expedia;


import configuration.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ExpediaLandingPage extends BasePage {

    //Initialises flight tab variable
    private By flightTab = By.xpath(".//div[@class=\"tabs-wrapper\"]/descendant::li[position()=1]");
    //Initialises variable and assigns ID of departing filed
    private By departingFiled = By.id("flight-departing-hp-flight");
    //Initialises flying from input field variable
    private  By flyingFromField = By.xpath("//*[@id=\"flight-origin-hp-flight\"]");
    //Initialises Web element collections
    private List <WebElement> days;
    private List <WebElement> listAutocomplete;



    //Navigates to flight tab
    public void navigateToFlightTab(){
        navigateToByClickOnLocator(flightTab);
    }
    //Opens calendar of departing filed
    public void clickOnDepartingFieldFlightTab(){
        navigateToByClickOnLocator(departingFiled);

    }
    //Selects current date from departing field on flight tab
    public void selectCurrentDepartingDateFlightTab() throws InterruptedException {
     days = getDriver().findElements(By.xpath(".//div[@class=\"datepicker-dropdown\"]/descendant::button"));
     selectCurrentDate(days);
    }
    //Gets auto complete
    public void autoCompleteOriginFiledFlightTab(String text){
        listAutocomplete = getDriver().findElements(By.className("results-item"));
        autoComplete(listAutocomplete,text);

    }
    //Enters value to flying from input field
    public void enterValueToFlyingfromFiled(String text){
        inputValue(flyingFromField, text);
    }


}
