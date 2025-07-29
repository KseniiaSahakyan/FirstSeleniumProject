package com.ait.qa63;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app");
        // maximize browser to window
        driver.manage().window().maximize();
        //driver.manage().window().setSize(new Dimension(900, 400));
        // wait until all elements are loaded
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void findElementByTagName() {
        WebElement title = driver.findElement(By.tagName("h1"));
        System.out.println(title.getText());
        //h2
        WebElement title2 = driver.findElement(By.tagName("h2"));
        System.out.println(title2.getText());
        //a
        WebElement link = driver.findElement(By.tagName("a"));
        System.out.println(link.getText());
        //label
        WebElement label = driver.findElement(By.tagName("label"));
        System.out.println(label.getText());
        List<WebElement> labels = driver.findElements(By.tagName("label"));
        System.out.println(labels.size());
        // find list of elements by tag name => a
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
    }

    @Test
    public void findElementById() {
        driver.findElement(By.id("city"));

        List<WebElement> city = driver.findElements(By.id("city"));
        System.out.println(city.size());

        WebElement dates = driver.findElement(By.id("dates"));
        System.out.println(dates.getText());
    }

    @Test
    public void findElementByClassName() {
        WebElement telephone = driver.findElement(By.className("telephone"));
        System.out.println(telephone.getText());

        WebElement search = driver.findElement(By.className("navigation-link"));
        System.out.println(search.getText());
        System.out.println(search.getDomAttribute("class"));
    }

    @Test
    public void findElementByLinkText() {
        WebElement linkText = driver.findElement(By.linkText("Let the car work"));
        System.out.println(linkText.getText());

        WebElement linkText1 = driver.findElement(By.linkText("Los Angeles"));
        System.out.println(linkText1.getText());
    }

    @Test
    public void findElementByPartialLinkText() {
        WebElement linkText = driver.findElement(By.partialLinkText("work"));
        System.out.println(linkText.getText());

        WebElement linkText1 = driver.findElement(By.partialLinkText("Los"));
        System.out.println(linkText1.getText());
    }

    @Test
    public void findElementByCssSelector() {
        //driver.findElement(By.tagName("h1"));
        // tagName "h1" => "h1"
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("h2"));

        //driver.findElement(By.id("city"));
        //id = "city" => #city
        driver.findElement(By.cssSelector("#city"));

        // driver.findElement(By.className("telephone"));
        //class= "telephone" => .telephone
        driver.findElement(By.cssSelector(".telephone"));
        driver.findElement(By.cssSelector(".navigation-link"));

        // [key='value']
        driver.findElement(By.cssSelector("[href='/search']"));
        driver.findElement(By.cssSelector("[href='/let-car-work']"));

        //contains => *
        driver.findElement(By.cssSelector("[href*='/reg']"));
        driver.findElement(By.cssSelector("[class*='offers']"));

        //start -> ˆ
        driver.findElement(By.cssSelector("[href^='/ter']"));
        driver.findElement(By.cssSelector("[class^='red']"));

        //end to-> $
        driver.findElement(By.cssSelector("[href$='work']"));
        driver.findElement(By.cssSelector("[class$='cities']"));

        //one step above
        driver.findElement(By.cssSelector(".logo>img"));
        driver.findElement(By.cssSelector(".input-container [formcontrolname='city']"));

        //<tag> or <class> or <id>:nth-child(n)
        WebElement element = driver.findElement(By.cssSelector(".navigation-link:nth-child(6)"));
        System.out.println(element.getText());
    }

}
