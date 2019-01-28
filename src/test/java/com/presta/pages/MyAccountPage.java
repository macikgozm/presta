package com.presta.pages;

import com.presta.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by macik on 1/26/2019.
 */
public class MyAccountPage extends BasePage{

    @FindBy(xpath = "//ul[@class='myaccount-link-list']//span[text()='My addresses']")
    public WebElement myAddressesLink;

    @FindBy(xpath = "//ul[@class='myaccount-link-list']//span[text()='My personal information']")
    public WebElement myPersonalInformationLink;

    @FindBy(name = "submitIdentity")
    public WebElement saveBtn;

    public MyAccountPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
