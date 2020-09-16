package com.cybertek.tests.day4_findElementS_Checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC0FindelemetsPractice1 {
    public static void main(String[] args) {
       //TC #0: FINDELEMENTS
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //2. Go to https://www.merriam-webster.com/
        driver.get("https://www.merriam-webster.com/");
        //3. Print out the texts of all links

        int linkWithoutText=0;
        int linkWithText=0;
        List<WebElement> listOfLinks= driver.findElements(By.xpath("//body//a"));
        for (WebElement eachLink:listOfLinks){
            String textOfEachLink = eachLink.getText();

            System.out.println(textOfEachLink);

            if (textOfEachLink.isEmpty()){
                linkWithoutText++;

            }else{
                linkWithText++;
            }
        }
        //4. Print out how many link is missing text

        System.out.println("The number of links does not have text : "+linkWithoutText);

        //5. Print out how many link has text
        System.out.println("The number of link has text : "+linkWithText);
        //6. Print out how many total link
        System.out.println("number of Total links on this page : "+ listOfLinks.size());
    }
}
