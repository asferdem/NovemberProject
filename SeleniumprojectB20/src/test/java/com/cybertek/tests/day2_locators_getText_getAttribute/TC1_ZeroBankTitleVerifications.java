package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_ZeroBankTitleVerifications {
    public static void main(String[] args) {
        //1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        // 2.Go to http://zero.webappsecurity.com/login.html
        WebDriver driver=new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        // 3.Verify titleExpected: “Zero -Log in”
        String actualTitle=driver.getTitle();
        String expectedTitle="Zero - Log in";

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
            System.out.println(actualTitle);
            System.out.println(expectedTitle);
        }

    }

}
