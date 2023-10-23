package com.course.selenium.pageObjects;

import com.course.selenium.common.PageObjectCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UserAccountPage extends PageObjectCommon {

    @FindBy(xpath = "//footer//a[@title='Addresses']")
    private WebElement addressesLink;

    @FindBy(xpath = "//div[@class='header-top']//a[contains(@href,'mystore')]")
    private WebElement myStoreLink;

    public void clickAddressesLink(){
        addressesLink.click();
        waitFor(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-link-action='add-address']")), 60);
    }

    public void clickMyStoreLink(){
        myStoreLink.click();
    }
}
