package com.ait.qa63;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class FirstSeleniumTest {

    WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuit");
    }

    @AfterSuite
    public void afterSuit() {
        System.out.println("afterSuit");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("*****BeforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("*****AfterTest");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("**********BeforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("**********AfterClass");
    }

    //    before - setUp
    @BeforeMethod
    public void setUp() {
        System.out.println("*************BeforeMethod");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/"); // open browser new without history
//        driver.navigate().to("https://www.google.com/"); with browser history
        // driver.navigate().back(); // key back
    }

    //    test
    @Test
    public void firstTest() {
        System.out.println("***********Test");
        System.out.println("Google is opened!");
    }

    //    after - tearDown
    @AfterMethod
    public void tearDown() {
        System.out.println("***************AfterMethod");
        driver.quit(); //  close all tabs or close browser
//        driver.close(); close only one last tab
    }
}