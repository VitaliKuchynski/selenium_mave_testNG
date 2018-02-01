package com.technosoft.training.expedia;


import com.technosoft.training.page.object.pattern.facebook.CreateNewAccountPage;
import configuration.DriverWrapper;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestAlert extends DriverWrapper {

    @Test
    public void workWithAlerts(){
        CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage();
        //Switch to frame
        createNewAccountPage.switchToFrame("iframeResult");
        getDriver().findElement(By.xpath("/html/body/button")).click();
        //Verify alert appears
        createNewAccountPage.getTextAlert();
        createNewAccountPage.acceptAlert();
    }


}
