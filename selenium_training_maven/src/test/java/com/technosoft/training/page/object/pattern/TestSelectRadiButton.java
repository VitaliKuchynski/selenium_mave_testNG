package com.technosoft.training.page.object.pattern;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelectRadiButton extends DriverWrapper{

    @Test
    //Verify that mail radio-button is selected
    public void selectMailRadiIfnotSelected() {
        CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage();
        LogInPage logInPage = new LogInPage();
        //Navigates to create a new account page
        logInPage.clickOnSignUpLink();
        //Gets default value of mail radio-button and assigns it to boolean variable
        boolean isElementSelected = createNewAccountPage.getListOfRadioButtons().get(1).isSelected();
        //Verifies if mail radio button is not selected and selected it
        if (isElementSelected){
            System.out.println("Mail radio-button is already selected");
        } else {

            createNewAccountPage.getListOfRadioButtons().get(1).click();
        }
        //Verifies that radio-button is selected
        Assert.assertTrue(createNewAccountPage.getListOfRadioButtons().get(1).isSelected());

    }
}
