package com.oragehrmlive.demo.testsuite;

import com.oragehrmlive.demo.pages.LoginPage;
import com.oragehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest  extends BaseTest {
    LoginPage loginPage = new LoginPage();



    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        // send text to login field.
        loginPage.usernameField("Admin");

        // Enter username in field
        loginPage.passwordField("admin123");

        // Click on login button
        loginPage.clickToLoginButton();

        // Verify DashBoard Message Occur
        String expectedMessage = "Dashboard";
        Assert.assertEquals(loginPage.MessageOccur(),expectedMessage,"Message not Displayed");

    }
}
