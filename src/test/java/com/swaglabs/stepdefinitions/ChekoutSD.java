package com.swaglabs.stepdefinitions;

import com.swaglabs.base.ConfigReader;
import com.swaglabs.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ChekoutSD {
    @Given("^user is logged in the shopping area$")
    public void verifyUserIsLoggedIn(){
        LoginPage.enterUserName(ConfigReader.getProperty("username"));
        LoginPage.enterPassword(ConfigReader.getProperty("password"));
        LoginPage.clickLoginBtn();
        String actualTitle= HomePage.verifyTitle();
        Assert.assertEquals("Swag Labs",actualTitle);
        Assert.assertTrue(HomePage.isLogoDisplayed());
    }

    @When("user clicks on item with name {string}")
    public void userClicksOnItemWithName(String itemName) {
        HomePage.clickItem(itemName);
    }

    @And("user clicks on the add to cart button")
    public void userClicksOnTheAddToCartButton() {
        ItemPage.clickAddToCart();

    }

    @And("user clicks on the shopping car button")
    public void userClicksOnTheShoppingCarButton() {
        ItemPage.clickCartButton();
    }

    @And("user clicks on the checkout button")
    public void userClicksOnTheCheckoutButton() {
        CartPage.clickCheckout();
    }

    @And("user enters order information as {string}, {string},{string}")
    public void userEntersOrderInformationAs(String fName, String lName, String zipCode) {
        CheckOutStepOne.sendOrderInfo(fName,lName,zipCode);

    }

    @And("user clicks on the continue button")
    public void userClicksOnTheContinueButton() {
        CheckOutStepOne.clickContinue();
    }

    @Then("user sees the item name matches that of the {string}")
    public void userSeesTheItemNameMatchesThatOfThe(String itemName) {
        Assert.assertEquals(itemName,CheckoutStepTwo.verifyItem());
    }
}
