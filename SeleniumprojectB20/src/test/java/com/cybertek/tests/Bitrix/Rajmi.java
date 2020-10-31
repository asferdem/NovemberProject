package com.cybertek.tests.Bitrix;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Rajmi {
    WebDriver driver;
    @BeforeTest
    public void setMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/stream/");

        WebElement userName = driver.findElement(By.xpath("//input[@class='login-inp']"));
        userName.sendKeys("helpdesk29@cybertekschool.com");
        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();
    }


    @Test
    public void clickMessage() {
        WebElement message = driver.findElement(By.xpath("//span[.='Message']/span"));
        message.click();
        BrowserUtils.wait(2);


        WebElement quote = driver.findElement(By.xpath("//span[@title='Quote text']"));
        quote.click();
        BrowserUtils.wait(2);

        WebElement iframe=driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(iframe);
        WebElement message1 = driver.findElement(By.xpath("//blockquote[@class='bxhtmled-quote']"));
        message1.sendKeys("Think every day positive.");
        //  WebElement addMentionIcon = driver.findElement(By.xpath("//div[@class='feed-add-post-form-but-wrap']/span[5]"));
        BrowserUtils.wait(5);
        driver.switchTo().defaultContent();

        WebElement save=driver.findElement(By.xpath("//button[@class='ui-btn ui-btn-lg ui-btn-primary']"));
        save.click();


    }//blockquote[@class='bxhtmled-quote']
    @Test
            public void addMention() {
        WebElement message = driver.findElement(By.xpath("//span[.='Message']/span"));
        message.click();
        BrowserUtils.wait(2);




        // WebElement addMentionIcon = driver.findElement(By.xpath("//div[@class='feed-add-post-form-but-wrap']/span[5]"));
       // driver.get("https://login2.nextbasecrm.com/stream/?login=yes");
        WebElement addMentionIcon = driver.findElement(By.xpath("//span[@title='Add mention']"));
        addMentionIcon.click();
        BrowserUtils.wait(2);
        WebElement employeesDepartments = driver.findElement(By.xpath("//div[@class='bx-finder-box-tabs']/a[2]"));
        employeesDepartments.click();
        BrowserUtils.wait(3);

        WebElement choseOne=driver.findElement(By.xpath("//div[@id='bx-lm-category-relation-129']/a[4]"));
        choseOne.click();




    }


    }

