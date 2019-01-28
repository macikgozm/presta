package com.presta.tests.smoke_tests;

import com.presta.utilities.BrowserUtils;
import com.presta.utilities.ConfigurationReader;
import com.presta.utilities.Driver;
import com.presta.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.fail;

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
        extentLogger.info("Verify that account holder full name is displayed next to the Sign out link");
        Assert.assertTrue(pages.myAccount().header_user_info.isDisplayed());

        extentLogger.info("Click on My personal information button");
        pages.myAccount().myPersonalInformationLink.click();

        extentLogger.info("Verify title contains Identity");
        Assert.assertTrue(driver.getTitle().contains("Identity"));

        // Just for test purpose
        BrowserUtils.scrollToElement(pages.myPersonalInformation().firstname);

        extentLogger.info("Verify that first name and last name matches the full name on top");
        String fname = pages.myPersonalInformation().firstname.getAttribute("value")+" "+ pages.myPersonalInformation().lastname.getAttribute("value");
        Assert.assertEquals(pages.myPersonalInformation().header_user_info.getText(), fname);
        extentLogger.info("Click on Save button");
        pages.myPersonalInformation().saveBtn.click();

        extentLogger.info("Verify error message “The password you entered is incorrect.");
        List<String> errors = BrowserUtils.getElementsText(pages.myPersonalInformation().errorMessages);
        Assert.assertEquals(errors.get(0), "The password you entered is incorrect.");

        extentLogger.info("Click on Back to your account");
        pages.myPersonalInformation().backToYourAccountLink.click();

        extentLogger.info("Verify that title contains My account");
        Assert.assertTrue(driver.getTitle().contains("My account"));

        extentLogger.info("Click on My addresses");
        pages.myAccount().myAddressesLink.click();

        extentLogger.info("Click on Add a new address");
        pages.myAddress().addAnAddressBtn.click();

        extentLogger.info("Verify that first name and last name matches the full name on top");
        fname = pages.newAddress().firstname.getAttribute("Value") + " " +
                pages.newAddress().lastname.getAttribute("value");

        Assert.assertEquals(fname, pages.newAddress().header_user_info.getText());

        extentLogger.info("Delete the first name");
        pages.newAddress().firstname.clear();

        extentLogger.info("Click save");
        pages.newAddress().saveBtn.click();

        errors = BrowserUtils.getElementsText(pages.newAddress().errorMessages);
        Assert.assertEquals(errors.get(0), "firstname is required.");

        extentLogger.pass("Completed: My account test");
    }

}
