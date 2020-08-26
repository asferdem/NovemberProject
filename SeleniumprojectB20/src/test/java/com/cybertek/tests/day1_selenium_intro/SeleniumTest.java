package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {
        //1- set up the web driver
        WebDriverManager.chromedriver().setup();
        //2- create the instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //3- test if driver is working
        driver.get("https://www.google.com");

        System.out.println("The title of the page is : "+driver.getTitle());
        String actualTitle=driver.getTitle();
        System.out.println("ACTUAL TITLE STRING IS : "+actualTitle);

        System.out.println("==============================");

        System.out.println("This is current URL is :"+driver.getCurrentUrl());
        String  actualURL=driver.getCurrentUrl();
        System.out.println("This is current URL is : "+actualURL);

        System.out.println("actualURL = " + actualURL);// shortcut is actualURL.soutv

        Thread.sleep(1000);

        System.out.println("==============================");

        driver.navigate().back();// its use back button in web page
        Thread.sleep(1000);
        driver.navigate().forward();//its use forward button in web page
        Thread.sleep(1000);
        driver.navigate().refresh();//its use refresh button in web page

        Thread.sleep(1000);
        driver.navigate().to("https://www.facebook.com");
        driver.navigate().to("https://www.youtube.com");
        driver.navigate().to("https://www.bing.com");

        driver.close();//close last one  browser



       // String pageSource=driver.getPageSource();
        //System.out.println("pageSource = " + pageSource);



    }
}
