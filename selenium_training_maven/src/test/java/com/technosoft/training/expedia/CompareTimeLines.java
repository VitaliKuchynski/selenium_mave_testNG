package com.technosoft.training.expedia;


import configuration.DriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CompareTimeLines extends DriverWrapper {

    @Test
    public void compareTimeScaleDarkSky(){
        //Initialise date variable
        Date date= null;
        //Instance of formatter
        SimpleDateFormat formatter = new SimpleDateFormat("ha");
        //Instance of calendar
        Calendar cal = Calendar.getInstance();
        //Sets current time
        cal.setTime(new Date());
        //Create collection expectedTimeList
        List <String> expectedTimeList = new ArrayList<>();
        //Create collection actualTimeList
        List <String> actualTimeList = new ArrayList<>();

        //Gets actual time line
        List<WebElement> list = getDriver().findElements(By.xpath(".//span[@class=\"hour\"]/descendant::*"));
        actualTimeList.add(0, getDriver().findElement(By.xpath(".//span[@class=\"hour first\"]/descendant::span[position()=1]")).getText().toUpperCase());
        expectedTimeList.add(0,"NOW");
        //Goes through all of gotten elements and adds value to actual and expected time-line collections
        for (WebElement timeList : list){
            //Adds value to actual result collection
            actualTimeList.add(timeList.getText().toUpperCase());
            //Adds two hours to the current date
            cal.add(Calendar.HOUR_OF_DAY,2);
            //Assign new time to variable
            date = cal.getTime();
            //Adds value to expected result collection
            expectedTimeList.add(formatter.format(date));
        }

        //Verify that time lines are equals
       Assert.assertEquals(actualTimeList,expectedTimeList);
        //Prints result to visual view
        System.out.println(actualTimeList);
        System.out.println(expectedTimeList);

    }
}
