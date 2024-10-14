package Utilities;

import org.openqa.selenium.WebElement;

/**
 * The NavigateActions class provides utility methods for navigating and interacting
 * with web elements using Selenium. It encapsulates common navigation actions such as
 * clicking on elements and submitting forms.
 */
public class NavigationActions {

    /**
     * Clicks on the specified web element.
     *
     * @param elementToClick the WebElement representing the element to be clicked.
     *                       <p>
     *                       This method uses the Selenium WebDriver to perform a click action on the
     *                       provided WebElement, which is typically used for buttons or links.
     */
    public void navigateByClick(WebElement elementToClick) {
        elementToClick.click();
    }

    /**
     * Submits the specified web element.
     *
     * @param submitButton the WebElement representing the button or form to be submitted.
     *                     <p>
     *                     This method uses the Selenium WebDriver to submit the form associated with
     *                     the provided WebElement, which is commonly used for form submission actions.
     */
    public void navigateBySubmit(WebElement submitButton) {
        submitButton.submit();
    }
}
