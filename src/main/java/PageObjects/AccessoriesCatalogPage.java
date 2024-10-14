package PageObjects;

import Classes.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * The AccessoriesPage class represents the accessories page in the e-commerce application.
 * It provides methods to interact with and retrieve information about the products displayed on the page.
 */
public class AccessoriesCatalogPage {

    /**
     * The WebElement representing the page title.
     */
    @FindBy(css = "h1.page-title")
    private WebElement PageSubject;

    /**
     * The list of WebElements representing the products displayed on the accessories page.
     */
    @FindBy(className = "astra-shop-summary-wrap")
    private List<WebElement> productsList;

    /**
     * Retrieves the WebElement representing the page title.
     *
     * @return the WebElement for the page subject.
     */
    public WebElement getPageSubject() {
        return PageSubject;
    }

    /**
     * Retrieves the number of products displayed on the page.
     *
     * @return the size of the products list.
     */
    public int getNumberOfProduct() {
        return productsList.size();
    }

    /**
     * Retrieves the WebElement for the product link at the specified index.
     *
     * @param index the index of the product in the products list.
     * @return the WebElement representing the product link.
     */
    public WebElement getProductLink(int index) {
        return productsList.get(index).findElement(By.tagName("a"));
    }

    /**
     * Retrieves the WebElement for the product at the specified index.
     *
     * @param index the index of the product in the products list.
     * @return the WebElement representing the product.
     */
    public WebElement getProduct(int index) {
        return productsList.get(index);
    }

    /**
     * Prints the name of the product at the specified index to the console.
     *
     * @param i the index of the product to print.
     */
    public void print(int i) {
        System.out.println("name: " + productsList.get(i).findElement(By.tagName("a")).getText());
    }

    /**
     * Creates a Product instance from the product at the specified index.
     *
     * @param index the index of the product in the products list.
     * @return a Product instance representing the product.
     */
    public Product createProduct(int index) {
        return new Product(productsList.get(index));
    }
}
