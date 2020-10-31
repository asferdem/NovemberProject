package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryMainPage {
    public LibraryMainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "(//span[@class='title'])[1]")
    public WebElement dashboard;

    @FindBy(xpath = "(//span[@class='title'])[2]")
    public WebElement usersModule;

    @FindBy(xpath = "(//span[@class='title'])[3]")
    public WebElement booksModule;

    @FindBy(xpath="//a[@span='Test Librarian 61']")
    public WebElement userName;

    @FindBy(xpath="//a[@class='dropdown-item']")
    public WebElement logout;


}
