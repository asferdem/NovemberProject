package com.cybertek.tests.day3_locators_cssSellector_Xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P4_Practice_Cybertek_Xpath {
    public static void main(String[] args) {

       WebDriver driver= WebDriverFactory.getDriver("chrome");
       driver.get("http://practice.cybertekschool.com/");
       driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[33]/a")).click();

        //driver.findElement(By.xpath("//button[@name='button2']")).click();

       WebElement button2= driver.findElement(By.xpath("//button[.='Button 2']"));
       button2.click();

    }
}
