package com.automatedtest.userjourney;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

// Steps for cart overlay and cart page. Should be used to cover more cart page related steps.

public class CartPageSteps {

    private CartPage cartPage;

    public CartPageSteps() {
        this.cartPage = new CartPage();
    }

    @When("^The user clicks on view bag in cart overlay$")
    public void theUserClicksOnViewBagInCartOverlay() {
        this.cartPage.clickViewBagInCartOverlay();
    }

    @Then("^Product \"([^\"]*)\" is displayed on cart page$")
    public void productIsDisplayedOnCartPage(String productName) {
        Assert.assertTrue("Product " + productName +" is not shown on Cart page",this.cartPage.productIsDisplayedOnCartPage(productName));
    }

    @Then("^The cart overlay is shown to the user$")
    public void theCartOverlayIsShownToTheUser() {
        this.cartPage.verifyCartOverlayIsShown();
    }

    @Then("^The cart page is shown to the user$")
    public void theCartPageIsShownToTheUser() {
        this.cartPage.verifyCartPageIsShown();
    }
}
