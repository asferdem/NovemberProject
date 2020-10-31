package com.cybertek.tests.Bitrix;

import com.cybertek.pages.BitrixHomePage;
import com.cybertek.pages.BitrixLoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SendMessageAC_3_4_POM {
    BitrixLoginPage bitrixLoginPage;
    BitrixHomePage bitrixHomePage;
    @Test
    public void sendMessage_AC3_attachLinkTest(){

        //AC 3 User should be able to attach link by clicking on the link icon.
        Driver.getDriver().get(ConfigurationReader.getProperty("bitrixURL"));
        BrowserUtils.wait(2);

        bitrixLoginPage=new BitrixLoginPage();
        bitrixLoginPage.login(ConfigurationReader.getProperty("bitrixUserName"),
                              ConfigurationReader.getProperty("bitrixPassword"));

        bitrixHomePage=new BitrixHomePage();
        bitrixHomePage.messageModule.click();
        BrowserUtils.wait(2);

        bitrixHomePage.linkButton.click();
        BrowserUtils.wait(2);

        bitrixHomePage.linkText.sendKeys("CYBERTEK");
        BrowserUtils.wait(2);

        bitrixHomePage.linkURL.sendKeys("https://www.cybertekschool.com");
        BrowserUtils.wait(2);

        bitrixHomePage.saveLink.click();
        BrowserUtils.wait(2);
        //Verify User user should be able to see Link text in message
        Driver.getDriver().switchTo().frame(bitrixHomePage.iframe);
        String actualText=bitrixHomePage.actualText.getText();
        String expectedText="CYBERTEK";

        Assert.assertEquals(actualText, expectedText,"Verifications Failed!!!");
        Driver.getDriver().switchTo().defaultContent();

    }
    @Test
    public void sendMessage_AC4_insertVideoTest(){
        // AC4,User should be able to insert videos by clicking on the video icon
        // and entering the video URL
        Driver.getDriver().get(ConfigurationReader.getProperty("bitrixURL"));
        BrowserUtils.wait(2);
        bitrixLoginPage=new BitrixLoginPage();
        bitrixLoginPage.login(ConfigurationReader.getProperty("bitrixUserName"),ConfigurationReader.getProperty("bitrixPassword"));

        bitrixHomePage=new BitrixHomePage();
        bitrixHomePage.messageModule.click();
        BrowserUtils.wait(2);

        bitrixHomePage.insertVideoButton.click();
        BrowserUtils.wait(3);

        bitrixHomePage.videoURL.sendKeys("https://www.youtube.com/watch?v=_oD9DWQvDYA");
        BrowserUtils.wait(5);
        bitrixHomePage.videoURL.sendKeys(Keys.ENTER);

        Driver.getDriver().findElement(By.xpath("//td[@class='bxhtmled-left-c']")).click();
        BrowserUtils.wait(2);
        bitrixHomePage.saveVideo.click();
        BrowserUtils.wait(10);

        //Assert.assertTrue(bitrixHomePage.checkVideo.isDisplayed());











    }


}
