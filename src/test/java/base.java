import Browsers.ChromeBrowserDriver;
import Browsers.FireFoxBrowserDriver;
import Browsers.UniversalDriver;
import Classes.*;
import Components.NavBarElements;
import PageObjects.AccessoriesCatalogPage;
import PageObjects.CartPage;
import PageObjects.PaymentPage;
import PageObjects.ProductDetailsPage;
import Utilities.NavigationActions;
import Utilities.UniqueRandomList;
import Utilities.XmlFileReader;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * The base class serves as a foundational component for the test framework, providing
 * initialization for various page objects and utility classes used in the application.
 * It establishes the WebDriver instance and manages common actions across different tests.
 */
public class base {
    protected NavBarElements navBarElements;
    protected static NavigationActions navigateActions;
    protected AccessoriesCatalogPage accessoriesPage;
    protected ProductDetailsPage productPage;
    protected static CartPage cartPage;
    protected static PaymentPage paymentPage;
    protected Product currentProduct;
    protected static Customer currentCustomer;
    protected static UniversalDriver driver;
    protected static WebDriverWait wait;
    protected static UniqueRandomList uniqueList;
    protected static List<Integer> randomProductIndices;
    protected static int currentTestIteration = -1;

    /**
     * Constructs a base instance, initializing the necessary page objects and components
     * for the test framework.
     */
    public base() {
        paymentPage = PageFactory.initElements(driver.getDriver(), PaymentPage.class);
        navBarElements = PageFactory.initElements(driver.getDriver(), NavBarElements.class);
        accessoriesPage = PageFactory.initElements(driver.getDriver(), AccessoriesCatalogPage.class);
        productPage = PageFactory.initElements(driver.getDriver(), ProductDetailsPage.class);
        cartPage = PageFactory.initElements(driver.getDriver(), CartPage.class);
        navigateActions = new NavigationActions();
    }

    /**
     * Sets the appropriate WebDriver instance based on the configuration specified in the XML file.
     * The method reads the browser type from the config file and initializes the corresponding driver.
     */
    public static void setDriver() {
        switch (XmlFileReader.getData("src/main/resources/config.xml", "Browser")) {
            case "Chrome":
                driver = new ChromeBrowserDriver();
                break;
            case "FireFox":
                driver = new FireFoxBrowserDriver();
                break;
        }
    }
}
