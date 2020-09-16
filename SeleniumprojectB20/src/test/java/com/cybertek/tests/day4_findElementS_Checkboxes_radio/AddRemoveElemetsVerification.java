package com.cybertek.tests.day4_findElementS_Checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddRemoveElemetsVerification {
    public static void main(String[] args) {
        //C #3: PracticeCybertek.com_AddRemoveElements WebElement verification
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //2. Go to http://practice.cybertekschool.com/add_remove_elements
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        //3. Click to “Add Element” button 50 times
        for (int i =0;i<50;i++){
            driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        }
        //4. Verify 50 “Delete” button is displayed after clicking.
        int deleteButtonNumber=0;
        List<WebElement> deleteButton = driver.findElements(By.xpath("//div[@id='elements']/button"));
        for (WebElement eachButton:deleteButton){
            String deleteText=eachButton.getText();
            if (deleteText.equals("Delete")){
                deleteButtonNumber++;
            }
        }
        if (deleteButtonNumber==50){
            System.out.println("Delete Button Verification PASSED!!");
        }else{
            System.out.println("Verification FAILED!!!!!!!!");
        }
        //5. Click to ALL “Delete” buttons to delete them.
        for (int i =0;i<50;i++){
            driver.findElement(By.xpath("//div[@id='elements']/button")).click();
        }
        //6. Verify “Delete” button is NOT displayed after clicking.
        List<WebElement> elements = driver.findElements(By.xpath("//body//a"));
        for (WebElement eachLink:elements){
            if (!(eachLink.getText().contains("Delete"))){
                System.out.println("Remove Delete Button Verifications PASSED!!");
            }else{
                System.out.println("Remove Delete Button Verifications FAILED!!!!!");
            }
        }

        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
        //Hint: Need to use findElements method.
    }
}
