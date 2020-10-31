package com.cybertek.tests.day12_review_jsexecutor_pom;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsPractices {
    /*
        TC #16: Hover Test
1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
2. Drag and drop the small circle to bigger circle.
3. Assert:
-Text in big circle changed to: “You did great!”

     */
    @Test
    public void hoverTest(){
        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        Driver.getDriver().manage().window().maximize();

        //2. Drag and drop the small circle to bigger circle.
        BrowserUtils.wait(3);
        WebElement acceptCookiesButton = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        acceptCookiesButton.click();
        //Locating circles
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        BrowserUtils.wait(3);

        Actions actions = new Actions(Driver.getDriver());
        //DragAndDrop method expects to arguments:
        // #1-Which webElement you want to drag : SOURCE
        // #2-Where do you want to drop it? : TARGET
        actions.dragAndDrop(smallCircle, bigCircle).perform();

        //3. Assert:
        //-Text in big circle changed to: “You did great
        String expected = "You did great!";
        String actual = bigCircle.getText();

        Assert.assertTrue(actual.equals(expected));



        BrowserUtils.wait(10);
        Driver.closeDriver();


    }


    @Test
    public void hoverTest1(){
//1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        Driver.getDriver().manage().window().maximize();

        //2. Drag and drop the small circle to bigger circle.
        BrowserUtils.wait(3);
        WebElement acceptCookiesButton = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        acceptCookiesButton.click();
        //Locating circles
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        BrowserUtils.wait(3);

        Actions actions = new Actions(Driver.getDriver());
        //DragAndDrop method expects to arguments:
        // #1-Which webElement you want to drag : SOURCE
        // #2-Where do you want to drop it? : TARGET
        //actions.dragAndDrop(smallCircle, bigCircle).perform();

        //actions.clickAndHold(smallCircle).moveToElement(bigCircle).release().perform();
        actions.clickAndHold(smallCircle).perform();
        BrowserUtils.wait(3);

        actions.moveToElement(bigCircle).perform();
        BrowserUtils.wait(3);

        actions.release().perform();


        //3. Assert:
        //-Text in big circle changed to: “You did great
        String expected = "You did great!";
        String actual = bigCircle.getText();

        Assert.assertTrue(actual.equals(expected));



        BrowserUtils.wait(10);
        Driver.closeDriver();



    }

}
