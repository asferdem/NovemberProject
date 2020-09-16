package com.cybertek.tests.day4_findElementS_Checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumEasyCheckboxVerification1 {
    public static void main(String[] args) {
        //TC #2: SeleniumEasy Checkbox Verification – Section 1
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //2. Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        //3. Verify “Success – Check box is checked” message is NOT displayed.
        WebElement successCheckbox= driver.findElement(By.xpath("//div[@id='txtAge']"));
        if (!successCheckbox.isDisplayed()){
            System.out.println("\"Success – Check box is checked message\" is not display Verification PASSED");
        }else{
            System.out.println("\"Success – Check box is checked message\"  display Verification FAILED");
        }
        //4. Click to checkbox under “Single Checkbox Demo” section
        WebElement singleCheckboxDemo=driver.findElement(By.xpath("//input[@type='checkbox']"));
        singleCheckboxDemo.click();
        //5. Verify “Success – Check box is checked” message is displayed.
        if (successCheckbox.isDisplayed()){
            System.out.println("\"Success – Check box is checked message\" is  display Verification PASSED");
        }else{
            System.out.println("\"Success – Check box is checked message\" is not display Verification FAILED");
        }
    }
}
