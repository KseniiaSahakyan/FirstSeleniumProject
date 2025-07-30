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

    @AfterMethod
    public void tearDown() {
        driver.quit();
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

    @Test
    public void findElementByCssSelector() {
        //tagName
        driver.findElements(By.cssSelector("title"));
        driver.findElement(By.cssSelector("strong"));

        // id
        driver.findElement(By.cssSelector("#newsletter-email"));
        driver.findElement(By.cssSelector("#poll-block-1"));

        // className
        driver.findElement(By.cssSelector(".poll-options"));
        driver.findElement(By.cssSelector(".footer-menu-wrapper"));

        //linkText
        driver.findElement(By.cssSelector("[href='/build-your-own-computer']"));
        driver.findElement(By.cssSelector("[href='/customer/info']"));

        //partialLinkText
        driver.findElement(By.cssSelector("[href*='/build-your-own-computer']"));
        driver.findElement(By.cssSelector("[href*='/customer/info']"));
    }

    @Test
    public void findElementByXpath() {
        //tagName
        driver.findElements(By.xpath("//title"));
        driver.findElement(By.xpath("//strong"));

        // id
        driver.findElement(By.xpath("//*[@id='newsletter-email']"));
        driver.findElement(By.xpath("//*[@id='poll-block-1']"));

        // className
        driver.findElement(By.xpath("//*[@class='poll-options']"));
        driver.findElement(By.xpath("//*[@class='footer-menu-wrapper']"));

        //linkText
        driver.findElement(By.xpath("//*[text()='Build your own computer']"));
        driver.findElement(By.xpath("//a[text()='My account']"));

        //partialLinkText
        driver.findElement(By.xpath("//a[contains(@href,'/build-your-own')]"));
        driver.findElement(By.xpath("//a[contains(text(),'My account')]"));
    }
}