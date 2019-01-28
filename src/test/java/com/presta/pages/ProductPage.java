package com.presta.pages;

import com.presta.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by macik on 1/28/2019.
 */
public class ProductPage extends BasePage {

    @FindBy(xpath = "//h1[@itemprop='name']")
    public WebElement product;

    @FindBy(id = "our_price_display")
    public WebElement price;

    @FindBy(xpath = "//input[@id='quantity_wanted']")
    public WebElement quantity_wanted;

    @FindBy(id = "group_1")
    public WebElement sizeOptions;

    @FindBy(id="add_to_cart")
    public WebElement addToCartBtn;

    @FindBy(xpath = "//div[@class='layer_cart_product col-xs-12 col-md-6']/h2")
    public WebElement cartConfirmationMessage;

    @FindBy(id = "layer_cart_product_quantity")
    public WebElement layer_cart_product_quantity;

    @FindBy(id = "layer_cart_product_attributes")
    public WebElement layer_cart_product_attributes;

    @FindBy(id = "layer_cart_product_title")
    public WebElement layer_cart_product_title;

    @FindBy(id = "layer_cart_product_price")
    public WebElement layer_cart_product_price;


    public ProductPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public Select sizeList(){
        return new Select(sizeOptions);
    }


}
