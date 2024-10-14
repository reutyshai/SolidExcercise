# E-Commerce Test Automation

This project automates testing for an e-commerce application. It validates functionalities such as product selection,
cart operations, and payment processes using JUnit and Selenium.

## Project Structure

### Classes

- **Product**: Represents a product with attributes for `productName`. It can be created from a web element
  representing the product.

- **Customer**: Represents a customer with attributes like `id`, `firstName`, `lastName`, `companyName`, `address`,
  `apartment`, `city`, `postCode`, `phone`, and `email`. It also provides methods to construct a customer from a CSV row
  and retrieve the address.

- **FilesPath**: An enum that defines file paths for application data and configuration files, such as customer data and
  XML configuration.

- **FormFieldFiller**: A utility class with a static method to fill form fields on web pages.

- **NavigationActions**: Provides methods for navigating through web elements, including clicking and submitting actions.

- **UniqueRandomList**: Generates a unique list of random integers within specified bounds, useful for selecting random
  products for testing.
- **CsvFileReader**: Provides functionality to read a specific row from a CSV file. It handles reading CSV files with a
  comma (',') as the delimiter. The readCsvRow method retrieves values from a specified row in the file.

- **XmlFileReader**: Provides functionality to read data from an XML file. It allows retrieval of the text content of a
  specified node by its name. The getData method retrieves the text content of the first occurrence of a specified node
  in the XML file.

### Components

- **NavBarElements**: Contains web elements related to the navigation bar, such as the link to the accessories page.

### Page Objects

- **AccessoriesCatalogPage**: Represents the accessories page, providing methods to get the page subject, the number of
  products, and create Product instances from web elements.

- **CartPage**: Represents the cart page, offering methods to retrieve products in the cart and their details, as well
  as the payment button.

- **PaymentPage**: Implements the `FormFillable` interface, providing a method to fill in payment details for a customer.

- **ProductDetailsPage**: Represents the product detail page, including elements for the add-to-cart button and product name.

### Browsers

- **ChromeBrowserDriver** and **FireFoxBrowserDriver**: Implement the `UniversalDriver` interface to manage WebDriver
  instances for Chrome and Firefox.

### Test Classes

- **PracticeTest**: Contains test cases for validating product selection and cart operations. It includes methods to set
  up the WebDriver, navigate through the application, and execute parameterized tests.
- **LoggerExtension**: A JUnit 5 extension that logs the results of test executions. It implements the TestWatcher
  interface and provides logging for test success, failure, abortion, and disabled tests using SLF4J.

## SOLID Principles Implementation

This project adheres to the SOLID principles to enhance maintainability, scalability, and readability of the code:

1. **Single Responsibility Principle (SRP)**:
    - Each class has a specific responsibility. For example, `Customer` is solely responsible for customer data
      management, while `FillFormField` handles filling forms. This separation allows for easier modifications and
      testing.

2. **Open/Closed Principle (OCP)**:
    - The use of interfaces, such as `UniversalDriver` and `Form`, allows for easy extension of functionality without
      modifying existing code. For instance, new browser drivers can be added without changing the core test logic.

3. **Liskov Substitution Principle (LSP)**:
    - Classes like `ChromeBrowserDriver` and `FireFoxBrowserDriver` can be used interchangeably wherever
      `UniversalDriver` is expected, ensuring that the application can work with different drivers seamlessly.

4. **Interface Segregation Principle (ISP)**:
    - Interfaces are designed to be specific to their contexts. The `Form` interface provides a clear contract for
      form-filling classes, ensuring that they only implement methods relevant to them.

5. **Dependency Inversion Principle (DIP)**:
    - High-level modules, such as `PracticeTest`, depend on abstractions (interfaces) rather than concrete
      implementations. This reduces coupling and increases flexibility in the testing framework.

## Usage

1. **Setup**: Ensure you have the required dependencies in your build tool (e.g., Maven, Gradle) for Selenium and JUnit.
2. **Configuration**: Update the configuration file (`config.xml`) with the appropriate URL and browser settings.
3. **Run Tests**: Execute the `PracticeTest` class to run all automated tests.

## Conclusion

This automation framework leverages the Page Object Model and follows best practices to ensure maintainable and scalable
test code. By utilizing JUnit for testing and Selenium for browser interaction, it provides a robust solution for
e-commerce application testing while adhering to SOLID principles.
