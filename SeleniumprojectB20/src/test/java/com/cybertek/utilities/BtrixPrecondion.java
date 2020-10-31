package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BtrixPrecondion {
    WebDriver driver;
    public static void preCondition(WebDriver driver){


        WebElement userName = driver.findElement(By.xpath("//input[@class='login-inp']"));
        userName.sendKeys(ConfigurationReader.getProperty("username"));
        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys(ConfigurationReader.getProperty("password"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

        BrowserUtils.wait(2);

        WebElement message = driver.findElement(By.xpath("//span[.='Message']/span"));
        message.click();
        BrowserUtils.wait(2);




    }
}
