package com.cybertek.tests.day11_Utilreview_Actions;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsTasksTC16DoubleClick {
/*
TC #16: Double Click Test
1. Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
2. Switch to iframe.
3. Double click on the text “Double-click me to change my text color.”
4. Assert: Text’s “style” attribute value contains “red”.
 */
    @Test
    public void doubleClickTest(){
        //Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        //Switch to iframe
        //Driver.getDriver().switchTo().frame("iframeResult");
        WebElement iframe=Driver.getDriver().findElement(By.id("iframeResult"));
        Driver.getDriver().switchTo().frame(iframe);

        //Double click on the text “Double-click me to change my text color.”
        WebElement doubleClick=Driver.getDriver().findElement(By.id("demo"));
        BrowserUtils.wait(2);

        Actions actions=new Actions(Driver.getDriver());
       // actions.moveToElement(doubleClick).doubleClick().perform();
        actions.doubleClick(doubleClick).perform();

        //Assert: Text’s “style” attribute value contains “red”
        String actualColor = doubleClick.getAttribute("style");

        Assert.assertTrue(actualColor.contains("red"),"Style attribute value does not contains red, Verification FAILED!!");



    }

}
