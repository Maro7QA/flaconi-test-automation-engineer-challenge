package com.automatedtest.userjourney;

import com.automatedtest.basepage.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

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
              String[] lineContent = e.getText().split("\\r?\\n");
              String   productNameCart = lineContent[0];
            if (productNameCart.contains(productName));
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

    public boolean selectedProductByIndexIsShownOnCartPage() {
        List<WebElement> productArray = driver.findElements(productListOnCart);

        for (WebElement e : productArray) {
            if (e.getAttribute("data-sku").contains(""))
                return true;
        }
        return false;
    }
}
