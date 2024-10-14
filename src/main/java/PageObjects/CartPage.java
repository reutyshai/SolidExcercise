package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * The CartPage class represents the shopping cart page in the e-commerce application.
 * It provides methods to interact with and retrieve information about the products in the cart.
 */
public class CartPage {

    /**
     * The list of WebElements representing the products in the cart.
     */
    @FindBy(css = ".woocommerce-cart-form__cart-item")
    private List<WebElement> productsInCart;

    /**
     * Retrieves the list of products currently in the cart.
     *
     * @return a list of WebElements representing the products in the cart.
     */
    public List<WebElement> getProductsInCart() {
        return productsInCart;
    }

    /**
     * The WebElement representing the checkout button on the cart page.
     */
    @FindBy(className = "checkout-button")
    private WebElement paymentButton;

    /**
     * Retrieves the checkout button WebElement.
     *
     * @return the WebElement for the checkout button.
     */
    public WebElement getPaymentButton() {
        return paymentButton;
    }

    /**
     * Retrieves the number of products currently in the cart.
     *
     * @return the size of the productsInCart list.
     */
    public int getNumberOfProducts() {
        return productsInCart.size();
    }

    /**
     * Retrieves the name of the product at the specified index in the cart.
     *
     * @param index the index of the product in the cart.
     * @return the name of the product as a string.
     */
    public String getProductName(int index) {
        return productsInCart.get(index).findElement(By.xpath(".//td[@class='product-name']")).getText();
    }

    /**
     * Retrieves the quantity of the product at the specified index in the cart.
     *
     * @param index the index of the product in the cart.
     * @return the quantity of the product as a string.
     */
    public String getQuantityByIndex(int index) {
        return productsInCart.get(index).findElement(By.id("quantity_670b6e7b8f061")).getAttribute("value");
    }
}
