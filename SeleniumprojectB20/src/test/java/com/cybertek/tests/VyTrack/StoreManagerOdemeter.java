package com.cybertek.tests.VyTrack;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StoreManagerOdemeter {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");
        driver.manage().window().maximize();

        WebElement userName=driver.findElement(By.xpath("//input[@type='text']"));
        userName.sendKeys("storemanager229");
        Thread.sleep(2000);

        WebElement password=driver.findElement(By.cssSelector("input[type='password']"));
        password.sendKeys("UserUser123");
        Thread.sleep(2000);

        WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        Thread.sleep(2000);

        WebElement fleetModule=driver.findElement(By.cssSelector("#main-menu > ul > li:nth-child(2) > a > span"));
        fleetModule.click();

        WebElement odometerModule=driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[4]/a"));
        odometerModule.click();




    }

}
