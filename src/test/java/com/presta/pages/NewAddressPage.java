package com.presta.pages;

import com.presta.utilities.Driver;
import com.presta.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by macik on 1/28/2019.
 */
public class NewAddressPage extends BasePage {

    @FindBy(xpath = "//div[@class='alert alert-danger']//ol//li")
    public List<WebElement> errorMessages;

    @FindBy(id = "firstname")
    public WebElement firstname;

    @FindBy(id = "lastname")
    public WebElement lastname;

    @FindBy(id = "company")
    public WebElement company;

    @FindBy(id = "address1")
    public WebElement address1;

    @FindBy(id = "address2")
    public WebElement address2;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "id_state")
    public WebElement id_stateSelectElement;

    @FindBy(id = "postcode")
    public WebElement postcode;

    @FindBy(id = "id_country")
    public WebElement id_country;

    @FindBy(id = "phone")
    public WebElement phoneHome;

    @FindBy(id = "phone_mobile")
    public WebElement phoneMobile;

    @FindBy(id = "other")
    public WebElement additionalInfo;

    @FindBy(id = "alias")
    public WebElement alias;

    @FindBy(id = "submitAddress")
    public WebElement saveBtn;

    @FindBy(linkText = "Back to your addresses")
    public WebElement backToYourAddressBtn;


    public NewAddressPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
