package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_GoogleTitleVerifications {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();// set up browser driver
        WebDriver driver=new ChromeDriver();// open empty browser
        driver.manage().window().maximize();// maximize browser

        driver.get("https://.www.google.com");

        String actualTitle =driver.getTitle();
        String expectedTitle="Google";

        System.out.println("actualTitle = " + actualTitle);
        System.out.println("expectedTitle = " + expectedTitle);
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test : Passed");
        }else{
            System.out.println("Test : Failed ");
        }

        driver.close();
    }
}
