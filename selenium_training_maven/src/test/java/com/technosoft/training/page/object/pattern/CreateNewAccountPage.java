package com.technosoft.training.page.object.pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CreateNewAccountPage  extends BasePage {

    //Initialises variable and assigns ID of input filed first name
    private By inputFieldFirstName = By.id("u_0_m");
    //Initialises variable and assigns ID of input filed second name
    private By inputFieldSecondName = By.id("u_0_o");
    //Initialises variable and assigns ID of input filed phone
    private By inputFieldMobileNumber = By.id("u_0_r");
    //Initialises variable and assigns ID of input filed password
    private By inputFieldPassword = By.id("u_0_y");
    //Initialises variable and assigns cssSelector of sex radio button
    private By mailRadioButton = By.cssSelector("#u_0_11 span span:nth-child(2)");
    //Initialises variable and assigns cssSelector of sex radio button
    private By femaleRadioButton = By.cssSelector("#u_0_11 span span:nth-child(1)");
    //Initialises variable and assigns ID of Create New Account button
    private By createAccountButton = By.id("u_0_14");
    //Initialises variable list of all radio-buttons
    private List<WebElement> listOfRadioButtons;



    //Enters value to input field
    public void enterFirstName(String firstName) {
        inputValue(inputFieldFirstName, firstName);
    }

    //Enters value to input field
    public void enterSecondName(String secondName) {
        inputValue(inputFieldSecondName, secondName);
    }

    //Enters value to input field
    public void enterPhoneNumber(String phoneNumber) {
        inputValue(inputFieldMobileNumber, phoneNumber);
    }

    //Enters value to input field
    public void enterPassword(String password) {
        inputValue(inputFieldPassword, password);
    }

    //Checks sex radio-button
    public void checkGenderRadioButton() {
        checkRadioButton(mailRadioButton);
    }

    //Clicks on create new account button
    public void clickOnCreateButton() {
        clickOn(createAccountButton);
    }

    //Check if radio-button selected or not
    public boolean isMailRadioButtonSelected() {
        return isRadioButtonSelected(mailRadioButton);
    }

    //Verifies if gender radio-buttons displayed
    public boolean isMailRadioButtonDisplayed() {
        return isRadioButtonDisplayed(mailRadioButton);

    }

    //Verifies if gender radio-buttons enabled
    public boolean isMailRadioButtonEnabled() {
        return isRadioButtonEnabled(mailRadioButton);
    }

    //Check if radio-button selected or not
    public boolean isFemaleRadioButtonSelected() {
        return isRadioButtonSelected(femaleRadioButton);
    }

    //Verifies if female radio-buttons displayed
    public boolean isFemaleRadioButtonDisplayed() {
        return isRadioButtonDisplayed(femaleRadioButton);

    }

    //Verifies if female radio-buttons enabled
    public boolean isFimaleRadioButtonEnabled() {
        return isRadioButtonEnabled(femaleRadioButton);
    }

    //Imputes new user credentials
    public void createNewUserAccount(String firstName, String secondName, String phoneNumber, String password) {
        enterFirstName(firstName);
        enterSecondName(secondName);
        enterPhoneNumber(phoneNumber);
        enterPassword(password);
    }

    //Returns list of radio-buttons from the page
    public List<WebElement> getListOfRadioButtons() {
        listOfRadioButtons = DriverWrapper.getDriver().findElements(By.name("sex"));
        return listOfRadioButtons;
    }
    //Selects month from drop-down list
    public void selectMonthDropDown(String month)  {
        Select monthDropDown = new Select(getDriver().findElement(By.id("month")));
        selectDropdownListValue(monthDropDown, month);

    }
    //Selects day from drop-down list
    public void selectDayDropDown(String day)  {
        Select dayDropDown = new Select(getDriver().findElement(By.id("day")));
        selectDropdownListValue(dayDropDown, day);

    }
    //Selects year from drop-down list
    public void selectYearDropDown(String year)  {
        Select monthDropDown = new Select(getDriver().findElement(By.id("year")));
        selectDropdownListValue(monthDropDown, year);
    }
    //Sets  user birthday
    public void selectBirthday(String month, String day, String year){
        selectMonthDropDown(month);
        selectDayDropDown(day);
        selectYearDropDown(year);

    }
}



