package com.cybertek.tests.day5_ttestNG_Intro_Dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SelectingState {
    WebDriver driver;
    @BeforeMethod
    public void setDriver() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    @Test
    public void selectIlionis(){
        WebElement selectIlionis=driver.findElement(By.xpath("//option[@value='IL']"));
        selectIlionis.click();

    }
    @Test
    public void selectVirginia(){
        WebElement selectVirginia=driver.findElement(By.xpath("//option[@value='VA']"));
        selectVirginia.click();
    }
    @Test
    public void selectCalifornia(){
        WebElement selectCalifornia=driver.findElement(By.xpath("//option[@value='CA']"));
        selectCalifornia.click();
    }
    @Test
    public void selectedOption() {

        Select selectState = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        selectState.selectByIndex(5);  //index
        selectState.selectByValue("CA"); //value
        selectState.selectByVisibleText("California"); //text
        String actualState = selectState.getFirstSelectedOption().getText();
        String expectedState = "California";

        Assert.assertEquals(actualState,expectedState,"Test FAILED");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); }


}
