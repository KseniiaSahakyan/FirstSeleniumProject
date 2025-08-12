package com.demowebshop.tests;

import com.demowebshop.models.UserData;
import com.demowebshop.core.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ItemTests extends TestBase {

//    @BeforeMethod
//    public void precondition() {
//        if (!app.getUser().clickOnLog_inLink()) {
//            app.getUser().fillInRequiredFieldsToLogin(new UserData()
//                    .setEmail("pochtaksu@gmail.com")
//                    .setPassword("Pochtaks$123"));
//            app.getUser().clickOnLoginButton();
//        }
//    }
//
//    @Test
//    public void addItemToCartTest() {
//        String itemTitle = app.getItem().getItemTitle("3");
//        app.getItem().clickOnItemLink("3");
//        app.getUser().pause(2000);
//        app.getItem().clickOnShoppingCart();
//
//        Assert.assertTrue(app.getItem().isItemAdded(itemTitle), "Item with title '" + itemTitle + "' was not found in the cart.");
//    }

//    @Test
//    public void clickOnAddButton() {
//        app.getItem().clickOnItemLink("3");
//        app.getItem().clickOnShoppingCart();
//
//        Assert.assertTrue(app.getUser().isElementPresent(By.cssSelector("[href='/141-inch-laptop']")));
//    }

    @BeforeMethod
    public void precondition() {
        clickOnLog_inLink();
        enterUserCredentials();
        clickOnLoginButton();
    }

    @Test
    public void addItemToCart() {
        clickOnAddButton("3");
        clickOnShoppingCartLink();
        Assert.assertTrue(isItemAdded("14.1-inch Laptop"));
    }

}
