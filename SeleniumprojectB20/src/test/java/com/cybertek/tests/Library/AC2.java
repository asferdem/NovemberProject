package com.cybertek.tests.Library;

import com.cybertek.pages.AddBookPage;
import com.cybertek.pages.LibraryLoginPage;
import com.cybertek.pages.LibraryMainPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AC2 {
    LibraryLoginPage libraryLoginPage=new LibraryLoginPage();
    LibraryMainPage libraryMainPage=new LibraryMainPage();
    @Test
    public void addBookTest(){
        String url= ConfigurationReader.getProperty("libraryURL");
        Driver.getDriver().get(url);

        String email=ConfigurationReader.getProperty("libraryEmail");
        String password=ConfigurationReader.getProperty("libraryPassword");

        libraryLoginPage.login(email,password);

        BrowserUtils.wait(2);

        libraryMainPage.booksModule.click();
        BrowserUtils.wait(2);

        AddBookPage addBookPage=new AddBookPage();


        addBookPage.addBookButton.click();
        BrowserUtils.wait(2);

        String expectedBookName="Java Coding Problems";
        addBookPage.bookName.sendKeys(expectedBookName);
        BrowserUtils.wait(2);

        addBookPage.isbn.sendKeys("978-1-78980-141-5");
        BrowserUtils.wait(2);

        addBookPage.year.sendKeys("2020");
        BrowserUtils.wait(2);

        String authors="Anghel Leonard";
        addBookPage.author.sendKeys(authors);
        BrowserUtils.wait(2);

        Select category=new Select(addBookPage.bookCategory);
        category.selectByVisibleText("Classic");
        BrowserUtils.wait(2);

        String descriptions="Develop your coding skills by exploring Java concepts and techniques such as Strings, " +
                "Objects and Types, Data Structures and Algorithms, Concurrency, and Functional programming";

        addBookPage.description.sendKeys(descriptions);
        BrowserUtils.wait(2);


        addBookPage.saveChanges.click();
        BrowserUtils.wait(7);


        addBookPage.searchBox.click();
        BrowserUtils.wait(2);

        addBookPage.searchBox.sendKeys(expectedBookName);
        BrowserUtils.wait(6);

        WebElement bookName=Driver.getDriver().findElement(By.xpath("//tbody//td[3]"));

        String actualBookName=bookName.getText();

        System.out.println("actualBookName = " + actualBookName);
        System.out.println("expectedBookName = " + expectedBookName);

        Assert.assertEquals(actualBookName, expectedBookName);




    }
}
