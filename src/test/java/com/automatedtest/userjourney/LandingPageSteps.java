package com.automatedtest.userjourney;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

// Steps for landing page, product grid and product detail page.

public class LandingPageSteps {

    private LandingPage landingPage;

    public LandingPageSteps() {
        this.landingPage = new LandingPage();
    }

    @Given("^The user navigates to Flaconi landing page on market \"([^\"]*)\"$")
    public void theUserNavigatesToFlaconiLandingPageOnMarket(String marketCode) {
        this.landingPage.openFlaconiLandingPage(marketCode);
    }

    @Then("^The user searches for product \"([^\"]*)\"$")
    public void theUserSearchesForProduct(String searchTerm) {
       this.landingPage.searchForProduct(searchTerm);
    }

    @When("^The user selects product \"([^\"]*)\" from product grid$")
    public void theUserSelectsProductFromProductGrid(String productName) {
        this.landingPage.userSelectsProductFromProductGrid(productName);
    }

    @When("^The user selects first size of the list on product detail page$")
    public void theUserSelectsFirstSizeOfTheListOnProductDetailPage() {
        this.landingPage.selectFristSizeOfProductListOnProductDetailPage();
    }

    @When("^The user closes the cookie message overlay$")
    public void theUserClosesTheCookieMessageOverlay() {
        this.landingPage.closeCookieMessageBox();
    }
}
