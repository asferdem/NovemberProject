package com.cybertek.tests.Tasks;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CybertekRegistrationsFormConfirmation {
    WebDriver driver;
    Faker faker = new Faker();
    @BeforeMethod
    public  void SetUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/registration_form");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void  CybertekRegistrationsFormConfirmation(){
        //3. Enter first name
        WebElement inputFirstName=driver.findElement(By.xpath("//input[@name='firstname']"));
        inputFirstName.sendKeys(faker.name().firstName());
        //4. Enter last name
        WebElement inputLastName=driver.findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys(faker.name().lastName());
        //5. Enter username
        WebElement inputUserName=driver.findElement(By.xpath("//input[@name='username']"));
        inputUserName.sendKeys((faker.name().username()).replace(".",""));
        //6. Enter email address
        WebElement inputEmail=driver.findElement(By.xpath("//input[@name='email']"));
        inputEmail.sendKeys(faker.internet().emailAddress());
        //7. Enter password
        WebElement inputPassword=driver.findElement(By.xpath("//input[@name='password']"));
        inputPassword.sendKeys(faker.internet().password());
        //8. Enter phone number
        WebElement inputPhone=driver.findElement(By.xpath("//input[@name='phone']"));
        inputPhone.sendKeys(faker.phoneNumber().phoneNumber().replace(
                ".", "-").replace("(", "").replace(")",
                "").replace(" ", "-"));
        //9. Select a gender from radio buttons
        WebElement gender=driver.findElement(By.xpath("//input[@value='female']"));
        gender.click();
        //10. Enter date of birth
        WebElement inputDOB=driver.findElement(By.xpath("//input[@name='birthday']"));
        inputDOB.sendKeys("10/10/2000");
        //11. Select Department/Office
        Select selectDepartment=new Select(driver.findElement(By.xpath("//select[@name='department']")));
        selectDepartment.selectByValue("DE");
        //12. Select Job Title
        Select selectJobTitle=new Select(driver.findElement(By.xpath("//select[@name='job_title']")));
        selectJobTitle.selectByIndex(4);
        //13. Select programming language from checkboxes
        WebElement selectLanguage=driver.findElement(By.xpath("//input[@value='java']"));
        selectLanguage.click();

        //14. Click to sign up button
        WebElement signUpButton = driver.findElement(By.xpath("//button[.='Sign up']"));
        signUpButton.click();
        //15. Verify success message “You’ve successfully completed registration.” is
        //displayed.
        String actualResult = driver.findElement(By.xpath("//p")).getText();
        String expectedResult = "You've successfully completed registration!";

        Assert.assertEquals(actualResult, expectedResult);
    }



}
