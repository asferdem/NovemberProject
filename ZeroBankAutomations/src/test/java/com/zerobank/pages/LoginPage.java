package com.zerobank.pages;


import com.zerobank.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='user_login']")
    private WebElement usernameInput;

    @FindBy(xpath = "//input[@id='user_password']")
    private WebElement passwordInput;

    @FindBy(id = "[class='alert alert-error'")
    private WebElement warningMessage;

    @FindBy(id = "account_summary_tab")
    private WebElement accountSummary;


    public void login(){
      usernameInput.sendKeys("username");
      passwordInput.sendKeys("password"+Keys.ENTER);
    }

    public boolean ASisDisplayed(){
      return   accountSummary.isDisplayed();
    }

}
