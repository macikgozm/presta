package com.presta.pages;

import com.presta.utilities.ConfigurationReader;
import com.presta.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by macik on 1/26/2019.
 */
public class HomePage extends BasePage {

    @FindBy(xpath = "//ul[@id='homefeatured']//li")
    public List<WebElement> products;


    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void open(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    public String getProduct(WebElement element){
        return element.findElement(By.xpath( "//h5//a[@class='product-name']") ).getText();
    }

    public WebElement getProduct(String product){
        String beforeXpath = "//ul[@id='homefeatured']//li//h5//a[@title='";
        String afterXpath = "']";
        return Driver.getDriver().findElement(By.xpath(beforeXpath + product + afterXpath ));
    }


    public String getPrice(String product){
        //ul[@id='homefeatured']//li//h5//a[@title='Blouse']/parent::h5//following-sibling::div[@class='content_price']
        String beforeXpath = "//ul[@id='homefeatured']//li//h5//a[@title='";
        String afterXpath = "']/parent::h5//following-sibling::div[@class='content_price']";
        String path = beforeXpath + product + afterXpath;

        String priceStr = Driver.getDriver().findElement(By.xpath(path)).getText();
//        System.out.println("price = " + priceStr);

        String [] priceDetails = priceStr.split(" ");
        String price = priceDetails[0];

        return price;
    }



}
