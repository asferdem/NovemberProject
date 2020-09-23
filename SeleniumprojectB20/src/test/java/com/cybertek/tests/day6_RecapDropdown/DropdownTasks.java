package com.cybertek.tests.day6_RecapDropdown;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropdownTasks {
    WebDriver driver;
    @AfterMethod
    public void Teardown(){
        driver.close();
    }

    @BeforeMethod
    public void setupMethod(){
        //open a new browser
        driver = WebDriverFactory.getDriver("chrome");
        //maximize the page
        driver.manage().window().maximize();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //get the page
        driver.get("http://practice.cybertekschool.com/dropdown");
    }


    //TC #2: Selecting state from State dropdown and verifying result
    @Test
    public void test2_verify_state_dropdown() throws InterruptedException{
        // we need to locate the dropdown
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        //3. Select Illinois --> selecting by visible text
        Thread.sleep(1000);
        stateDropdown.selectByVisibleText("Illinois");

        //4. Select Virginia --> selecting by value
        Thread.sleep(1000);
        stateDropdown.selectByValue("VA");

        //5. Select California --> select by index
        Thread.sleep(1000);
        stateDropdown.selectByIndex(5);
        //6. Verify final selected option is California.
        String expectedResult = "California";
        String actualResult = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualResult, expectedResult, "Actual vs expected is not equal!");

        //Use all Select options. (visible text, value, index)

    }

    @Test
    public void test3_date_dropdown_verification() throws InterruptedException {
        //3. Select “December 1st, 1921” and verify it is selected.
        Thread.sleep(2000);
        Select yearDropdown=new Select(driver.findElement(By.id("year")));
        Select monthDropdown=new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown=new Select(driver.findElement(By.id("day")));
        //Select year using : visible text
        yearDropdown.selectByVisibleText("1921");
        Thread.sleep(2000);
        //Select month using : value attribute
        monthDropdown.selectByValue("11");
        Thread.sleep(2000);
        //Select day using : index number
        Thread.sleep(2000);
        dayDropdown.selectByIndex(0);

        String expectedMonth = "December";
        String expectedYear = "1921";
        String expectedDay = "1";

        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualMonth, expectedMonth, "Actual vs expected is not equal!");
        Assert.assertEquals(actualYear, expectedYear, "Actual vs expected is not equal!");
        Assert.assertEquals(actualDay, expectedDay, "Actual vs expected is not equal!");

    }

    @Test
    public void test4_value_multiple_ellect() throws InterruptedException {
        //Select all the options from multiple select dropdown.
        //4. Print out all selected values.
        Select selectAll=new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        List<WebElement> allOptions=selectAll.getOptions();

        for (WebElement eachElement :allOptions){
            Thread.sleep(500);
            eachElement.click();
            System.out.println("Sellected : "+eachElement.getText());
            Assert.assertTrue(eachElement.isSelected(), "The option: "+eachElement.getText()+" is not selected!");

        }
        //5. Deselect all values.

        selectAll.deselectAll();
        for (WebElement each:allOptions){
            Assert.assertTrue(!each.isSelected());
           // Assert.assertFalse(each.isSelected());
        }

    }

    @Test
    public void test5_nonSelectDropdown() throws InterruptedException {
        //Click to non-select dropdown
        WebElement dropdownLink=driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        //driver.findElement(By.xpath("//div[@class='dropdown']/a"));
        dropdownLink.click();
        Thread.sleep(1500);
        //4. Select Facebook from dropdown
        WebElement facebook=driver.findElement(By.linkText("Facebook"));
        //driver.findElement(By.xpath("//a[.='Facebook']"));
        facebook.click();
        //5. Verify title is “Facebook - Log In or Sign Up”
        String expectedTitle="Facebook - Log In or Sign Up";
        String actualTitle=driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle, "Actual title is not equal expected title");
    }

}
