package com.oragehrmlive.demo.pages;

import com.oragehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By username = By.name("username");

    By password = By.name("password");

    By loginButton = By.xpath("//button[@type='submit']");

    By dashBoardMessage = By.xpath("//h6[contains(@class,'header-breadcrumb-module')]");


    public void usernameField(String userName) {
        sendTextToElement(username, userName);


    }

    public void passwordField(String passcode) {
        sendTextToElement(password, passcode);


    }
    public void clickToLoginButton(){
        clickOnElement(loginButton);
    }

    public String MessageOccur(){
        return getTextFromElement(dashBoardMessage);
    }
}
