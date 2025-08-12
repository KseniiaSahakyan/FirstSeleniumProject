package com.demowebshop.fw;

import com.demowebshop.core.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ItemHelper extends BaseHelper {

    public ItemHelper(WebDriver driver) {
        super(driver); // правильная передача драйвера
    }

    public boolean isItemAdded(String text) {
        List<WebElement> contacts = driver.findElements(By.cssSelector(".product-name"));
        for (WebElement element: contacts) {
            if (element.getText().equals(text)) return true;
        }
        return false;
    }



//    public String getItemTitle(String number) {
//        int index = Integer.parseInt(number); // конвертируем строку в число
//
//        List<WebElement> items = new WebDriverWait(driver, Duration.ofSeconds(20))
//                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".item-box .product-title a")));
//
//        if (items.size() <= index) { // проверка, что индекс не выходит за границы
//            throw new RuntimeException("На странице меньше " + (index + 1) + " товаров. Найдено: " + items.size());
//        }
//
//        return items.get(index).getText();
//    }





}
