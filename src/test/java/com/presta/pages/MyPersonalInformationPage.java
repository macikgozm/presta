package com.presta.pages;

import com.presta.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by macik on 1/27/2019.
 */
public class MyPersonalInformationPage extends BasePage {

    @FindBy(xpath = "//div[@class='alert alert-danger']//ol//li")
//    public WebElement errorMessages;
    public List<WebElement> errorMessages;

    @FindBy(id = "firstname")
    public WebElement firstname;

    @FindBy(id = "lastname")
    public WebElement lastname;

    @FindBy(id = "email")
    public  WebElement email;

    @FindBy(id = "days")
    public WebElement daysSelectElement;

    @FindBy(id = "months")
    public WebElement monthsSelectElement;

    @FindBy(id = "years")
    public WebElement yearsSelectElement;

    @FindBy(id = "old_passwd")
    public WebElement old_passwd;

    @FindBy(id = "passwd")
    public WebElement passwd;

    @FindBy(id = "confirmationEmail")
    public WebElement confirmationEmail;

    @FindBy(name = "submitIdentity")
    public WebElement saveBtn;

    @FindBy(linkText = "Back to your account")
    public WebElement backToYourAccountLink;

    @FindBy(linkText = "Home")
    public WebElement homeLink;


    public MyPersonalInformationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}



