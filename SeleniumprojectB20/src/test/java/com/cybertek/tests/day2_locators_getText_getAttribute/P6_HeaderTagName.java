package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_HeaderTagName {
    public static void main(String[] args) {
        //: Zero Bankheader verification
        // 1.Open Chrome browser

        WebDriverManager.chromedriver().setup();
        // 2.Go to http://zero.webappsecurity.com/login.html
        WebDriver driver=new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");
        // 3.Verify header textExpected: “Log in to ZeroBank”

       String actualHeader=driver.findElement(By.tagName("h3")).getText();
       String textExpected="Log in to ZeroBank";

       if (actualHeader.equals(textExpected)){
           System.out.println("Text verification PASSED");
       }else{
           System.out.println("Text verification FAILED");
       }

    }
}
