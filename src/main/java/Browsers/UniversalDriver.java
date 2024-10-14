package Browsers;

import org.openqa.selenium.WebDriver;

/**
 * The UniversalDriver interface defines the essential operations for a browser driver
 * in the context of web automation using Selenium. It serves as a contract for various
 * browser implementations, allowing for consistent interaction with different browsers.
 */
public interface UniversalDriver {

    /**
     * Retrieves the WebDriver instance associated with the browser.
     *
     * @return the WebDriver instance.
     */
    WebDriver getDriver();

    /**
     * Closes the browser and quits the WebDriver session.
     * This method should release any resources associated with the driver.
     */
    void quit();

    /**
     * Navigates to the specified URL using the browser.
     *
     * @param url the URL to navigate to.
     */
    void get(String url);
}
