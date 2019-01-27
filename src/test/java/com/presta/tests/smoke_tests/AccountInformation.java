package com.presta.tests.smoke_tests;

import com.presta.utilities.ConfigurationReader;
import com.presta.utilities.Driver;
import com.presta.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by macik on 1/26/2019.
 */
public class AccountInformation extends TestBase{

    @Test
    public void myAccount(){

        extentLogger = report.createTest("My account test");

        extentLogger.info("Opening the Authentication page");
        pages.home().signIn.click();

        extentLogger.info("Logging in to the application");
        String username = ConfigurationReader.getProperty("email");
        String password = ConfigurationReader.getProperty("password");
        pages.authentication().login(username, password);
        boolean flag = driver.getTitle().contains("My account");

        extentLogger.info("Verifying page title contains 'My account' ");
        Assert.assertTrue(flag,"The title does not contain 'My account' ");

        extentLogger.pass("My account test");
    }

}
