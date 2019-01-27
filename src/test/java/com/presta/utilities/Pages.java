package com.presta.utilities;

import com.presta.pages.AuthenticationPage;
import com.presta.pages.HomePage;
import com.presta.pages.MyAccountPage;
import com.presta.pages.NewAccountPage;

/**
 * Created by macik on 1/26/2019.
 */
public class Pages {

    private HomePage homePage;
    private AuthenticationPage authenticationPage;
    private NewAccountPage newAccountPage;
    private MyAccountPage myAccountPage;


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

    public MyAccountPage myAccountPage(){
        if (myAccountPage == null){
            myAccountPage = new MyAccountPage();
        }
        return myAccountPage;
    }

}
