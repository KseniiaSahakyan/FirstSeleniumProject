package com.demowebshop.fw;

import com.demowebshop.core.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ItemHelper extends BaseHelper {

    public ItemHelper(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;

    public String getItemTitle() {
        WebElement item = driver.findElement(By.cssSelector(".item-box:nth-child(3) .add-info .buttons input"));
        String itemName = item.getText();
        System.out.println("item.getText() = " + item.getText());
        return itemName;
    }

    public boolean isContactCreated(String text) {
        List<WebElement> contacts = driver.findElements(By.cssSelector(".product-name"));
        for (WebElement element : contacts) {
            if (element.getText().equals(text)) {
                return true;
            }
        }
        return false;
    }

    public void clickOnItemLink() {
        click(By.cssSelector((".item-box:nth-child(3) .add-info .buttons input")));
    }

    public void clickOnShoppingCart() {
        click(By.cssSelector("[href='/cart']"));
    }
}
