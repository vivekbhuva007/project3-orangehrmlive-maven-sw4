package com.oragehrmlive.demo.testsuite;

import com.oragehrmlive.demo.pages.ForgotPassword;
import com.oragehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTest {
    ForgotPassword forgotPassword = new ForgotPassword();

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        // reset password
        forgotPassword.forgotPasswordLink();

        String expectedMessage = "Reset Password";
        Assert.assertEquals(forgotPassword.resetPasswordMessage(),expectedMessage,"no message displayed");



}}
