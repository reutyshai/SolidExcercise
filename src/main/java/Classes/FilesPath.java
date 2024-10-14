package Classes;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * The FilesPath enum defines the paths to various resource files used in the application.
 * This enum provides a centralized location for managing file paths for easy access and modification.
 */
@AllArgsConstructor
@Getter
public enum FilesPath {
    /**
     * The path to the customers CSV file.
     */
    DATA("src/main/resources/customers.csv"),

    /**
     * The path to the configuration XML file.
     */
    CONFIG("src/main/resources/config.xml");

    private final String path; // The file path as a string
}
