package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4_ZerobankLoginTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        //1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        // 2.Go to http://zero.webappsecurity.com/login.html

        WebDriver driver=new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");

        // 3.Enter username: username

        driver.findElement(By.id("user_login")).sendKeys("username");

        // 4.Enter password: password

        driver.findElement(By.id("user_password")).sendKeys("password"+ Keys.ENTER);

        //5.Click to “Account Activity” link

        driver.findElement(By.linkText("Account Activity")).click();
        Thread.sleep(3000);


        // 6.Verify title changed to:Expected: “Zero – Account Activity”

        String actualTitle=driver.getTitle();
        String expected="Zero - Account Activity";
        if (actualTitle.equals(expected)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
            System.out.println(actualTitle);
            System.out.println(expected);
        }

        // 7.Click to “Transfer Funds” link
        driver.findElement(By.id("transfer_funds_tab")).click();
        Thread.sleep(3000);

        // 8.Verify title changed to:Expected: “Zero – Transfer Funds”

        String actualTitle1=driver.getTitle();
        if (actualTitle1.equals("Zero - Transfer Funds")){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
            System.out.println("Actual : "+actualTitle1);
            System.out.println("Expected : Zero – Transfer Funds");
        }

        // 9.Click to “Pay Bills” link

        driver.findElement(By.id("pay_bills_tab")).click();
        Thread.sleep(3000);
        // 10.Verify title changed to:Expected: “Zero - Pay Bills”

        String actualTitle2=driver.getTitle();
        if (actualTitle2.equals("Zero - Pay Bills")){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
            System.out.println("Actual : "+actualTitle2);
            System.out.println("Expected : Zero - Pay Bills");
        }
        // 11.Click to “My Money Map” link
        driver.findElement(By.id("money_map_tab")).click();
        Thread.sleep(3000);

        // 12.Verify title changed to:Expected: “Zero – My Money Map”
        String actualTitle3=driver.getTitle();
        if (actualTitle3.equals("Zero - My Money Map")){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
            System.out.println("Actual : "+actualTitle3);
            System.out.println("Expected : "+"Zero – My Money Map");
        }

        // 13.Click to “Online Statements” link
        driver.findElement(By.id("online_statements_tab")).click();
        Thread.sleep(3000);

        // 14.Verify title changed to:Expected: “Zero – Online Statements”
        String actualTitle4=driver.getTitle();
        if (actualTitle4.equals("Zero - Online Statements")){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
            System.out.println("Actual : "+actualTitle4);
            System.out.println("Expected : Zero – Online Statements");
        }


    }
}
