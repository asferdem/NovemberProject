package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_ZerobankLoginTitleVerifications {
    public static void main(String[] args) {
        //1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        // 2.Go to http://zero.webappsecurity.com/login.html

        WebDriver driver=new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        // 3.Enter username: username
        driver.findElement(By.id("user_login")).sendKeys("username");
        // 4.Enter password: password
        driver.findElement(By.id("user_password")).sendKeys("password"+ Keys.ENTER);
        // 5.Verify title changed to:Expected: “Zero –Account Summary”
         String actualTitle=driver.getTitle();
        System.out.println(actualTitle);
         String expectedTitle="Zero – Account Summary";

         if (actualTitle.equals(expectedTitle)){
             System.out.println("Title Verifications PASSED!");
         }else{
             System.out.println("Title Verifications FAILED!!!");
             System.out.println("Actual: "+actualTitle);
             System.out.println("Expected : "+expectedTitle);
         }
    }
}
