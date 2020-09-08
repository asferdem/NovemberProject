package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2_ZeroBAnLinkTestVerification {
    public static void main(String[] args) {
        //1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        // 2.Go to http://zero.webappsecurity.com/login.html
        WebDriver driver=new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        // 3.Verify link text from top left:Expected: “Zero Bank”

       String actualText= driver.findElement(By.className("brand")).getText();
       String expectedText="Zero Bank";
        if (actualText.equals(expectedText)) {
            System.out.println("Text verification PASSED!");
        }else{
            System.out.println("Text verification FAILED!!!!!");
        }

        // 4.Verify link hrefattribute value contains:Expected: “index.htm

        String actualHREF=driver.findElement(By.className("brand")).getAttribute("href");
        String expectedHREF="index.html";

        if (actualHREF.contains(expectedHREF)) {
            System.out.println("HREF verification PASSED!");

        }else{
            System.out.println("HREF verification FAILED!!!!!!");
        }
    }
}
