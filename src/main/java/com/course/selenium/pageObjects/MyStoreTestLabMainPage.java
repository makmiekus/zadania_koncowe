package com.course.selenium.pageObjects;

import com.course.selenium.common.Hook;
import com.course.selenium.common.PageObjectCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyStoreTestLabMainPage extends PageObjectCommon {

    @FindBy(css="a[title*='Log in to your customer account']")
    private WebElement signInButton;

    @FindBy(id="field-email")
    private WebElement emailField;

    @FindBy(id="field-password")
    private WebElement passwordField;

    @FindBy(id="submit-login")
    private WebElement submitButton;

    public void openPage(){
        driver.navigate().to("https://mystore-testlab.coderslab.pl/");
    }

    public MyStoreTestLabMainPage clickSignInButton(){
        signInButton.click();
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.id("field-email")), 60);

        return this;
    }

    public MyStoreTestLabMainPage setEmail(String email){
        emailField.clear();
        emailField.sendKeys(email);

        return this;
    }

    public MyStoreTestLabMainPage setPassword(String password){
        passwordField.clear();
        passwordField.sendKeys(password);

        return this;
    }

    public void clickSubmitButton(){
        submitButton.click();
    }
}
