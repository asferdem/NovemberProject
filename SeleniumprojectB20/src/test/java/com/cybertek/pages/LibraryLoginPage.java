package com.cybertek.pages;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {
    public LibraryLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="inputEmail")
    public WebElement emailInput;

    @FindBy(id="inputPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement singIn;

    @FindBy(xpath="//a[span='Test Librarian 61']")
    public WebElement userName;

    @FindBy(xpath="//a[@class='dropdown-item']")
    public WebElement logout;

    public void login(String username,String password){
        emailInput.sendKeys(username);
        BrowserUtils.wait(1);
        passwordInput.sendKeys(password);
        BrowserUtils.wait(1);
        singIn.click();

    }

}
