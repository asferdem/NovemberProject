package com.cybertek.tests.day5_ttestNG_Intro_Dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNGPractices {
    WebDriver driver;
    @BeforeMethod
    public void setUoMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Go to google
        driver.get("https://www.google.com");
    }

    @Test
    public void googleTitleVerifications(){
        // Go to google
        driver.get("https://www.google.com");
        // verify title is google
        String expectedTitle="Google";
        String  actualTitle=driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle,"Titles are not matching");
    }

    @Test
    public void googleSearchTitleVerification(){

        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("apple"+ Keys.ENTER);

        String expectedInTitle="apple";
        String actualTitle=driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle),"Title does not contain search value");

    }








    @AfterMethod
    public void tearDownMethod() throws InterruptedException{
        Thread.sleep(1000);
        driver.close();
    }

}
