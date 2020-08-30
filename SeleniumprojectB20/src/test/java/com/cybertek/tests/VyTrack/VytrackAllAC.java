package com.cybertek.tests.VyTrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Truck Drivers	user179	UserUser123	https://qa2.vytrack.com/user/login
 */
public class VytrackAllAC {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://qa2.vytrack.com/user/login");
        driver.manage().window().maximize();
        //Log IN
        driver.findElement(By.id("prependedInput")).sendKeys("user179");
        Thread.sleep(2000);
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123"+ Keys.ENTER);
        Thread.sleep(2000);
        //AC1
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/a/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[3]/a")).click();
        //AC2
        Thread.sleep(2000);
        driver.findElement(By.tagName("td")).click();
        Thread.sleep(2000);
        //AC3
       driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a/span")).click();

      Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/div/div/ul/li[3]/a")).click();
       Thread.sleep(2000);

       driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div/div[2]/div/a")).click();
       Thread.sleep(2000);
       driver.findElement(By.name("oro_calendar_event_form[title]")).sendKeys("Fatih ERDEM");
       Thread.sleep(2000);
       driver.findElement(By.className("caret")).click();
       Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/form/div[1]/div/div/div[2]/div[1]/div[1]/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a/span")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/div/div/ul/li[3]/a")).click();
        Thread.sleep(2000);
        //AC4
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[2]/div[1]/div/div[3]/div[1]/div/div/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[2]/div[1]/div/div[3]/div[1]/div/div/div/div[4]/div[2]/table/tbody/tr[1]/td[3]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[2]/div[1]/div/div[3]/div[1]/div/div/div/div[4]/div[2]/table/tbody/tr[2]/td[3]/input")).click();
    }
}
