package com.cybertek.tests.day5_ttestNG_Intro_Dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropDownIntroduction {
    WebDriver driver;

    @BeforeMethod
    public void setUoMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

        @Test
        public void dropdownTest1 () throws InterruptedException {
            //TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
            //3. Verify “Simple dropdown” default selected value is correct
            //Expected: “Please select an option”
            Select simpleDropdown= new Select(driver.findElement(By.id("dropdown")));

            String actualResult=simpleDropdown.getFirstSelectedOption().getText();
            String expectedResult="Please select an option";

            Assert.assertEquals(actualResult, expectedResult);
            Thread.sleep(2000);
            simpleDropdown.selectByVisibleText("Option 2");
            //4. Verify “State selection” default selected value is correct
            //Expected: “Select a State”

            Select stateSelection=new Select(driver.findElement(By.id("state")));

            String actualResult1=stateSelection.getFirstSelectedOption().getText();
            String expectedResult1="Select a State";

            Assert.assertEquals(actualResult1, expectedResult1);
        }

}