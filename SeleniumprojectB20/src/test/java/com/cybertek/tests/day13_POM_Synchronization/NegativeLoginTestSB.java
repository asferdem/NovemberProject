package com.cybertek.tests.day13_POM_Synchronization;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTestSB {
    LoginPage loginPage;
        @Test
    public void SBNegativeLoginPageTest() {

        Driver.getDriver().get(ConfigurationReader.getProperty("smartbearUrl"));

        loginPage = new LoginPage();

        loginPage.usernameInput.sendKeys("Teste");
        BrowserUtils.wait(2);

        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("smartbear_password"));
        BrowserUtils.wait(2);

        loginPage.loginButton.click();

        Assert.assertTrue(loginPage.errorMessage.isDisplayed());




    }

    @Test
    public void loginNegativeTest2(){
        Driver.getDriver().get(ConfigurationReader.getProperty("smartbearUrl"));

        loginPage=new LoginPage();
        loginPage.login("svhvhdv", ConfigurationReader.getProperty("smartbear_password"));
        Assert.assertTrue(loginPage.errorMessage.isDisplayed());

    }


}
