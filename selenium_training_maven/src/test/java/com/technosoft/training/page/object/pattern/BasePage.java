package com.technosoft.training.page.object.pattern;

import com.technosoft.training.page.object.pattern.DriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class BasePage extends DriverWrapper {
    //Gets element and clicks on it
    public void clickOn(By locator) {
        try {
            DriverWrapper.getDriver().findElement(locator).click();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Screen shot should be taken");
        }
    }
    //Gets element and inputs value
    public void inputValue(By locator, String text) {
        try {
            DriverWrapper.getDriver().findElement(locator).sendKeys(text);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Screen shot should be taken");
        }

    }
    //Gets radio-button and check it
    public void checkRadioButton(By locator) {
        try {
            DriverWrapper.getDriver().findElement(locator).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Screen shot should be taken");


    }
    //Gets element ant returns string value
    public String getTextLink(By locator) {
        return DriverWrapper.getDriver().findElement(locator).getText();
    }
    //Checks if element is selected
    public boolean isRadioButtonSelected(By locator){
        boolean isSelectedResult = false;
        try {
            isSelectedResult = DriverWrapper.getDriver().findElement(locator).isSelected();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Screen shot should be taken");

        }
        return isSelectedResult; /// it should be final ?

    }
    //Checks if element is displayed
    public boolean isRadioButtonDisplayed(By locator){
        boolean isDisplayedResult = false;
        try {
            isDisplayedResult = DriverWrapper.getDriver().findElement(locator).isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Screen shot should be taken");

        }
        return isDisplayedResult;
    }
    //Checks if element is enabled
    public boolean isRadioButtonEnabled(By locator){
        boolean isEnabledResult = false;
        try {
            isEnabledResult = DriverWrapper.getDriver().findElement(locator).isEnabled();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Screen shot should be taken");

        }
        return isEnabledResult;
    }
    //Selects value from drop-down list
    public void selectDropdownListValue(Select dropDownValue, String value){
        try {
            dropDownValue.selectByVisibleText(value);
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Screen shot should be taken");

        }
    }

}