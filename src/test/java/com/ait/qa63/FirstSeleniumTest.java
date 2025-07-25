package com.ait.qa63;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    WebDriver driver;

//    before - setUp
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
       driver.get("https://www.google.com/"); // open browser new without history
//        driver.navigate().to("https://www.google.com/"); with browser history
        driver.navigate().back(); // key back
    }
//    test
    @Test
    public void firstTest() {
        System.out.println("Google is opened!");
    }
//    after - tearDown
@AfterMethod
    public void tearDown() {
        driver.quit(); //  close all tabs or close browser
//        driver.close(); close only one last tab
}
}