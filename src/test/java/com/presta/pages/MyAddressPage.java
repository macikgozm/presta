package com.presta.pages;

import com.presta.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by macik on 1/28/2019.
 */
public class MyAddressPage extends BasePage {

    @FindBy(xpath = "(//ul/li[@class='address_update']/a)[1]")
    public WebElement addressUpdateBtn;

    @FindBy(xpath = "(//ul/li[@class='address_update']/a)[2]")
    public WebElement addressDeleteBtn;

    @FindBy(xpath = "//div[@class='clearfix main-page-indent']//a[@title='Add an address']")
    public WebElement addAnAddressBtn;

    @FindBy(linkText = "Back to your account" )
    public WebElement  BackToYourAccountBtn;

    @FindBy(linkText = "Home" )
    public WebElement  homeBtn;



    public MyAddressPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
