package com.demowebshop.core;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp() {
        app.init();
    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        app.stop();
    }

    //    public boolean isItemAddedIntoCart(String text) {
//        List<WebElement> items = driver.findElements(By.cssSelector("[href='/141-inch-laptop']"));
//        for (WebElement element : items) {
//            if (element.getText().equals(text)) return true;
//        }
//        return false;
//    }
}