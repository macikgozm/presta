package com.presta.pages;

import com.presta.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by macik on 1/26/2019.
 */
public class NewAccountPage extends BasePage {

    public NewAccountPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
