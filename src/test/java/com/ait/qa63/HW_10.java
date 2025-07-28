package com.ait.qa63;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HW_10 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
    }

    @Test
    public void firstTest() {
        System.out.println("Shop is opened!");
    }

    @Test
    public void findElements() {
//  WebElement title = driver.findElement(By.tagName("title"));
//  System.out.println(title.getText());
        List<WebElement> titles = driver.findElements(By.tagName("title"));
        System.out.println(titles.size());
        WebElement strong = driver.findElement(By.tagName("strong"));
        System.out.println(strong.getText());

        WebElement id = driver.findElement(By.id("newsletter-email"));
        System.out.println(id.getSize());
// size у id видимо нет, но почему?
        WebElement id1 = driver.findElement(By.id("poll-block-1"));
        System.out.println(id1.getText());

        WebElement element = driver.findElement(By.className("poll-options"));
        System.out.println(element.getText());
        WebElement element1 = driver.findElement(By.className("footer-menu-wrapper"));
        System.out.println(element1.getText());

        WebElement linkText = driver.findElement(By.linkText("Build your own computer"));
        System.out.println(linkText.getText());
        WebElement linkText1 = driver.findElement(By.linkText("My account"));
        System.out.println(linkText1.getText());

        WebElement linkText2 = driver.findElement(By.partialLinkText("Build"));
        System.out.println(linkText2.getText());
        WebElement linkText3 = driver.findElement(By.partialLinkText("My"));
        System.out.println(linkText3.getText());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}