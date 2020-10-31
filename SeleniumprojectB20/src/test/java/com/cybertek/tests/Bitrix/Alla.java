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

public class Alla {
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
        WebElement eventTabElement = driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-calendar']/span"));
        eventTabElement.click();
        BrowserUtils.wait(1);

        WebElement addVideoElement = driver.findElement(By.xpath("//span[@id='bx-b-video-blogPostForm_calendar']"));
        addVideoElement.click();
        BrowserUtils.wait(5);

        WebElement url = driver.findElement(By.xpath("//input[@id=\"video_oCalEditorcal_3Jcl-source\"]"));
        url.sendKeys("https://vimeo.com/4617");
        BrowserUtils.wait(10);

        WebElement saveButton = driver.findElement(By.xpath("//input[@id=\"undefined\"]"));
        saveButton.click();
        BrowserUtils.wait(2);

        WebElement loadedVideo = driver.findElement(By.xpath("//img[@title=\"Video\"]"));
        Assert.assertTrue(loadedVideo.isDisplayed());
        BrowserUtils.wait(3);

    }


}
