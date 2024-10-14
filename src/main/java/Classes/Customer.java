package Classes;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * The Customer class represents a customer with personal and contact information.
 * It encapsulates details such as the customer's name, address, and contact information.
 */
@AllArgsConstructor
public class Customer {

    @Getter
    private int id;                  // Unique identifier for the customer
    @Getter
    private String firstName;        // First name of the customer
    @Getter
    private String lastName;         // Last name of the customer
    @Getter
    private String companyName;      // Company name associated with the customer
    @Getter
    private String apartment;        // Apartment number, if applicable
    @Getter
    private String city;             // City where the customer resides
    @Getter
    private String postCode;         // Postal code for the customer's address
    @Getter
    private String phone;            // Phone number of the customer
    @Getter
    private String email;            // Email address of the customer
    private String houseNumber;       // House number of the customer's address
    private String street;            // Street name of the customer's address

    /**
     * Constructs a Customer instance from an array of strings.
     *
     * @param customerFromCsv an array of strings containing customer data
     *                        in the following order:
     *                        [id, firstName, lastName, companyName,
     *                        houseNumber, street, apartment, city,
     *                        postCode, phone, email].
     *                        <p>
     *                        This constructor parses the input array and initializes the Customer
     *                        object with the respective fields.
     */
    public Customer(String[] customerFromCsv) {
        id = Integer.parseInt(customerFromCsv[0]);
        firstName = customerFromCsv[1];
        lastName = customerFromCsv[2];
        companyName = customerFromCsv[3];
        houseNumber = customerFromCsv[4];
        street = customerFromCsv[5];
        apartment = customerFromCsv[6];
        city = customerFromCsv[7];
        postCode = customerFromCsv[8];
        phone = customerFromCsv[9];
        email = customerFromCsv[10];
    }

    /**
     * Retrieves the full address of the customer, formatted as
     * "street houseNumber".
     *
     * @return a string representing the full address of the customer.
     */
    public String getAddress() {
        return street + " " + houseNumber;
    }
}
