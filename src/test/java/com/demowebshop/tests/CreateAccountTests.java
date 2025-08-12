package com.demowebshop.tests;

import com.demowebshop.core.TestBase;
import com.demowebshop.models.UserData;
import com.demowebshop.utils.MyDataProvider;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

   @Test(dataProvider = "addNewUserFromCsv", dataProviderClass = MyDataProvider.class)
    public void newUserRegistrationFromDataProviderWithCsvFilePositiveTest(UserData userData) {
        app.getUser().clickOnRegisterLink();
        app.getUser().fillRegisterForm(userData);

        Assert.assertTrue(app.getUser().isElementPresent(By.cssSelector(".page-body .result")));
       Assert.assertTrue(app.getUser().isSuccessMessagePresent());
    }


//    @Test(enabled = false)
//    public void newUserRegistrationPositiveTest() {
//        app.getUser().clickOnRegistrationLink();
//        app.getUser().fillInRequiredFields(new UserData()
//                .setUserName("Andrey2")
//                .setUserLastName("Lebedev2")
//                .setEmail("pochtaksuh@gmail.com")
//                .setPassword("Pochtaks$123"));
//
//        Assert.assertTrue(app.getUser().isElementPresent(By.cssSelector(".page-body .result")));
//    }

//    @Test
//    public void newUserRegistrationPositiveTest() {
//        clickOnRegisterLink();
//        fillRegisterForm();
//        clickOnRegisterButton();
//        Assert.assertTrue(isSuccessMessagePresent());
//    }

}
