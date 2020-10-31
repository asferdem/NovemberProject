package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BitrixHomePage {
    public BitrixHomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[.='Message']/span")
    public WebElement messageModule;
   //AC3
    @FindBy(xpath = "//span[@title='Link']")
    public WebElement linkButton;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement linkText;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement linkURL;

    @FindBy(xpath = "//input[@value='Save']")
    public WebElement saveLink;

    @FindBy(xpath = "//iframe")
    public WebElement iframe;

    @FindBy(xpath = "//body/a")
    public WebElement actualText;

    //AC4
    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-video']")
    public WebElement insertVideoButton;

    @FindBy(xpath = "//input[@id=\"video_idPostFormLHE_blogPostForm-source\"]")
    public WebElement videoURL;

    @FindBy(id ="undefined" )
    public WebElement saveVideo;

    @FindBy(xpath = "//img[@title=\"Video\"]")
    public WebElement checkVideo;






}
