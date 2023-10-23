package com.course.selenium.pageObjects;

import com.course.selenium.common.PageObjectCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class ProductPage extends PageObjectCommon {

    @FindBy(xpath = "//select[@aria-label='Size']")
    private WebElement sizeElement;

    @FindBy(id = "quantity_wanted")
    private WebElement quantityElement;

    @FindBy(xpath = "//button[@data-button-action='add-to-cart']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//a[contains(text(),'Proceed to checkout')]")
    private WebElement proceedToCheckOutButton;

    public ProductPage SelectSize(String size){
        new Select(sizeElement).selectByVisibleText(size);

        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Size:')][contains(text(),'"+size+"')]")), 15);
        return this;
    }

    public ProductPage setQuantity(Integer quantity){
        quantityElement.click();
        quantityElement.sendKeys(Keys.CONTROL+"a");
        quantityElement.sendKeys(Keys.DELETE);
        quantityElement.sendKeys(quantity.toString());

        return this;
    }

    public ProductPage clickAddToCartButton(){
        addToCartButton.click();

        waitFor(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Proceed to checkout')]")),30);

        return this;
    }

    public ShoppingCartPage clickProceedToCheckOutButton(){
        proceedToCheckOutButton.click();
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='card-block']")), 30);

        return new ShoppingCartPage();
    }
}
