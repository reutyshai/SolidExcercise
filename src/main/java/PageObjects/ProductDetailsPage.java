package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The ProductPage class represents the individual product page in the e-commerce application.
 * It provides methods to interact with and retrieve information about the product displayed on the page.
 */
public class ProductDetailsPage {

    /**
     * The WebElement representing the "Add to Cart" button for the product.
     */
    @FindBy(className = "single_add_to_cart_button")
    private WebElement addToCartBtn;

    /**
     * The WebElement representing the link to view the cart after adding a product.
     */
    @FindBy(xpath = "//div[@class='woocommerce-message']/a")
    private WebElement moveToCartLink;

    /**
     * The WebElement representing the product name on the product page.
     */
    @FindBy(className = "product_title")
    private WebElement productName;

    /**
     * Retrieves the WebElement for the product name.
     *
     * @return the WebElement representing the product name.
     */
    public WebElement getProductName() {
        return productName;
    }

    /**
     * Retrieves the WebElement for the "Add to Cart" button.
     *
     * @return the WebElement for the "Add to Cart" button.
     */
    public WebElement getAddToCartBtn() {
        return addToCartBtn;
    }

    /**
     * Retrieves the WebElement for the link to move to the cart.
     *
     * @return the WebElement for the link to view the cart.
     */
    public WebElement getMoveToCartLink() {
        return moveToCartLink;
    }
}
