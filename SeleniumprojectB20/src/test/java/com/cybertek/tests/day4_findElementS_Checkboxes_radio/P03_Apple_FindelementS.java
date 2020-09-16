package com.cybertek.tests.day4_findElementS_Checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_Apple_FindelementS {
    public static void main(String[] args) throws InterruptedException {
        //TC #03: FINDELEMENTS_APPLE
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //2. Go to https://www.apple.com
        driver.get("https://www.apple.com");
        Thread.sleep(2000);
        //3. Click to all of the headers one by one
        //a. Mac, iPad, iPhone, Watch, TV, Music, Suppor

         //Mac
        WebElement macLink=driver.findElement(By.xpath("//ul[@class='ac-gn-list']/li[2]"));
        macLink.click();
        Thread.sleep(2000);
        List<WebElement> macPageLinks = driver.findElements(By.xpath("//body//a"));
        int macPageWithoutTitleNumber=0;
        int macPageWithTitleNumber=0;
        for (WebElement eachLink:macPageLinks){
            String  linkText=eachLink.getText();
            if (linkText.isEmpty()){
                macPageWithoutTitleNumber++;
            }else{
                macPageWithTitleNumber++;

            }
        }
        System.out.println("=====================================");
        //iPad
        WebElement iPadLink=driver.findElement(By.xpath("//ul[@class='ac-gn-list']/li[3]"));
        iPadLink.click();
        Thread.sleep(2000);
        List<WebElement> iPadPageLinks = driver.findElements(By.xpath("//body//a"));
        int iPadPageWithoutTitleNumber=0;
        int iPadPageWithTitleNumber=0;
        for (WebElement eachLink:iPadPageLinks){
            String  linkText=eachLink.getText();
            if (linkText.isEmpty()){
                iPadPageWithoutTitleNumber++;
            }else{
                iPadPageWithTitleNumber++;

            }
        }
        //iPhone
        WebElement iPhoneLink=driver.findElement(By.xpath("//ul[@class='ac-gn-list']/li[4]"));
        iPhoneLink.click();
        Thread.sleep(2000);
        List<WebElement> iPhonePageLinks = driver.findElements(By.xpath("//body//a"));
        int iPhonePageWithoutTitleNumber=0;
        int iPhonePageWithTitleNumber=0;
        for (WebElement eachLink:iPhonePageLinks){
            String  linkText=eachLink.getText();
            if (linkText.isEmpty()){
                iPhonePageWithoutTitleNumber++;
            }else{
                iPhonePageWithTitleNumber++;

            }
        }
        //Watch
        WebElement watchLink=driver.findElement(By.xpath("//ul[@class='ac-gn-list']/li[5]"));
        watchLink.click();
        Thread.sleep(2000);
        List<WebElement> watchPageLinks = driver.findElements(By.xpath("//body//a"));
        int watchPageWithoutTitleNumber=0;
        int watchPageWithTitleNumber=0;
        for (WebElement eachLink:watchPageLinks){
            String  linkText=eachLink.getText();
            if (linkText.isEmpty()){
                watchPageWithoutTitleNumber++;
            }else{
                watchPageWithTitleNumber++;

            }
        }
        //TV
        WebElement tvLink=driver.findElement(By.xpath("//ul[@class='ac-gn-list']/li[6]"));
        tvLink.click();
        Thread.sleep(2000);
        List<WebElement> tvPageLinks = driver.findElements(By.xpath("//body//a"));
        int tvPageWithoutTitleNumber=0;
        int tvPageWithTitleNumber=0;
        for (WebElement eachLink:tvPageLinks){
            String  linkText=eachLink.getText();
            if (linkText.isEmpty()){
                tvPageWithoutTitleNumber++;
            }else{
                tvPageWithTitleNumber++;

            }
        }
        //Music
        WebElement musicLink=driver.findElement(By.xpath("//ul[@class='ac-gn-list']/li[7]"));
        musicLink.click();
        Thread.sleep(2000);
        List<WebElement> musicPageLinks = driver.findElements(By.xpath("//body//a"));
        int musicPageWithoutTitleNumber=0;
        int musicPageWithTitleNumber=0;
        for (WebElement eachLink:musicPageLinks){
            String  linkText=eachLink.getText();
            if (linkText.isEmpty()){
                musicPageWithoutTitleNumber++;
            }else{
                musicPageWithTitleNumber++;

            }
        }
        //Support
        WebElement supportLink=driver.findElement(By.xpath("//ul[@class='ac-gn-list']/li[8]"));
        supportLink.click();
        Thread.sleep(2000);
        List<WebElement> supportPageLinks = driver.findElements(By.xpath("//body//a"));
        int supportPageWithoutTitleNumber=0;
        int supportPageWithTitleNumber=0;
        for (WebElement eachLink:supportPageLinks){
            String  linkText=eachLink.getText();
            if (linkText.isEmpty()){
                supportPageWithoutTitleNumber++;
            }else{
                supportPageWithTitleNumber++;

            }
        }

        //4. Print out how many links on each page with the titles of the pages
        System.out.println("Mac PAGE");
        System.out.println("Mac page Without Text Link Number : "+macPageWithoutTitleNumber);
        System.out.println("Mac Page with Text Link Number : "+macPageWithTitleNumber);
        System.out.println("=====================================");
        System.out.println("iPad  PAGE");
        System.out.println("iPad page Without Text Link Number : "+iPadPageWithoutTitleNumber);
        System.out.println("iPad Page with Text Link Number : "+iPadPageWithTitleNumber);
        System.out.println("=====================================");
        System.out.println("iPhone PAGE");
        System.out.println("iPhone page Without Text Link Number : "+iPhonePageWithoutTitleNumber);
        System.out.println("iPhone Page with Text Link Number : "+iPhonePageWithTitleNumber);
        System.out.println("=====================================");
        System.out.println("Watch PAGE");
        System.out.println("Watch page Without Text Link Number : "+watchPageWithoutTitleNumber);
        System.out.println("Watch Page with Text Link Number : "+watchPageWithTitleNumber);
        System.out.println("=====================================");
        System.out.println("TV PAGE");
        System.out.println("TV page Without Text Link Number : "+tvPageWithoutTitleNumber);
        System.out.println("TV Page with Text Link Number : "+tvPageWithTitleNumber);
        System.out.println("=====================================");
        System.out.println("Music PAGE");
        System.out.println("Music page Without Text Link Number : "+musicPageWithoutTitleNumber);
        System.out.println("Music Page with Text Link Number : "+musicPageWithTitleNumber);
        System.out.println("=====================================");
        System.out.println("Support PAGE");
        System.out.println("Support page Without Text Link Number : "+supportPageWithoutTitleNumber);
        System.out.println("Support Page with Text Link Number : "+supportPageWithTitleNumber);
        //5. Loop through all
        //6. Print out how many link is missing text TOTAL
        System.out.println("=====================================");
        int totalMissingTextNumber=macPageWithoutTitleNumber+iPadPageWithoutTitleNumber+ iPhonePageWithoutTitleNumber+
                watchPageWithoutTitleNumber+tvPageWithoutTitleNumber+musicPageWithoutTitleNumber+supportPageWithoutTitleNumber;
        System.out.println("Total Link Without Text Number : "+totalMissingTextNumber);
        //7. Print out how many link has text TOTAL
        int totalWithTextNumber=macPageWithTitleNumber+iPadPageWithTitleNumber+iPhonePageWithTitleNumber+
                watchPageWithTitleNumber+tvPageWithTitleNumber+musicPageWithTitleNumber+supportPageWithTitleNumber;
        System.out.println("Total Link With Text Number : "+totalWithTextNumber);
        //8. Print out how many total link TOTAL
        System.out.println("Total Link : "+ (totalMissingTextNumber+totalWithTextNumber));
    }
}
