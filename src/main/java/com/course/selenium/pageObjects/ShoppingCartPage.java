package com.course.selenium.pageObjects;

import com.course.selenium.common.PageObjectCommon;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends PageObjectCommon {

    @FindBy(xpath = "//a[contains(text(),'Proceed to checkout')]")
    private WebElement proceedToCheckoutLink;

    public void clickProceedToCheckoutButton(){
        proceedToCheckoutLink.click();
    }
}
