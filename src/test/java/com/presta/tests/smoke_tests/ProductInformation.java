package com.presta.tests.smoke_tests;

import com.presta.utilities.BrowserUtils;
import com.presta.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static com.presta.utilities.BrowserUtils.getElementsTextFromDropdown;

/**
 * Created by macik on 1/28/2019.
 */
public class ProductInformation extends TestBase {

    @Test
    public void price(){
        extentLogger = report.createTest("Price test");

        extentLogger.info("Opening the homepage");
        pages.home().open();

        extentLogger.info("Click on any product");
        Random random  = new Random();
        int productToSelect = random.nextInt(pages.home().products.size()) ;
        WebElement element = pages.home().products.get(productToSelect);
        String product = pages.home().getProduct(element);
        String price = pages.home().getPrice(product);
        pages.home().getProduct(product).click();

        extentLogger.info("Verify that same name and price displayed as on the home page");
        Assert.assertEquals(pages.product().product.getText(), product);
        Assert.assertEquals(pages.product().price.getText(), price );

        extentLogger.info("Product information - details:");

        extentLogger.info("that default quantity is 1");
        Assert.assertEquals(pages.product().quantity_wanted.getAttribute("value"), "1");

        extentLogger.info("Verify that default size is S");
        Assert.assertEquals(pages.product().sizeList().getFirstSelectedOption().getText(), "S");

        String [] expectedSizeOptions = {"S", "M", "L"};
        List<String> actualSizeOptionsList = BrowserUtils.getElementsTextFromDropdown(pages.product().sizeList());
        String [] actualSizeOptions = actualSizeOptionsList.toArray(new String[actualSizeOptionsList.size()]);

        extentLogger.info("Verify that size options are S, M, L");
        Assert.assertTrue(Arrays.equals(actualSizeOptions, expectedSizeOptions));

        extentLogger.info("Product information – Add to cart:");
        extentLogger.info("Click on Add to cart");
        pages.product().addToCartBtn.click();

        extentLogger.info("Verify confirmation message “Product successfully added to your shopping\n" +
                           "cart”");
        BrowserUtils.waitForVisibility(pages.product().cartConfirmationMessage,20 );
        String actualMessage = pages.product().cartConfirmationMessage.getText();
        Assert.assertEquals(actualMessage,"Product successfully added to your shopping cart" );

        extentLogger.info("Verify that default quantity is 1");
        Assert.assertEquals(pages.product().layer_cart_product_quantity.getText(), "1");

        extentLogger.info("Verify that default size is S");
        String attribute = pages.product().layer_cart_product_attributes.getText();
        String defaultSize = attribute.substring(attribute.indexOf(",")+1).trim();
        Assert.assertEquals(defaultSize, "S");

        extentLogger.info("Verify that same name and price displayed as on the home page");
        Assert.assertEquals(pages.product().layer_cart_product_title.getText().trim(), product);
        Assert.assertEquals(price, pages.product().layer_cart_product_price.getText().trim());

        extentLogger.pass("Completed: Price test");




    }
}
