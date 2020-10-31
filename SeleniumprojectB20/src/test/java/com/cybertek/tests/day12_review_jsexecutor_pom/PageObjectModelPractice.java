package com.cybertek.tests.day12_review_jsexecutor_pom;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.testng.annotations.Test;

public class PageObjectModelPractice {
    @Test
    public void loginToSmartbear(){
        LoginPage loginPage=new LoginPage();
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        loginPage.usernameInput.sendKeys("Tester");
        BrowserUtils.wait(2);
        loginPage.passwordInput.sendKeys("test");
        BrowserUtils.wait(2);
        loginPage.loginButton.click();
    }
}
