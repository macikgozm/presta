package com.presta.utilities;

import com.presta.pages.*;

/**
 * Created by macik on 1/26/2019.
 */
public class Pages {

    private HomePage homePage;
    private AuthenticationPage authenticationPage;
    private NewAccountPage newAccountPage;
    private MyAccountPage myAccountPage;
    private MyPersonalInformationPage myPersonalInformationPage;
    private MyAddressPage myAddressPage;
    private NewAddressPage newAddressPage;
    private ProductPage productPage;


    public HomePage home(){
        if (homePage == null){
            homePage = new HomePage();
        }

        return homePage;
    }

    public AuthenticationPage authentication(){
        if (authenticationPage == null){
            authenticationPage = new AuthenticationPage();
        }
        return authenticationPage;
    }


    public NewAccountPage newAccount(){
        if (newAccountPage ==  null){
            newAccountPage = new NewAccountPage();
        }
        return  newAccountPage;
    }

    public MyAccountPage myAccount(){
        if (myAccountPage == null){
            myAccountPage = new MyAccountPage();
        }
        return myAccountPage;
    }

    public MyPersonalInformationPage myPersonalInformation(){
        if (myPersonalInformationPage == null){
            myPersonalInformationPage = new MyPersonalInformationPage();
        }
        return myPersonalInformationPage;
    }

    public MyAddressPage myAddress(){
        if (myAddressPage == null ){
            myAddressPage =  new MyAddressPage();
        }
        return myAddressPage;
    }


    public NewAddressPage newAddress(){
        if (newAddressPage == null){
            newAddressPage = new NewAddressPage();
        }
        return newAddressPage;
    }

    public ProductPage product(){
        if (productPage == null){
            productPage = new ProductPage();
        }
        return productPage;
    }

}
