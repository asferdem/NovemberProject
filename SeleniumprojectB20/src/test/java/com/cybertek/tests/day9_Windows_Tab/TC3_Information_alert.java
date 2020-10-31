package com.cybertek.tests.day9_Windows_Tab;

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

public class TC3_Information_alert {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    /*
    Information alert practice
1. Open browser
2. Go to website: http://practice.cybertekschool.com/javascript_alerts
3. Click to “Click for JS Prompt” button
4. Send “hello” text to alert
5. Click to OK button from the alert
6. Verify “You entered: hello” text is displayed.
     */
    @Test
    public void p3_prompt_Alert_practice(){

        WebElement promtAlertButton=driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        promtAlertButton.click();

        Alert alert=driver.switchTo().alert();
        BrowserUtils.wait(2);
        alert.sendKeys("Something is happening");
        BrowserUtils.wait(2);
        alert.accept();

        driver.switchTo().parentFrame();
        WebElement result=driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(result.isDisplayed(),"Message is not displayed!");

    }




}
