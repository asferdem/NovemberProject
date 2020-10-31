package com.cybertek.tests.day11_Utilreview_Actions;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsTaskTC18ContextClick {
    /*
    C #17: Context Click – HOMEWORK
1. Go to https://the-internet.herokuapp.com/context_menu
2. Right click to the box.
3. Alert will open.
4. Accept alert
No assertion needed for this practice.
     */
    @Test
    public void contextClickTest(){
        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");
        BrowserUtils.wait(2);
        WebElement box=Driver.getDriver().findElement(By.xpath("//div[@id='hot-spot']"));

        Actions actions=new Actions(Driver.getDriver());
        actions.contextClick(box).perform();
        BrowserUtils.wait(2);

        Alert alert=Driver.getDriver().switchTo().alert();
        alert.accept();
    }
}
