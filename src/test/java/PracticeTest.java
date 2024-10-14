import Classes.*;
import Extensions.LoggerExtension;
import Utilities.CsvFileReader;
import Utilities.UniqueRandomList;
import Utilities.XmlFileReader;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.FieldSource;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Objects;

/**
 * The PracticeTest class contains test cases for validating the functionalities of the
 * e-commerce application, specifically focusing on product selection, cart operations,
 * and payment processes. It uses JUnit for test execution and parameterized tests for
 * varying product selections.
 */
@ExtendWith(LoggerExtension.class)
public class PracticeTest extends base {

    /**
     * Initializes the test session before all tests are executed.
     * It sets up the WebDriver, navigates to the application URL,
     * and prepares the unique list of product indices.
     */
    @BeforeAll
    public static void beforeSession() {
        uniqueList = new UniqueRandomList();
        setDriver();
        driver.getDriver().manage().window().maximize();
        driver.get(XmlFileReader.getData(FilesPath.CONFIG.getPath(), "Url"));
        wait = new WebDriverWait(driver.getDriver(), Duration.ofSeconds(10));
        randomProductIndices = uniqueList.uniqueRandomList(2, 7);
    }

    /**
     * Prepares the test environment before each test.
     * It navigates to the accessories page and verifies that the page subject
     * matches the expected tag name from the configuration.
     */
    @BeforeEach
    public void beforeTest() {
        navigateActions.navigateByClick(navBarElements.getAccessoriesLink());
        Assertions.assertEquals(accessoriesPage.getPageSubject().getText(),
                XmlFileReader.getData(FilesPath.CONFIG.getPath(), "TagName"));
        currentTestIteration++;
    }

    /**
     * Parameterized test that validates the product selection and cart operations.
     * This method is annotated with {@link ParameterizedTest} and uses {@link FieldSource}
     * to obtain product indices for testing.
     * <p>
     * The method performs the following actions:
     * <ul>
     *     <li>Creates a Product instance based on the randomly selected index.</li>
     *     <li>Navigates to the product detail page of the selected product.</li>
     *     <li>Validates that the displayed product name matches the expected product name.</li>
     *     <li>Adds the product to the cart by clicking the corresponding button.</li>
     *     <li>Navigates to the cart page and verifies the cart contents:</li>
     *     <ul>
     *         <li>Checks that the number of products in the cart matches the expected count.</li>
     *         <li>Verifies that the product name in the cart matches the expected product name.</li>
     *     </ul>
     * </ul>
     *
     * @param randomNumberToChooseProduct the index of the product selected for testing.
     */
    @ParameterizedTest
    @FieldSource("randomProductIndices")
    public void test(int randomNumberToChooseProduct) {
        currentProduct = accessoriesPage.createProduct(randomNumberToChooseProduct);
        navigateActions.navigateByClick(accessoriesPage.getProductLink(randomNumberToChooseProduct));
        Assertions.assertEquals(currentProduct.getProductName(), productPage.getProductName().getText());
        navigateActions.navigateByClick(productPage.getAddToCartBtn());
        navigateActions.navigateByClick(productPage.getMoveToCartLink());
        Assertions.assertAll(
                () -> {
                    Assertions.assertEquals(cartPage.getNumberOfProducts(), currentTestIteration + 1);
                },
                () -> {
                    Assertions.assertEquals(cartPage.getProductName(currentTestIteration), currentProduct.getProductName());
                }
        );

    }

    /**
     * Cleans up the test session after all tests are executed.
     * This method is annotated with {@link AfterAll}, which indicates that it
     * will be executed once after all test methods in this class have been executed.
     * <p>
     * The method performs the following actions:
     * <ul>
     *     <li>Navigates to the payment page by clicking the payment button in the cart.</li>
     *     <li>Fills the payment form using the current customer's details.</li>
     *     <li>Quits the WebDriver session to close the browser.</li>
     * </ul>
     */
    @AfterAll
    public static void afterSession() {
        currentCustomer = new Customer(Objects.requireNonNull(CsvFileReader.readCsvRow(FilesPath.DATA.getPath(),1)));
        navigateActions.navigateByClick(cartPage.getPaymentButton());
        paymentPage.fillForm(currentCustomer);
        driver.quit();
    }
}
