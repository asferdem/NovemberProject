package com.cybertek.tests.day10_testBasePrapertiesDriverUtil;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DriverUtilsPractice {

    @Test
    public void simple_google_search_test(){
        Driver.getDriver().get("https://google.com");

        WebElement searchBox=Driver.getDriver().findElement(By.name("q"));
        String search= ConfigurationReader.getProperty("searchValue");

        searchBox.sendKeys(search+ Keys.ENTER);

        String expectedTitle=search;
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));

        BrowserUtils.wait(5);

    }
}
