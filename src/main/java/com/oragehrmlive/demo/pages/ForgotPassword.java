package com.oragehrmlive.demo.pages;

import com.oragehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class ForgotPassword extends Utility {

    By forgotPasswordButton = By.xpath("//p[contains(@class,'-forgot-header')]");

    By resetPasswordText = By.xpath("//h6[contains(@class,'forgot-password-title')]");

    public void forgotPasswordLink(){
        clickOnElement(forgotPasswordButton);
    }
    public String resetPasswordMessage(){
        return getTextFromElement(resetPasswordText);

    }


}
