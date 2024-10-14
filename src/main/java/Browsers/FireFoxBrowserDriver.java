package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * The FireFoxBrowserDriver class implements the UniversalDriver interface,
 * providing a WebDriver implementation specifically for the Firefox browser.
 * It facilitates browser interactions such as navigating to URLs and quitting the browser.
 */
public class FireFoxBrowserDriver implements UniversalDriver {
    private WebDriver driver;

    /**
     * Constructs a FireFoxBrowserDriver instance, initializing the FirefoxDriver.
     */
    public FireFoxBrowserDriver() {
        driver = new FirefoxDriver();
    }

    /**
     * Navigates to the specified URL using the Firefox browser.
     *
     * @param url the URL to navigate to.
     */
    @Override
    public void get(String url) {
        driver.get(url);
    }

    /**
     * Retrieves the WebDriver instance for the Firefox browser.
     *
     * @return the WebDriver instance.
     */
    @Override
    public WebDriver getDriver() {
        return driver;
    }

    /**
     * Closes the browser and quits the WebDriver session.
     * <p>
     * This method calls the quit method of the WebDriver to terminate the
     * browser session and release any associated resources.
     */
    @Override
    public void quit() {
        driver.quit();
    }
}
