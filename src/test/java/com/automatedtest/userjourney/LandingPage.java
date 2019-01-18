package com.automatedtest.userjourney;

import com.automatedtest.basepage.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

//// Page elements and input action for cart overlay and cart page

public class LandingPage extends BasePage {

    private static final String landingPageURL = "https://www.flaconi.";

    private By searchInputField = By.cssSelector("[id='autosuggest-form-header']");
    private By searchButton = By.cssSelector("#autosuggest-form-header > button");
    private By productImage = By.cssSelector("div.product-item-box > a > img");
    private By productList = By.cssSelector("[class='product-list']");
    private By addToCartButton = By.cssSelector("[class='button-primary loaderbox-trigger loaderbox-submit-form']");
    private By cookieMessageBoxCloseButton = By.cssSelector("[class='cookie-box__close']");

    LandingPage() {
        PageFactory.initElements(driver, this);
    }

    public void openFlaconiLandingPage(String marketCode) {
        driver.get(landingPageURL + marketCode);
        tools.forLoading(5);
    }

    public void searchForProduct(String searchTerm) {
        tools.forPresenceOfElements(10,searchInputField,"Search input field");
        tools.typeByLocator(searchInputField,searchTerm);
        driver.findElement(searchButton).click();
    }

    public void userSelectsProductFromProductGrid(String productName) {
        List<WebElement> productImageArray = driver.findElements(productImage);
        for (WebElement e : productImageArray) {
            if (e.getAttribute("title").contains(productName)) {
                e.click();
                return;
            }
        }
        Assert.assertTrue(productName + " cannot be selected from product grid",false);
    }

    public void selectFristSizeOfProductListOnProductDetailPage(){
        tools.forPresenceOfElements(10,productList,"Product list is not shown!");
        driver.findElements(addToCartButton).get(0).click();
    }

    public void closeCookieMessageBox() {
        if (tools.forPresenceOfElements(10, cookieMessageBoxCloseButton, "Cookie message box")) {
            driver.findElement(cookieMessageBoxCloseButton).click();
        }
    }
}
