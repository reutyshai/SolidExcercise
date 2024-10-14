package Utilities;

import org.openqa.selenium.WebElement;

/**
 * The FillFormField class provides utility methods for interacting with form fields
 * in a web application using Selenium. This class simplifies the process of filling
 * in input fields on a web page.
 */
public class FormFieldFiller {

    /**
     * Fills a specified form field with a given value.
     *
     * @param field the WebElement representing the input field to be filled.
     * @param value the string value to input into the field.
     *              <p>
     *              This method uses the Selenium WebDriver to send the specified value to the
     *              given WebElement. It is primarily used for automating form submissions
     *              in web applications.
     */
    public static void fillField(WebElement field, String value) {
        field.sendKeys(value);
    }
}
