package com.presta.pages;

import com.presta.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by macik on 1/26/2019.
 */
public class AuthenticationPage extends BasePage {

    @FindBy(id = "email_create")
    public WebElement emailCreateInput;

    @FindBy(id = "SubmitCreate")
    public WebElement emailCreateBtn;

    @FindBy(id = "email")
    public WebElement emailInput;

    @FindBy(id = "passwd")
    public WebElement passwordInput;

    @FindBy(id = "SubmitLogin")
    public WebElement signInBtn;


    public AuthenticationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    public NewAccountPage createAnAccount(String username){
        emailCreateInput.sendKeys(username);
//        emailCreateInput.click();
        emailCreateBtn.click();
        return new NewAccountPage();
    }


    public MyAccountPage login(String username, String password){
        emailInput.sendKeys(username);
        passwordInput.sendKeys(password);
        signInBtn.click();
        return new MyAccountPage();
    }



}
