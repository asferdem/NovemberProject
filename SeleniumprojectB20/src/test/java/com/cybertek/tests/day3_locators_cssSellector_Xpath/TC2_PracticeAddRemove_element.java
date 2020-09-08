package com.cybertek.tests.day3_locators_cssSellector_Xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC2_PracticeAddRemove_element {
    public static void main(String[] args) throws InterruptedException {
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to http://practice.cybertekschool.com/add_remove_elements
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        Thread.sleep(2000);
        //3. Click to “Add Element” button
        WebElement addElementButton= driver.findElement(By.cssSelector("button[onclick='addElement()']"));
        addElementButton.click();
        //4. Verify “Delete” button is displayed after clicking.
        WebElement deleteButton=driver.findElement(By.xpath("//button[@class='added-manually']"));
        String confirmationMessage=deleteButton.getText();
        if (confirmationMessage.equals("Delete")){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
        Thread.sleep(2000);
        //5. Click to “Delete” button.
        deleteButton.click();
        //6. Verify “Delete” button is NOT displayed after clicking.


        /*if (deleteButton.isDisplayed()){
            System.out.println("Displayed");
        }else{
            System.out.println("Delete button is not displayed");
        }
*/
    }
}
