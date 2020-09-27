package com.cybertek.tests.day8_Alerts_Iframe_Windows;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Alerts_Practices {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void p1_InformationsAlert_Practice(){

        WebElement alertJSButton=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        alertJSButton.click();
        BrowserUtils.wait(2);

        Alert alert=driver.switchTo().alert();
        alert.accept();

        WebElement resultText=driver.findElement(By.id("result"));

        Assert.assertTrue(resultText.isDisplayed(),"Result text is not displayed Verification FAILED!!");

    }

    @Test
    public  void p2_confirmationAlertPractice() {
        //Locating the warning/information alert button to click it
        WebElement warningAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));

        //click to the button
        warningAlertButton.click();
        BrowserUtils.wait(2);

        Alert alert=driver.switchTo().alert();
        alert.accept();

        WebElement resultText=driver.findElement(By.id("result"));

        Assert.assertTrue(resultText.isDisplayed(),"Result text is not displayed Verification FAILED!!");


    }

}