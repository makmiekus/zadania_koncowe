package com.course.selenium.pageObjects;

import com.course.selenium.common.PageObjectCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAddressPage extends PageObjectCommon {

    @FindBy(id="field-alias")
    private WebElement aliasField;

    @FindBy(id="field-firstname")
    private WebElement firstNameField;

    @FindBy(id="field-lastname")
    private WebElement lastNameField;

    @FindBy(id="field-company")
    private WebElement companyField;

    @FindBy(id="field-vat_number")
    private WebElement vatNumberField;

    @FindBy(id="field-address1")
    private WebElement addressField;

    @FindBy(id="field-address2")
    private WebElement addressComplementField;

    @FindBy(id="field-city")
    private WebElement cityField;

    @FindBy(id="field-postcode")
    private WebElement postalCodeField;

    @FindBy(id="field-id_country")
    private WebElement countryField;

    @FindBy(id="field-phone")
    private WebElement phoneField;

    @FindBy(xpath="//button[contains(text(),'Save')]")
    private WebElement saveButton;

    public CreateNewAddressPage setAlias(String alias){
        aliasField.clear();
        aliasField.sendKeys(alias);

        return this;
    }

    public CreateNewAddressPage setFirstName(String firstName){
        firstNameField.clear();
        firstNameField.sendKeys(firstName);

        return this;
    }

    public CreateNewAddressPage setLastName(String lastName){
        lastNameField.clear();
        lastNameField.sendKeys(lastName);

        return this;
    }

    public CreateNewAddressPage setCompany(String company){
        companyField.clear();
        companyField.sendKeys(company);

        return this;
    }

    public CreateNewAddressPage setVatNumber(String vatNumber){
        vatNumberField.clear();
        vatNumberField.sendKeys(vatNumber);

        return this;
    }

    public CreateNewAddressPage setAddress(String address){
        aliasField.clear();
        addressField.sendKeys(address);

        return this;
    }

    public CreateNewAddressPage setAddressComplement(String addressComplement){
        addressComplementField.clear();
        addressComplementField.sendKeys(addressComplement);

        return this;
    }

    public CreateNewAddressPage setCity(String city){
        cityField.clear();
        cityField.sendKeys(city);

        return this;
    }

    public CreateNewAddressPage setPostalCode(String postalCode){
        postalCodeField.clear();
        postalCodeField.sendKeys(postalCode);

        return this;
    }

    public CreateNewAddressPage setCountry(String country){
        new Select(countryField).selectByVisibleText(country);

        return this;
    }

    public CreateNewAddressPage setPhone(String phone){
        phoneField.clear();
        phoneField.sendKeys(phone);

        return this;
    }

    public void clickSaveButton(){
        saveButton.click();
        waitFor(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-link-action='add-address']")), 30);
    }
}
