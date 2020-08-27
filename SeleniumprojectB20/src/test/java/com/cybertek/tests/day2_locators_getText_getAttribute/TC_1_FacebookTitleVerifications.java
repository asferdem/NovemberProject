package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_1_FacebookTitleVerifications {
    public static void main(String[] args) {
        //1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
// 2.Go to https://www.facebook.com
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
// 3.Verify title: Expected: “Facebook - Log In or Sign Up”

    String actualTitle=driver.getTitle();
    String expectedTitle="Facebook - Log In or Sign Up";

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
            System.out.println(actualTitle);
            System.out.println(expectedTitle);
        }







    }






}
