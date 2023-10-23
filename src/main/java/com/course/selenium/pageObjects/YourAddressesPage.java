package com.course.selenium.pageObjects;

import com.course.selenium.common.Address;
import com.course.selenium.common.PageObjectCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class YourAddressesPage extends PageObjectCommon {

    @FindBy(xpath = "//a[@data-link-action='add-address']")
    WebElement addNewAddressLink;

    public void clickCreateNewAddressLink(){
        addNewAddressLink.click();
        waitFor(ExpectedConditions.elementToBeClickable(By.id("field-alias")), 30);
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.id("field-alias")), 30);
    }

    public YourAddressesPage assertAddress(Address address){

        driver.findElement(By.xpath("//article[.//*[contains(text(),'"+address.getAlias()+"')]]//address" +
                "[contains(text(),'"+address.getFirstName()+"')]" +
                "[contains(text(),'"+address.getLastName()+"')]"+
                "[./br//following-sibling::text()='"+address.getCompany()+"']"+
                "[./br//following-sibling::text()='"+address.getVatNumber()+"']"+
                "[./br//following-sibling::text()='"+address.getAddress()+"']"+
                "[./br//following-sibling::text()='"+address.getAddressComplement()+"']"+
                "[./br//following-sibling::text()='"+address.getCity()+"']"+
                "[./br//following-sibling::text()='"+address.getPostalCode()+"']"+
                "[./br//following-sibling::text()='"+address.getCountry()+"']"+
                "[./br//following-sibling::text()='"+address.getPhoneNumber()+"']"));
        return this;
    }
}
