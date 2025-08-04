package com.ait.qa63;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ItemTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        click(By.cssSelector("[href='/login']"));
        type(By.name("Email"), "pochtaksu@gmail.com");
        type(By.name("Password"), "Pochtaks$123");
        click(By.cssSelector("input.login-button"));
    }

    @Test
    public void addItemToCartTest() {
// кликнуть на кнопку второго товара Add to cart;
        click(By.xpath("//input[contains(@onclick,'/addproducttocart/catalog/2/1/1')]"));
//кликнуть на ссылку Shopping cart в хэдере;
        click(By.cssSelector("[href='/cart']"));
//проверить добавление товара в корзину по его названию
        Assert.assertTrue(isElementPresent(By.cssSelector("[href='/141-inch-laptop']")));
    }
}
