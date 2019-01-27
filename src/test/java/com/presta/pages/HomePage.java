package com.presta.pages;

import com.presta.utilities.ConfigurationReader;
import com.presta.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by macik on 1/26/2019.
 */
public class HomePage extends BasePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void open(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
}
