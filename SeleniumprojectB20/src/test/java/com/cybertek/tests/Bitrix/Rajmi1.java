package com.cybertek.tests.Bitrix;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Rajmi1 {
    WebDriver driver;
    @BeforeTest
    public void setMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/stream/");
    }
    @Test
    public void LogIn(){
        WebElement userName = driver.findElement(By.xpath("//input[@class='login-inp']"));
        userName.sendKeys("helpdesk29@cybertekschool.com");
        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();
    }
    @Test
    public void clickMessage(){

        WebElement message = driver.findElement(By.xpath("//span[.='Message']/span"));
        message.click();
    }
    @Test
    public void addMention(){
        driver.get("https://login2.nextbasecrm.com/stream/");
        //  WebElement addMentionIcon = driver.findElement(By.xpath("//div[@class='feed-add-post-form-but-wrap']/span[5]"));
        WebElement addMentionIcon = driver.findElement(By.xpath("//span[@title='Quote text']"));
        addMentionIcon.click();
    }
}
