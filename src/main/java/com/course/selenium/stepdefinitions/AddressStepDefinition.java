package com.course.selenium.stepdefinitions;

import com.course.selenium.common.Address;
import com.course.selenium.pageObjects.CreateNewAddressPage;
import com.course.selenium.pageObjects.MyStoreTestLabMainPage;
import com.course.selenium.pageObjects.UserAccountPage;
import com.course.selenium.pageObjects.YourAddressesPage;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class AddressStepDefinition {



    @Given("MyStoreOpened")
    public void mystoreopened() {
        new MyStoreTestLabMainPage().openPage();
    }

    @Given("UserLoggedIn")
    public void userloggedin() {
        new MyStoreTestLabMainPage()
                .clickSignInButton()
                    .setEmail("wuxsnjwaftjhkeagam@cazlp.com")
                    .setPassword("test1")
                    .clickSubmitButton();
    }

    @Given("Addresses page opened")
    public void addressesPageOpened() {
        new UserAccountPage().clickAddressesLink();
    }

    @DataTableType
    public Address addressEntryTransformer(Map<String, String> entry) {
        return new Address(
                entry.get("Alias"),
                entry.get("First name"),
                entry.get("Last name"),
                entry.get("Company"),
                entry.get("VAT number"),
                entry.get("Address"),
                entry.get("Address complement"),
                entry.get("City"),
                entry.get("Postal code"),
                entry.get("Country"),
                entry.get("Phone number"));
    }

    @When("Add new address:")
    public void addNewAddress(List<Address> addresses) {
        for(Address address : addresses) {
            new YourAddressesPage().clickCreateNewAddressLink();
            new CreateNewAddressPage()
                    .setAlias(address.getAlias())
                    .setFirstName(address.getFirstName())
                    .setLastName(address.getLastName())
                    .setCompany(address.getCompany())
                    .setVatNumber(address.getVatNumber())
                    .setAddress(address.getAddress())
                    .setAddressComplement(address.getAddressComplement())
                    .setCity(address.getCity())
                    .setPostalCode(address.getPostalCode())
                    .setCountry(address.getCountry())
                    .setPhone(address.getPhoneNumber())
                    .clickSaveButton();
        }
    }

    @Then("Addresses created")
    public void addressesCreated(List<Address> addresses) {
        for(Address address : addresses) {
            new YourAddressesPage()
                    .assertAddress(address);
        }
    }

    @Given("My Store opened")
    public void myStoreOpened() {
        new UserAccountPage().clickMyStoreLink();
    }


}
