package PageObjects;

import Classes.Customer;

/**
 * The Form interface provides a contract for any form-like structure
 * that can be filled out. Implementing classes should define how to fill
 * the form with the necessary data.
 */
public interface FormFillable {
    /**
     * Fills the form with the required data.
     */
    void fillForm(Customer customer);
}
