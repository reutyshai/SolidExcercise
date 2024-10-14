package PageObjects;

import Classes.Customer;
import Utilities.FormFieldFiller;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The PaymentPage class represents the payment page in the e-commerce application.
 * It provides methods to fill out the payment form with customer information and submit the form.
 */
public class PaymentPage implements FormFillable {

    @FindBy(id = "billing_first_name")
    private WebElement firstNameField;

    @FindBy(id = "billing_last_name")
    private WebElement lastNameField;

    @FindBy(id = "billing_company")
    private WebElement companyNameField;

    @FindBy(id = "billing_address_1")
    private WebElement addressField;

    @FindBy(id = "billing_address_2")
    private WebElement apartmentField;

    @FindBy(id = "billing_postcode")
    private WebElement postcodeField;

    @FindBy(id = "billing_city")
    private WebElement cityField;

    @FindBy(id = "billing_phone")
    private WebElement phoneField;

    @FindBy(id = "billing_email")
    private WebElement emailField;

    @FindBy(id = "place_order")
    private WebElement paymentButton;

    /**
     * Fills in the payment form using the information from the customer object.
     * Submits the form after filling all required fields.
     * <p>
     * This method uses the FillFormField utility to populate each field with the
     * corresponding data from the Customer instance. Once all fields are filled,
     * it submits the payment form.
     */
    public void fillForm(Customer customer) {
        FormFieldFiller.fillField(firstNameField, customer.getFirstName());
        FormFieldFiller.fillField(lastNameField, customer.getLastName());
        FormFieldFiller.fillField(companyNameField, customer.getCompanyName());
        FormFieldFiller.fillField(addressField, customer.getAddress());
        FormFieldFiller.fillField(apartmentField, customer.getApartment());
        FormFieldFiller.fillField(postcodeField, customer.getPostCode());
        FormFieldFiller.fillField(cityField, customer.getCity());
        FormFieldFiller.fillField(phoneField, customer.getPhone());
        FormFieldFiller.fillField(emailField, customer.getEmail());
        paymentButton.submit();
    }
}
