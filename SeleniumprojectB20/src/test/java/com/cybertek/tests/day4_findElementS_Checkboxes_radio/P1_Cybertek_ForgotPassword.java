package com.cybertek.tests.day4_findElementS_Checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_Cybertek_ForgotPassword {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
//3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)

        //a. “Home” link
           // WebElement homeLink2=driver.findElement(By.xpath("//a[.='home']"));
        // WebElement homeLink=driver.findElement(By.cssSelector("a[class='nav-link']"));
            WebElement homeLink1=driver.findElement(By.xpath("//a[@class='nav-link']"));
            String homeText=homeLink1.getText();
            if (homeLink1.isDisplayed()){
            System.out.println("Home link display");
            }else{
            System.out.println("Failed");
        }
        //b. “Forgot password” header
        WebElement forgotPasswordHeader=driver.findElement(By.tagName("h2"));
        //WebElement fotgotPasswordHeader1=driver.findElement(By.xpath("//h2[.=‘Forgot Password’]"));
        String forgatBottonText=forgotPasswordHeader.getText();
        if (forgotPasswordHeader.isDisplayed()){
            System.out.println("Forgot Password displayed");
        }else{
            System.out.println("Failed");
        }
        //c. “E-mail” text
        // WebElement emailText=driver.findElement(By.cssSelector("label[for='email']"));
           WebElement emailText1=driver.findElement(By.xpath("//label[@for='email']"));
        if (emailText1.isDisplayed()){
            System.out.println("E-mail text is displayed");
        }else {
            System.out.println("Failed");
        }
        //d. E-mail input box
        // WebElement emailInputBox=driver.findElement(By.cssSelector("input[type='text']"));
        WebElement emailInputBox1=driver.findElement(By.xpath("//input[@type='text']"));
        if (emailInputBox1.isDisplayed()){
            System.out.println("E-mail input Box  is displayed");
        }else {
            System.out.println("Failed");
        }
        //e. “Retrieve password” button
        //WebElement retrievePasswordButton=driver.findElement(By.cssSelector("button[id='form_submit'"));
        WebElement retrievePasswordButton1=driver.findElement(By.xpath("//button[@id='form_submit']"));
        if (retrievePasswordButton1.isDisplayed()){
            System.out.println("Retrieve Password Button is displayed");
        }else {
            System.out.println("Failed");
        }
        //f. “Powered by Cybertek School” text
        //WebElement poweredByText=driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        WebElement poweredByText1=driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        if (poweredByText1.isDisplayed()){
            System.out.println("Powered by Cybertek School is displayed");
        }else {
            System.out.println("Failed");
        }
        /*
        ArrayList<WebElement> element=new ArrayList<WebElement>();
        element.addAll(Arrays.asList(poweredByText1,retrievePasswordButton1,homeLink1,forgotPasswordHeader));
        for (WebElement each:element){
            if (each.isDisplayed()){
                System.out.println("passed");
            }else{
                System.out.println("failed");
            }
        }


         */

    }

}
