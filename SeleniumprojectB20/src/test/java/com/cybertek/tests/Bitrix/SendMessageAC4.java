package com.cybertek.tests.Bitrix;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.BtrixPrecondion;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SendMessageAC4 {
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
    public void sendMessageAC4() {
        //Verify log in
        String actualUserName = driver.findElement(By.xpath("//span[@id='user-name']")).getText();
        String expectedUserName = "helpdesk29@cybertekschool.com";
        Assert.assertEquals(actualUserName, expectedUserName, "Verification Failed!");

        // AC4,User should be able to insert videos by clicking on the video icon
        // and entering the video URL

        WebElement insertVideoButton = driver.findElement(By.xpath("//span[@class='bxhtmled-top-bar-btn bxhtmled-button-video']"));
        insertVideoButton.click();

        BrowserUtils.wait(3);

        WebElement videoURL = driver.findElement(By.xpath("//input[@id=\"video_idPostFormLHE_blogPostForm-source\"]"));

        videoURL.sendKeys("https://youtube.com/watch?v=kLJ8nlGiPCA");
        Actions actions=new Actions(driver);
        actions.doubleClick().perform();

        BrowserUtils.wait(10);

        WebElement saveButton = driver.findElement(By.xpath("//div[@class='bx-core-adm-dialog-content-wrap adm-workarea bxhtmled-dialog bxhtmled-video-dialog']/div[2]/input"));
        saveButton.click();
        BrowserUtils.wait(10);
        //WebElement checkVideo = driver.findElement(By.xpath("//img[@title=\"Video\"]"));
       // Assert.assertTrue(checkVideo.isDisplayed());
        //BrowserUtils.wait(3);

    }

}





