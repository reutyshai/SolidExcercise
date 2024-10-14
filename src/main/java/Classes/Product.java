package Classes;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * The Product class represents a product in an e-commerce application.
 * It encapsulates details about the product, such as its name and price.
 */
@Getter
public class Product {

    private String productName;

    /**
     * Constructs a Product instance using the provided WebElement.
     *
     * @param webProduct the WebElement representing the product in the web page.
     *                   <p>
     *                   This constructor initializes the product's name by extracting it from the
     *                   provided WebElement.
     */
    public Product(WebElement webProduct) {
        this.setProductName(webProduct);
    }

    /**
     * Sets the product name by extracting it from the specified WebElement.
     *
     * @param productElement the WebElement representing the product element from which
     *                       the name will be extracted.
     *                       <p>
     *                       This method retrieves the text of the anchor tag inside the product element
     *                       and assigns it to the productName field.
     */
    public void setProductName(WebElement productElement) {
        this.productName = productElement.findElement(By.tagName("a")).getText();
    }

}
