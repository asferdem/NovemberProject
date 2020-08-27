package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_4_HeaderVerificationsFacebook2 {
    public static void main(String[] args) {
        //1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        // 2.Go to https://www.facebook.com
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com");
        // 3.Verify “Create a page” link href value contains text: Expected: “registration_form”
        String actualHREF=driver.findElement(By.className("_8esh")).getAttribute("href");

        String expectedInHREF="registration_form";
        System.out.println(actualHREF);

        if (actualHREF.contains(expectedInHREF)){
            System.out.println("HREF verification PASSED!");
        }else{
            System.out.println("HREF verification FAILED!!!!");
            System.out.println("Actual : "+actualHREF);
            System.out.println("Expected : "+expectedInHREF);
        }

    }
}
