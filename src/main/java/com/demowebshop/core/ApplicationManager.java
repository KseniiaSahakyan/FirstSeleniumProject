package com.demowebshop.core;

import com.demowebshop.fw.UserHelper;
import com.demowebshop.fw.ItemHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class ApplicationManager {

   WebDriver driver;

   public static SoftAssert softAssert;

    private UserHelper user;
    private ItemHelper item;

    // Инициализация браузера и helper-классов
    public void init() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        user = new UserHelper(driver);
        item = new ItemHelper(driver);
        softAssert = new SoftAssert();
    }

    // Закрытие браузера
    public void stop() {
        if (driver != null) {
            driver.quit();
        }
    }

    // Геттеры
    public UserHelper getUser() {
        return user;
    }

    public ItemHelper getItem() {
        return item;
    }
}