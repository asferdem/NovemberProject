package com.cybertek.tests.Tasks;

import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SmartBearVerifyMethodTest {
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

    public void verifyOrderTest(){
        SmartBearUtilities.verifyOrder(driver, "Charles Dodgeson");
    }




}
