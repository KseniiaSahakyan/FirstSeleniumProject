package com.demowebshop.tests;

import com.demowebshop.models.UserData;
import com.demowebshop.core.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ItemTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        if (!app.getUser().clickOnLoginLink()) {
            app.getUser().fillInRequiredFieldsToLogin(new UserData()
                    .setEmail("pochtaksu@gmail.com")
                    .setPassword("Pochtaks$123"));
            app.getUser().clickOnLoginButton();
        }
    }

    @Test
    public void addItemToCartTest() {
        String itemTitle = app.getItem().getItemTitle();
        app.getItem().clickOnItemLink();
        app.getUser().pause(2000);
        app.getItem().clickOnShoppingCart();

        Assert.assertTrue(app.getItem().isContactCreated(itemTitle), "Item with title '" + itemTitle + "' was not found in the cart.");
    }

    @Test
    public void clickOnAddButton() {
// кликнуть на кнопку второго товара Add to cart;
        app.getItem().clickOnItemLink();
//кликнуть на ссылку Shopping cart в хэдере;
        app.getItem().clickOnShoppingCart();
//проверить добавление товара в корзину по его названию
        Assert.assertTrue(app.getUser().isElementPresent(By.cssSelector("[href='/141-inch-laptop']")));
    }
}
