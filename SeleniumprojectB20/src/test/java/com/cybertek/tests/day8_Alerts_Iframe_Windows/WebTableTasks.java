package com.cybertek.tests.day8_Alerts_Iframe_Windows;

import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WebTableTasks {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        SmartBearUtilities.loginToSmartBear(driver);
    }
    @Test
    public void task4_VerifyOrder(){
        SmartBearUtilities.verifyOrder(driver, "Samuel Clemens");
    }

    @Test
    public void task5_PrintNamesCity(){

        SmartBearUtilities.printNamesAndCities(driver);
    }


}
