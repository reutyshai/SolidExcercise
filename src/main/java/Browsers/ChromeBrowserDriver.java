package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * The ChromeBrowserDriver class implements the UniversalDriver interface,
 * providing a WebDriver implementation specifically for the Chrome browser.
 * It facilitates browser interactions such as navigating to URLs and quitting the browser.
 */
public class ChromeBrowserDriver implements UniversalDriver {
    private WebDriver driver;

    /**
     * Constructs a ChromeBrowserDriver instance, initializing the ChromeDriver.
     */
    public ChromeBrowserDriver() {
        driver = new ChromeDriver();
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

    /**
     * Retrieves the WebDriver instance for the Chrome browser.
     *
     * @return the WebDriver instance.
     */
    public WebDriver getDriver() {
        return driver;
    }

    /**
     * Navigates to the specified URL using the Chrome browser.
     *
     * @param url the URL to navigate to.
     */
    @Override
    public void get(String url) {
        driver.get(url);
    }
}
