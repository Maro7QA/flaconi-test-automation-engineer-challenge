package com.automatedtest.userjourney;

import com.automatedtest.basepage.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

// Page elements and input action for landing page, product grid and product detail page

public class CartPage extends BasePage {

    private By viewBagButtonCartOverlay = By.cssSelector("[class='button-secondary pull-right']");
    private By productListOnCart = By.cssSelector("[class='row product cell ']");
    private By addToCartBox = By.cssSelector("[id='add-to-cart-box']");
    private By cartBody = By.cssSelector("[class='cart    ']");

    public void clickViewBagInCartOverlay() {
        tools.forPresenceOfElements(10, viewBagButtonCartOverlay,"View bag button");
        driver.findElement(viewBagButtonCartOverlay).click();
    }

    public boolean productIsDisplayedOnCartPage(String productName) {
        List<WebElement> productArray = driver.findElements(productListOnCart);
        for (WebElement e : productArray) {
              String[] lineContent = e.getText().split("\\r?\\n"); // Take line content and create string array based on split by newline
              String   productNameCart = lineContent[0].replace("- ",""); // Set string for product name  based on index in arrary & remove "- " sign between brand and article name from product name
            if (productNameCart.contains(productName))
                return true;
        }
        return false;
    }

    public void verifyCartOverlayIsShown() {
        Assert.assertTrue(tools.forPresenceOfElements(10,addToCartBox,"Cart overlay"));
    }

    public void verifyCartPageIsShown() {
        Assert.assertTrue(tools.forPresenceOfElements(10,cartBody,"Cart page"));
    }
}
