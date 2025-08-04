package com.ait.qa63;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void newUserRegistrationPositiveTest() {
        click(By.cssSelector("a.ico-register"));
        type(By.name("FirstName"), "Andrey1");
        type(By.name("LastName"), "Lebedev1");
        type(By.name("Email"), "pochtaksu@gmail.com");
        type(By.name("Password"), "Pochtaks$123");
        type(By.name("ConfirmPassword"), "Pochtaks$123");
        click(By.name("register-button"));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.result")));
    }

}
