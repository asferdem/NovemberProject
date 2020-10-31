package com.cybertek.tests.day10_testBasePrapertiesDriverUtil;

import com.cybertek.tests.Base.TestBase;
import com.cybertek.utilities.SmartBearUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;


public class TC1_SmertBearTasks9_10_11 extends TestBase {

    /*
TC #9: SmartBear delete order
1. Open browser and login to SmartBear
2. Delete “Mark Smith” from the list
3. Assert it is deleted from the list
 */
    @Test
    public void P9_DeleteOrderTest() throws IOException {
        Properties properties=new Properties();
        FileInputStream file=new FileInputStream("configuration.properties");
        properties.load(file);
        String url=properties.getProperty("smartbearUrl");
        driver.get(url);
       // driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        SmartBearUtilities.loginToSmartBear(driver);
        //Locate checkbox Mark Smith and click
        WebElement markSmithCheckBox=driver.findElement(By.xpath("//td[.='Mark Smith']/../td[1]"));
        //WebElement MarkSmithCheckBox1 = driver.findElement(By.xpath("//td[.='Mark Smith']/preceding-sibling::td[1]"));
        markSmithCheckBox.click();
        //Locate delete selected button and click
        WebElement deleteButton=driver.findElement(By.id("ctl00_MainContent_btnDelete"));
        deleteButton.click();
        //Aserrt delete fonction

        List<WebElement> nameList=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));

        for (WebElement each : nameList) {
            Assert.assertFalse(each.getText().equals("Mark Smith"));
        }

    }
}
