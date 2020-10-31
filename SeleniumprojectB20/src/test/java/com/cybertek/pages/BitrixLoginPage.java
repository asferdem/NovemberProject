package com.cybertek.pages;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BitrixLoginPage {
    public BitrixLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@class='login-inp']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement password;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement loginButton;
    public void login(String username,String passWord){
        userName.sendKeys(username);
        BrowserUtils.wait(1);
        password.sendKeys(passWord);
        BrowserUtils.wait(1);
        loginButton.click();

    }
}
