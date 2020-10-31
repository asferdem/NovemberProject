package com.cybertek.tests.day11_Utilreview_Actions;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsTask17HoverTest {
    /*
    TC #16: Hover Test
1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
2. Drag and drop the small circle to bigger circle.
3. Assert:
-Text in big circle changed to: “You did great!”
     */
    @Test
    public void hoverTest(){
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        BrowserUtils.wait(3);
        WebElement acceptCookiesButton = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        acceptCookiesButton.click();

        WebElement source=Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));
        WebElement target=Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));
        String actual1=target.getText();
        Actions actions=new Actions(Driver.getDriver());

        BrowserUtils.wait(5);
        actions.dragAndDrop(source, target).perform();
        String actual2=target.getText();
       // System.out.println("actual1 = " + actual1);
       // System.out.println("actual2 = " + actual2);

        Assert.assertTrue(actual2.equals("You did great!"));


    }
}
