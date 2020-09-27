package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartBearUtilities {


    public static void loginToSmartBear(WebDriver driver){

        //3. Enter username: “Tester”
        WebElement userName=driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester");

        //4. Enter password: “test”
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        //5. Click to Login button
        WebElement loginButton=driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();
    }
/*
• Method takes WebDriver object and String(name).
• Method should verify if given name exists in orders.
• This method should simply accepts a name(String), and assert whether
given name is in the list or not.
 */

    public static void verifyOrder(WebDriver driver,String name){
        List<WebElement> nameList=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));

        for (WebElement each: nameList){
            if (each.getText().equalsIgnoreCase(name)){
                Assert.assertTrue(true);
                return;
            }
        }
        Assert.fail("The given name "+ name+ " is NOT in the Table , Verification Failed!!!");
    }
/*
Method: printNamesAndCities
• Create a method named printNamesAndCities in SmartBearUtils class.
• Method takes WebDriver object.
• This method should simply print all the names in the List of All Orders.
 */
    public static void printNamesAndCities(WebDriver driver){

        List<WebElement> cityName=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[7]"));

        List<WebElement> nameList=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));

        for (int i=0;i<=cityName.size()-1;i++){
            System.out.println("Name"+(i+1)+": "+nameList.get(i).getText()+" , City"+(i+1)+": "+cityName.get(i).getText());

        }



    }




}
