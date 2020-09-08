package com.cybertek.tests.day3_locators_cssSellector_Xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WT_CybertekLinkVerification {
    public static void main(String[] args) throws InterruptedException {
        //TC #3: PracticeCybertek/ForgotPassword URL verification
        // 1.Open Chrome browser
       // WebDriverManager.chromedriver().setup();
       // WebDriver driver=new ChromeDriver();
        WebDriver driver=WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        Thread.sleep(2000);
        // 2.Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        // 3.Enter any email into input box
       // driver.findElement(By.name("email")).sendKeys("asf@gmail.com");
        Thread.sleep(2000);
        WebElement emailInputBox=driver.findElement(By.name("email"));
        emailInputBox.sendKeys("asf@gmail.com");

        // 4.Click on Retrieve password
        driver.findElement(By.id("form_submit")).click();
        // 5.Verify URL contains: Expected: “email_sent”

        String actualUrl=driver.getCurrentUrl();
        System.out.println(actualUrl);
        String insideUrl="email_sent";
        if (actualUrl.contains(insideUrl)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
        // 6.Verify textbox displayed the content as expected.Expected: “Your e-mail’s been sent
        WebElement confirmationMessage=driver.findElement(By.tagName("h4"));

        String textBox=confirmationMessage.getText();
        System.out.println(textBox);
       if (textBox.equals("Your e-mail's been sent!")){
          System.out.println("passed");
       }else {
           System.out.println("failed");
       }
        if (confirmationMessage.isDisplayed()){
            System.out.println("Passed!");
        }else{
            System.out.println("failed!!");
        }

    }
}
