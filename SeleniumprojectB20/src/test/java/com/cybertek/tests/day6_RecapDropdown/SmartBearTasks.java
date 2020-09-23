package com.cybertek.tests.day6_RecapDropdown;

import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBearTasks {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        //open a new browser
        driver = WebDriverFactory.getDriver("chrome");
        //maximize the page
        driver.manage().window().maximize();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //get the page
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        SmartBearUtilities.loginToSmartBear(driver);
    }
    @Test
    public void task1_SmartBear_software_link_verification(){
       /* //3. Enter username: “Tester”
        WebElement userName=driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester");

        //4. Enter password: “test”
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        //5. Click to Login button
        WebElement loginButton=driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

        */
        //6. Print out count of all the links on landing page
        List<WebElement > allLinks=driver.findElements(By.xpath("//body//a"));
        System.out.println("Count of all the link on the page = " + allLinks.size());

        //7. Print out each link text on this page

        for (WebElement eachLink:allLinks){
            System.out.println("Each link text : " + eachLink.getText());
        }

    }

    @Test
    public void task2_create_Order_javafaker(){
        //6. Click on Order
        WebElement order=driver.findElement(By.linkText("Order"));
        order.click();
        //7. Select familyAlbum from product, set quantity to 2
        Select familyAlbum= new Select(driver.findElement(By.xpath("//select[@onchange='productsChanged()']")));
        familyAlbum.selectByValue("FamilyAlbum");

        WebElement quantityInput=driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
       // quantityInput.clear();
        quantityInput.sendKeys(Keys.BACK_SPACE);
        quantityInput.sendKeys("2");
        //8. Click to “Calculate” button
        WebElement calculateButton=driver.findElement(By.xpath("//input[@value='Calculate']"));
        calculateButton.click();
        //9. Fill address Info with JavaFaker
        Faker faker=new Faker();
        String fullName=faker.name().fullName();
        String street=faker.address().streetName();
        String city=faker.address().city();
        String state=faker.address().state();
        String zip=faker.address().zipCode().replace("-", "");

        WebElement nameInput=driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        nameInput.sendKeys(fullName);

        WebElement streetInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
        streetInput.sendKeys(street);
        WebElement cityInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        cityInput.sendKeys(city);
        WebElement stateInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
        stateInput.sendKeys(state);
        WebElement zipInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));
        zipInput.sendKeys(zip);
        //• Generate: name, street, city, state, zip code
        //10. Click on “visa” radio button
        WebElement visaButton=driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
        visaButton.click();
        //11. Generate card number using JavaFaker
        WebElement cardNumberInput=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
        cardNumberInput.sendKeys(faker.finance().creditCard().replaceAll("-", ""));
        //12. Click on “Process”
        WebElement expirationInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
        expirationInput.sendKeys("12/25");
        WebElement processButton = driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));
        processButton.click();

        //13.Verify success message “New order has been successfully added.” is displayed.
        WebElement successMessage = driver.findElement(By.xpath("//strong"));
        Assert.assertTrue(successMessage.isDisplayed(), "Success message is not displayed!");


    }


}
