package com.cybertek.tests.day4_findElementS_Checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC0Findelements {
    public static void main(String[] args) {
        //TC #0: FINDELEMENTS
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        //3. Print out the texts of all links
       List<WebElement> listOflinks= driver.findElements(By.xpath("//body//a"));
       // List<WebElement> elements = driver.findElements(By.xpath("//body//a")); Alt enter shortcut
        for (WebElement eachlink:listOflinks) {
            System.out.println(eachlink.getText());

        }

        //4. Print out how many total link
        int numberoflink=listOflinks.size();
        System.out.println("Number of link : "+numberoflink);
    }
}
