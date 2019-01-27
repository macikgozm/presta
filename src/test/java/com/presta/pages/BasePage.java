package com.presta.pages;

import com.presta.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by macik on 1/26/2019.
 */
public abstract class BasePage  {

    @FindBy(xpath = "//img[@class='logo img-responsive']")
    public WebElement logoIcon;

    @FindBy(xpath = "//a[contains(text(),'Contact us')])[1]" )
    public WebElement contactUs_top;

    @FindBy(css = "a.logout")
    public WebElement signOutBtn;

    @FindBy(css = "div.header_user_info")
    public WebElement header_user_info;

    @FindBy(css = "a.login")
    public WebElement signIn;

    @FindBy(id = "search_query_top")
    public WebElement searchInput;

    @FindBy(xpath = "//button[@name='submit_search']")
    public WebElement searchBtn;

    @FindBy(xpath = "//a[@title='View my shopping cart']")
    public WebElement cartIcon;


    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
