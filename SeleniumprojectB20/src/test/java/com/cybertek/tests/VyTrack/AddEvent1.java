package com.cybertek.tests.VyTrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddEvent1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.get("https://qa2.vytrack.com/user/login");
        Thread.sleep(2000);

        driver.findElement(By.id("prependedInput")).sendKeys("user179");
        Thread.sleep(100);

        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        Thread.sleep(1000);

        driver.findElement(By.id("_submit")).click();
        driver.findElement(By.className("unclickable")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[3]/a")).click();
        Thread.sleep(2000);

        driver.findElement(By.tagName("td")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div[1]/div/div/div[1]/div[1]/div/a")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("oro_calendar_event_form[title]")).sendKeys("Fatih Erdem");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[6]/div[11]/div/div/div/span[2]/button")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"1551\"]/div/div/ul/li[2]/a")).click();


    }

}
