package com.cybertek.tests.Bitrix;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.BtrixPrecondion;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AC3 {
    @Test
    public void ac3Test(){
        Driver.getDriver().get("https://login2.nextbasecrm.com/stream/");
        BrowserUtils.wait(2);

        BtrixPrecondion.preCondition(Driver.getDriver());

        //AC 3 User should be able to attach link by clicking on the link icon.
        WebElement linkButton=Driver.getDriver().findElement(By.xpath("//span[@title='Link']"));
        linkButton.click();
        BrowserUtils.wait(3);

        WebElement linkText=Driver.getDriver().findElement(By.id("linkidPostFormLHE_blogPostForm-text"));
        linkText.click();
        linkText.sendKeys("CYBERTEK");

        BrowserUtils.wait(2);
        WebElement linkURL=Driver.getDriver().findElement(By.id("linkidPostFormLHE_blogPostForm-href"));
        linkURL.sendKeys("https://www.cybertekschool.com");

        BrowserUtils.wait(2);

        WebElement saveButton=Driver.getDriver().findElement(By.xpath("//input[@value='Save']"));
        saveButton.click();
        BrowserUtils.wait(2);
        //Verify User user should be able to see Link text in message
        WebElement iframe=Driver.getDriver().findElement(By.xpath("//iframe"));
        Driver.getDriver().switchTo().frame(iframe);
        String actualText= Driver.getDriver().findElement(By.xpath("//body/a")).getText();
        String expectedText="CYBERTEK";
        Assert.assertEquals(actualText,expectedText,"Vefification Failed!");
        System.out.println("Actual Text = " + actualText);
        Driver.getDriver().switchTo().defaultContent();

    }
}
