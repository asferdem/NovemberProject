package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_2_VerificationFacebookTitle {
    public static void main(String[] args) throws InterruptedException {
        //1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        // 2.Go to https://www.facebook.com
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        // 3.Enter incorrect username
        driver.findElement(By.id("email")).sendKeys("asf@hat.mail.com");
        // 4.Enter incorrect password
        Thread.sleep(2000);
        driver.findElement(By.name("pass")).sendKeys("123456"+Keys.ENTER);
        // 5.Verify title changed to: Expected: “Log into Facebook | Facebook”
        Thread.sleep(2000);
            String actualTitle=driver.getTitle();
            String  expectedTitle="Log into Facebook | Facebook";
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
            System.out.println("Actual Title : "+actualTitle);
            System.out.println("Expected Title :"+expectedTitle);
        }
    }
}
