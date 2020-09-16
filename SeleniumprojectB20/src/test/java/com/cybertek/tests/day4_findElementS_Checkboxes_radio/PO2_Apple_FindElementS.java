package com.cybertek.tests.day4_findElementS_Checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PO2_Apple_FindElementS {
    public static void main(String[] args) {
        //TC #02: FINDELEMENTS_APPLE
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //2. Go to https://www.apple.com
        driver.get("https://www.apple.com");
        //3. Click to iPhone                                //a[@class='ac-gn-link ac-gn-link-iphone']
        WebElement iphoneLink=driver.findElement(By.xpath("//a[@href='/iphone/']"));
        iphoneLink.click();

        //4. Print out the texts of all links
        List<WebElement> listOfLinkText = driver.findElements(By.xpath("//body//a"));
                int missingTextNumber=0;
                int hasTextNumber=0;
        for (WebElement eachLink:listOfLinkText){
            String linkText=eachLink.getText();
            System.out.println(linkText);
            if (linkText.isEmpty()){
                missingTextNumber++;
            }else{
                hasTextNumber++;
            }
        }
        //5. Print out how many link is missing text
        System.out.println("Missing Text Link Number : "+missingTextNumber);
        //6. Print out how many link has text
        System.out.println("Text number : "+hasTextNumber);
        //7. Print out how many total link
        System.out.println("Total Link Number : "+listOfLinkText.size());
    }
}
