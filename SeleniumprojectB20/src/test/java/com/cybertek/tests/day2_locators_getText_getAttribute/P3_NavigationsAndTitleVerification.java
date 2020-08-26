package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationsAndTitleVerification {
    public static void main(String[] args) {

    //TC #3: Back and forth navigation
        // 1-Open a chrome browser
        WebDriverManager.chromedriver().setup();
        // 2-Go to: https://google.com
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        //3-Click to Gmail from top right.
        driver.findElement(By.linkText("Gmail")).click();
       // driver.findElement(By.partialLinkText("mail")).click();
        //4-Verify title contains:Expected: Gmail
        String actualTitle=driver.getTitle();
        String expectedTitle="Gmail";
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title Verification : PASSED!");
        }else{
            System.out.println("Title Verification :FAILED!!!");
        }
        //5-Go back to Google by using the .back();
        driver.navigate().back();
        //6-Verify title equals:Expected: Google
        if(driver.getTitle().equals("Google")){
            System.out.println("Google Title Verification : PASSED!");
        }else{
            System.out.println("Google Title Verification :FAILED!!!");
        }

    }
}
