package com.cybertek.tests.day3_locators_cssSellector_Xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_Amazon_Practice_cssCellector {
    public static void main(String[] args) {
        //CSSPracticeDO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        // TC #3: Amazon link number verification
        // 1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        // 2. Go to https://www.amazon.com
        driver.get("https://www.amazon.com");
        // 3. Enter search term (use cssSelectorto locate search box)
        //WebElement searchBox =driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));

        WebElement searchBox1=driver.findElement(By.cssSelector("input#twotabsearchtextbox"));


        searchBox1.sendKeys("wooden spoon"+ Keys.ENTER);
        // 4. Verify title contains search term

        String expectedTitle="wooden spoon";
        String actualTitle=driver.getTitle();
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Passed");
        }else {
            System.out.println("failed");
        }


    }
}
