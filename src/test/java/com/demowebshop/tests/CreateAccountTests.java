package com.demowebshop.tests;

import com.demowebshop.core.TestBase;
import com.demowebshop.models.UserData;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test (enabled = false)
    public void newUserRegistrationPositiveTest() {
        app.getUser().clickOnRegistrationLink();
        app.getUser().fillInRequiredFields(new UserData()
                .setUserName("Andrey2")
                .setUserLastName("Lebedev2")
                .setEmail("pochtaksuh@gmail.com")
                .setPassword("Pochtaks$123"));

        Assert.assertTrue(app.getUser().isElementPresent(By.cssSelector(".page-body .result")));
        Assert.assertTrue(app.getUser().isElementPresent(By.xpath("//a[@href='/customer/info']")));

    }
}
