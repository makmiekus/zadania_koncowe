package com.course.selenium.pageObjects;

import com.course.selenium.common.PageObjectCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.stream.Collectors;

public class OrderPage extends PageObjectCommon {

    @FindBy(xpath = "//span[@class='custom-checkbox']//input[contains(@id,'conditions_to_approve')]")
    private WebElement approveCheckBox;

    @FindBy(xpath = "//div[@id='payment-confirmation']//button")
    private WebElement placeOrderButton;

    public OrderPage clickContinueButton(){
        driver.findElements(By.xpath("//button[contains(@class,'continue')]")).stream().filter(WebElement::isDisplayed).collect(Collectors.toList()).get(0).click();
        return this;
    }

    public OrderPage selectDeliveryOption(String option){
        driver.findElement(By.xpath("//div[contains(@class,'row delivery-option')][.//*[contains(text(),'"+option+"')]]//span[.//input[@type='radio']]")).click();
        return this;
    }

    public OrderPage selectPaymentOption(String option){
        driver.findElement(By.xpath("//div[contains(@class,'payment-option')][.//*[contains(text(),'"+option+"')]]//span[.//input[@type='radio']]")).click();
        return this;
    }

    public OrderPage selectAgreeCheckBox(){
        approveCheckBox.click();
        return this;
    }

    public void clickPlaceOrderButton(){
        placeOrderButton.click();
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Order details')]")), 30);
    }


}
