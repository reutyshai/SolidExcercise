package Utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * The CsvReader class provides functionality to read a specific row from a CSV file.
 * This class is designed to handle reading CSV files with a comma (',') as the delimiter.
 */
public class CsvFileReader {
    /**
     * Reads a specific row from a CSV file.
     *
     * @param filePath the path to the CSV file to be read.
     * @param rowIndex the index of the row to read (0-based).
     * @return an array of strings representing the values in the specified row,
     * or null if the row does not exist or an error occurs during reading.
     * <p>
     * This method reads the file line by line until it reaches the specified row index.
     * If the row exists, it splits the row by commas and returns the resulting array.
     * If an I/O error occurs or the specified row does not exist, it returns null.
     */
    public static String[] readCsvRow(String filePath, int rowIndex) {
        String line;
        int currentIndex = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                if (currentIndex == rowIndex) {
                    return line.split(","); // מניח שהמפריד הוא פסיק
                }
                currentIndex++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
