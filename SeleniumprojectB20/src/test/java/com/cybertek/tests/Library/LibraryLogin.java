package com.cybertek.tests.Library;

import com.cybertek.pages.AddBookPage;
import com.cybertek.pages.LibraryLoginPage;
import com.cybertek.pages.LibraryMainPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LibraryLogin {
    LibraryLoginPage libraryLoginPage;
    AddBookPage addBookPage;
    @Test
    public void LibraryLoginTest(){
        String url= ConfigurationReader.getProperty("libraryURL");
        Driver.getDriver().get(url);

        BrowserUtils.wait(2);

        libraryLoginPage=new LibraryLoginPage();
        String email=ConfigurationReader.getProperty("libraryEmail");
        String password=ConfigurationReader.getProperty("libraryPassword");

        libraryLoginPage.login(email,password);
        String actualUserName=libraryLoginPage.userName.getText();
        String expectedUserName="Test Librarian 61";

        Assert.assertEquals(actualUserName, expectedUserName);

        libraryLoginPage.userName.click();
        BrowserUtils.wait(1);

        libraryLoginPage.logout.click();

    }

    @Test
    public void deneme(){
        String url= ConfigurationReader.getProperty("libraryURL");
        Driver.getDriver().get(url);
        libraryLoginPage=new LibraryLoginPage();
        String email=ConfigurationReader.getProperty("libraryEmail");
        String password=ConfigurationReader.getProperty("libraryPassword");

        libraryLoginPage.login(email,password);

        LibraryMainPage libraryMainPage=new LibraryMainPage();
        BrowserUtils.wait(2);

        addBookPage=new AddBookPage();
        libraryMainPage.booksModule.click();
        BrowserUtils.wait(2);

        addBookPage.searchBox.click();
        BrowserUtils.wait(2);
        String expectedBookName="Java Coding Problems";
        addBookPage.searchBox.sendKeys(expectedBookName);
        BrowserUtils.wait(6);

        WebElement bookname=Driver.getDriver().findElement(By.xpath("//tbody//td[3]"));

        String actualBookName=bookname.getText();

        System.out.println("actualBookName = " + actualBookName);
        System.out.println("expectedBookName = " + expectedBookName);

        Assert.assertEquals(actualBookName, expectedBookName);


    }
}
