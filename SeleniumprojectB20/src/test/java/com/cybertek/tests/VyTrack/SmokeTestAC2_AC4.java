package com.cybertek.tests.VyTrack;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SmokeTestAC2_AC4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
        userName.sendKeys("user179");
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
        password.sendKeys("UserUser123");
        Thread.sleep(2000);

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        Thread.sleep(2000);

        WebElement fleetModule = driver.findElement(By.xpath("//span[@class='title title-level-1']"));
        fleetModule.click();

        WebElement odometerModule = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[4]/a"));
         odometerModule.click();
        Thread.sleep(1000);

        WebElement createVehicleOdometer=driver.findElement(By.xpath("//a[@class='btn main-group btn-primary pull-right ']"));
        createVehicleOdometer.click();
        Thread.sleep(1000);

        WebElement inputOdometerValue=driver.findElement(By.name("custom_entity_type[OdometerValue]"));
        inputOdometerValue.sendKeys("5000");
        Thread.sleep(1000);

        WebElement chooseDate= driver.findElement(By.xpath("//input[@placeholder='Choose a date']"));
        chooseDate.click();
        WebElement selectDate= driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[5]/a"));
        selectDate.click();

        WebElement inputDriverName=driver.findElement(By.name("custom_entity_type[Driver]"));
        inputDriverName.sendKeys("FATIH ERDEM");
        Thread.sleep(1000);

        WebElement saveCloseButton=driver.findElement(By.xpath("//button[@type='submit']"));
        saveCloseButton.click();
        Thread.sleep(3000);

        WebElement deleteButton=driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div[1]/div/div/div[1]/div[1]/div[2]"));
        deleteButton.click();
        Thread.sleep(2000);

        WebElement confirmDelete=driver.findElement(By.xpath("/html/body/div[8]/div[3]/a[2]"));
        confirmDelete.click();
/*
       //WebElement deleteButton=driver.findElement(By.cssSelector("#custom_entity_type-uid-5f5a4819dc05f > div.container-fluid.page-title > div > div > div.pull-right > div.pull-right.title-buttons-container > div:nth-child(1) > a"));
      // deleteButton.click();

        WebElement vehicleOdometer=driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div[1]/div/div/div[2]/div/div/div[1]/div/div[2]/a"));
        vehicleOdometer.click();
        Thread.sleep(3000);

        WebElement dropDown=driver.findElement(By.xpath("//button[@data-toggle='dropdown']"));
      dropDown.click();

        WebElement dropDownChoose=driver.findElement(By.xpath("//a[@data-size='100']"));
        dropDownChoose.click();





        */
    }







}
