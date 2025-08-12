package com.demowebshop.fw;

import com.demowebshop.core.BaseHelper;
import com.demowebshop.models.UserData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class UserHelper extends BaseHelper {

    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnRegisterLink() {
        click(By.cssSelector("[href='/register']"));
    }

    public void clickOnRegisterButton() {
        click(By.id("register-button"));
    }

    public void clickOnLoginButton() {
        click(By.cssSelector(".button-1.login-button"));
    }

    public void fillRegisterForm() {
        type(By.id("FirstName"), "John");
        type(By.id("LastName"), "Doe");
        type(By.id("Email"), "doe3@gm.com");
        type(By.id("Password"), "Doe12345");
        type(By.id("ConfirmPassword"), "Doe12345");
    }

    public void enterUserCredentials() {
        type(By.id("Email"), "doe2@gm.com");
        type(By.id("Password"), "Doe12345");
    }

    public void clickOnLog_inLink() {
        click(By.cssSelector("[href='/login']"));
    }

    public void clickOnShoppingCartLink() {
        click(By.cssSelector("[href='/cart']"));
    }

//    public void clickOnShoppingCart() {
//        click(By.cssSelector("[href='/cart']"));
//    }

    public void clickOnItemLink(String number) {
        click(By.cssSelector(".item-box:nth-child(" + number + ") .add-info .buttons input"));
//        .item-box:nth-child(3) .add-info .buttons input
    }

//    public void clickOnAddButton(String number) {
//        click(By.cssSelector(".item-box:nth-child("+number+") .add-info .buttons input"));
//    }

    public boolean isNewUserCreated(String text) {
        List<WebElement> contacts = driver.findElements(By.cssSelector(".result"));
        for (WebElement element : contacts) {
            if (element.getText().equals(text)) return true;
        }
        return false;
    }

    public void fillInRequiredFieldsToLogin(UserData user) {
        type(By.cssSelector("#Email"), user.getEmail());
        type(By.cssSelector("#Password"), user.getPassword());
    }

    public boolean isSuccessMessagePresent() {
        return isElementPresent(By.cssSelector(".page-body .result"));


//      }  public void fillInRequiredFields(UserData user) {
//        type(By.cssSelector("#FirstName"), user.getUserName());
//        type(By.cssSelector("#LastName"), user.getUserLastName());
//        type(By.cssSelector("#Email"), user.getEmail());
//        type(By.cssSelector("#Password"), user.getPassword());
//        type(By.cssSelector("#ConfirmPassword"), user.getPassword());
//        click(By.cssSelector("#register-button"));
//    }


//    public boolean clickOnLoginLink() {
//        if (isElementPresent(By.cssSelector("[href='/login']"))) {
//            click(By.cssSelector("[href='/login']"));
//            return true;
//        }
//        return false;
//    }

    }
