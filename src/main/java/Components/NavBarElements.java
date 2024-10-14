package Components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The NavBarElements class represents the navigation bar elements on a web page.
 * It uses Selenium's Page Object Model to define elements that can be interacted with
 * in the navigation bar.
 */
public class NavBarElements {

    /**
     * The WebElement representing the "Accessories" link in the navigation bar.
     */
    @FindBy(xpath = "//li[@id='menu-item-671']//a")
    private WebElement accessoriesLink;

    /**
     * Retrieves the WebElement for the "Accessories" link.
     *
     * @return the WebElement representing the "Accessories" link.
     */
    public WebElement getAccessoriesLink() {
        return accessoriesLink;
    }
}
