package com.demowebshop.fw;

import com.demowebshop.core.BaseHelper;
import com.demowebshop.models.UserData;
import org.openqa.selenium.By;
import org.testng.Assert;

public class UserHelper extends BaseHelper {

    public UserHelper() {
        super();
    }

    public boolean clickOnLoginLink() {
        click(By.cssSelector("[href='/login']"));
        return false;
    }

    public void clickOnRegistrationLink() {
        click(By.cssSelector("[href='/register']"));
    }

    public void fillInRequiredFieldsToLogin(UserData user) {
        // enter email
        type(By.cssSelector("#Email"), user.getEmail());
        // enter password
        type(By.cssSelector("#Password"), user.getPassword());
    }

    public void fillInRequiredFields(UserData user) {
        type(By.cssSelector("#FirstName"), user.getUserName());
        type(By.cssSelector("#LastName"), user.getUserLastName());
        type(By.cssSelector("#Email"), user.getEmail());
        type(By.cssSelector("#Password"), user.getPassword());
        type(By.cssSelector("#ConfirmPassword"), user.getPassword());
        click(By.cssSelector("#register-button"));

        Assert.assertTrue(isElementPresent(By.cssSelector("div.result")));
    }

    public void clickOnLoginButton() {
        click(By.cssSelector(".button-1.login-button"));
    }
}
