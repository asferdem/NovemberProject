package com.cybertek.tests.Bitrix;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.BtrixPrecondion;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SendMessageAC3 {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/stream/");

        BrowserUtils.wait(2);

        BtrixPrecondion.preCondition(driver);
    }
    @Test
    public void sendMessageAC3(){
        //Verify log in
        String actualUserName=driver.findElement(By.xpath("//span[@id='user-name']")).getText();
        String expectedUserName="helpdesk29@cybertekschool.com";
        Assert.assertEquals(actualUserName,expectedUserName,"Verification Failed!");
        //AC 3 User should be able to attach link by clicking on the link icon.
        WebElement linkButton=driver.findElement(By.xpath("//span[@title='Link']"));
        linkButton.click();
        BrowserUtils.wait(3);

        WebElement linkText=driver.findElement(By.id("linkidPostFormLHE_blogPostForm-text"));
        linkText.click();
        linkText.sendKeys("CYBERTEK");

        BrowserUtils.wait(2);
        WebElement linkURL=driver.findElement(By.id("linkidPostFormLHE_blogPostForm-href"));
        linkURL.sendKeys("https://www.cybertekschool.com");

        BrowserUtils.wait(2);

        WebElement saveButton=driver.findElement(By.xpath("//input[@value='Save']"));
        saveButton.click();
        BrowserUtils.wait(2);
        //Verify User user should be able to see Link text in message
        WebElement iframe=driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(iframe);
        String actualText= driver.findElement(By.xpath("//body/a")).getText();
        String expectedText="CYBERTEK";
        Assert.assertEquals(actualText,expectedText,"Vefification Failed!");
        System.out.println(actualText);
        driver.switchTo().defaultContent();





    }
}
