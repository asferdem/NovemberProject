package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2_CybertekVerifications {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cybertekschool.com");
        String actualTitle=driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        String expectedTitle="Practice";
        System.out.println("expectedTitle = " + expectedTitle);

        String actualURL=driver.getCurrentUrl();
        System.out.println("ActualURL = " + actualURL);
        String expected="cybertekschool";
        System.out.println("Expected Result : "+expected);

        if (actualURL.contains("cybertekschool")){
            System.out.println("Test result : Passed");
        }else{
            System.out.println("Test result : Failed");
            System.out.println("ActualURL = " + actualURL);
            System.out.println("Expected Result = " + expected);
        }
        System.out.println("=============================================");
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Test result : Passed");
        }else{
            System.out.println("Test result : Failed");
            System.out.println("actualTitle = " + actualTitle);
            System.out.println("expectedTitle = " + expectedTitle);
        }
    }
}
