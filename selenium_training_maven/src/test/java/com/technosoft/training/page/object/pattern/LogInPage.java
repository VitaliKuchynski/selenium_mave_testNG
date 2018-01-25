package com.technosoft.training.page.object.pattern;

import org.openqa.selenium.By;


public class LogInPage extends BasePage {


    //Initialises variable type By
    public By signUpLink = By.linkText("Sign Up");

    //Gets link and clicks on it
    public void clickOnSignUpLink(){
        clickOn(signUpLink);

    }


}
