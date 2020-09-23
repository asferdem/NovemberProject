package com.cybertek.tests.day7_WebTable_Handling;

import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Smartbear_Table_verification {
    //TC#3: Smartbear software order verification
    //1. Open browser and login to Smartbear software
    //2. Click on View all orders
    //3. Verify Susan McLaren has order on date “01/05/2010”
    WebDriver driver;
    @BeforeMethod
    public void setupMethod() {
        //open a new browser
        driver = WebDriverFactory.getDriver("chrome");
        //maximize the page
        driver.manage().window().maximize();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //get the page
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        SmartBearUtilities.loginToSmartBear(driver);
    }
        @Test
        public void p3_Verify_susans_order_date () {
            WebElement susansDate=driver.findElement(By.xpath("//td[.='Susan McLaren']/following-sibling::td[3]"));
            //System.out.println("susansDate = " + susansDate.getText());
            String  expectedDate="01/05/2010";
            String  actualDate=susansDate.getText();
            Assert.assertEquals(actualDate, expectedDate,"not equal");
            Assert.assertTrue(actualDate.equals(expectedDate));

            //TODO:Someting
        }

    }
