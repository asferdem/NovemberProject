package com.cybertek.tests.day9_Windows_Tab;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandlingPractices {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
/*
: Window Handle practice
1. Create a new class called: WindowHandlePractice
2. Create new test and make set ups
3. Go to : http://practice.cybertekschool.com/windows
4. Assert: Title is “Practice”
5. Click to: “Click Here” text
6. Switch to new Window.
7. Assert: Title is “New Window”
 */
    @Test
    public void p5_window_handling(){
        driver.get("http://practice.cybertekschool.com/windows");
        String actualTitle=driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertTrue(actualTitle.equals("Practice"));

        WebElement clickHereLink=driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();


        String titleAfterClick=driver.getTitle();
        System.out.println("titleAfterClick = " + titleAfterClick);

        String mainHandle=driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);

        Set<String> windowHandles= driver.getWindowHandles();
        for (String each : windowHandles) {
            driver.switchTo().window(each);
            System.out.println("Current title is : "+driver.getTitle());
        }

        Assert.assertTrue(driver.getTitle().equals("New Window"));
        BrowserUtils.wait(2);
        driver.close();
        driver.switchTo().window(mainHandle);

    }
    @Test
    public void p6_Handling_Window_more_than_Two(){
        driver.get("https://www.amazon.com");

        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");


        Set<String> windowHandles = driver.getWindowHandles();

        for (String each: windowHandles) {
            BrowserUtils.wait(1);
            driver.switchTo().window(each);

            System.out.println("Current page title : "+driver.getTitle());
            if (driver.getCurrentUrl().contains("etsy")){
                Assert.assertTrue(driver.getTitle().contains("Etsy"));
                break;
            }

        }

    }


}
