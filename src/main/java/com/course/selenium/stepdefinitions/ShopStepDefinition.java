package com.course.selenium.stepdefinitions;

import com.course.selenium.pageObjects.MyStorePage;
import com.course.selenium.pageObjects.OrderPage;
import com.course.selenium.pageObjects.ProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopStepDefinition {

    @When("Click in product {string}")
    public void clickInProductHummingbirdPrintedSweater(String name) {
        new MyStorePage().clickProduct(name);
    }

    @When("Select size {string} and quantity {int}")
    public void selectSizeMAndQuantity(String size, Integer number){
        new ProductPage()
                .SelectSize(size)
                .setQuantity(number);
    }

    @When("Add product to cart")
    public void clickAddToCartButton() {
        new ProductPage()
                .clickAddToCartButton()
                    .clickProceedToCheckOutButton()
                        .clickProceedToCheckoutButton();
    }

    @When("Select address")
    public void selectAddress() {
        new OrderPage()
                .clickContinueButton();
    }

    @When("Select delivery option {string}")
    public void selectDeliveryOptionPick(String deliveryOption) {
        new OrderPage()
                .selectDeliveryOption(deliveryOption)
                .clickContinueButton();
    }

    @When("Select Payment {string}")
    public void selectPaymentPayByCheck(String payment) {
        new OrderPage()
                .selectPaymentOption(payment);
    }

    @When("Click order button")
    public void clickOrderButton() {
        new OrderPage()
                .selectAgreeCheckBox()
                .clickPlaceOrderButton();
    }

    @Then("Screenshot created")
    public void screenshotCreated() {
        new OrderPage()
                .getScreenshot();
    }
}
