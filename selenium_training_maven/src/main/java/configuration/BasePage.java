package configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class BasePage extends DriverWrapper {
    //Navigates to any locations
    public void navigateToByClickOnLocator(By locator) {
        try {
            //Gets element and clicks on it
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
    public String getText(By locator) {
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
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Screen shot should be taken");

        }
    }
    //Selects value from drop-down list by index
    public void selectDropdownListValue(Select dropDownValue, int index){
        try {
            dropDownValue.selectByIndex(index);
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Screen shot should be taken");

        }
    }

    //Selects current dated from list of days
    public void selectCurrentDate(List <WebElement> element) throws InterruptedException {
        //Create formatter to date
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d");
        //Instance of date, gets current date
        Date date = new Date();
        //Converts date  format to the string format
        String currentDate = simpleDateFormat.format(date);
        //Enhanced loop goes through list of web elements and selects current date
        for (WebElement day : element){
            String expectedDay = day.getText();
            if(expectedDay.equals(currentDate)){
                day.click();
                Thread.sleep(3000);
                break;
            }
        }
    }

    //Switches to windows
    public void switchToWindow(int index){
        List <String> listOfWindows = new ArrayList<> (DriverWrapper.getDriver().getWindowHandles());
        DriverWrapper.getDriver().switchTo().window(listOfWindows.get(index));
    }

    //Switches to main window
    public  void switchToRootWindow(){
        List <String> listOfWindows = new ArrayList<> (DriverWrapper.getDriver().getWindowHandles());

        for (int i = 1; i < listOfWindows.size(); i++){
            DriverWrapper.getDriver().switchTo().window(listOfWindows.get(i));
            DriverWrapper.getDriver().close();
        }
        DriverWrapper.getDriver().switchTo().window(listOfWindows.get(0));

    }

    //Accepts the alert
   public void acceptAlert(){
       try {
           DriverWrapper.getDriver().switchTo().alert().accept();
           Thread.sleep(3000);
           System.out.println("Alert accepted.");
       } catch (Exception e) {
           e.printStackTrace();
           System.out.println("There is no alert");

       }
   }
    //Dismiss the alert
    public void dismissAlert(){
        try {
            DriverWrapper.getDriver().switchTo().alert().dismiss(); //
            Thread.sleep(3000);
            System.out.println("Alert dismissed.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("There is no alert");

        }
    }
    //Get text from the alert
    public void getTextAlert(){
        try {
            String alertMessage = DriverWrapper.getDriver().switchTo().alert().getText();
            Thread.sleep(3000);
            System.out.println("Alert message: " + alertMessage);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("There is no alert");

        }
    }
    //Enters text to the alert
    public void sendKeysToAlert(By locator, String text) {
        try {
            DriverWrapper.getDriver().switchTo().alert().sendKeys(text);
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //getDriver().findElement(locator).sendKeys(text); ????? is it possible to have an alert where we have to locate element
        System.out.println("There is no alert");
    }
        //Switches to frame by index
        public void switchToFrame(int index){
            try {
                DriverWrapper.getDriver().switchTo().frame(index);
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Screen shot should be taken");

            }
        }
        //Switches to frame by name
        public void switchToFrame(String name){
            try {
                DriverWrapper.getDriver().switchTo().frame(name);
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Screen shot should be taken");

            }
        }
        //Switches to frame by WebElement
        public void switchToFrame(WebElement webElement) {
            try {
                DriverWrapper.getDriver().switchTo().frame(webElement);
                Thread.sleep(3000);
            } catch ( Exception e) {
                e.printStackTrace();
                System.out.println("Screen shot should be taken");

            }
        }
        //Auto complete
        public void autoComplete(List <WebElement> list, String text)  {

            for (WebElement ele : list ){
                if (ele.getText().contains(text)){
                    ele.click();
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;

                }
            }
        }

    //Mouse-over an element
    public static void mouseOverElement(By overLocator, By locator) throws InterruptedException {
        WebElement element = getDriver().findElement(overLocator);
        //Create action instance
        Actions action = new Actions(getDriver());
        action.moveToElement(element).build().perform();
        Thread.sleep(3000);
        getDriver().findElement(locator).click();
        Thread.sleep(3000);
    }


    }




