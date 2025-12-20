
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionHandler {
    public static void main(String[] args) {
        // Introduce user to the program
        System.out.println("Welcome to the Exception Handler Program!");
        System.out.println("This program will read values from a file and handle exceptions appropriately.\n");

        System.out.println("Let's Begin! Please provide a path to the input file.");

        // Try-catch block to handle file reading and exceptions
        try {
            Scanner userInput = new Scanner(System.in);
            String filePath = userInput.nextLine();
            Scanner fileScanner = new Scanner(new File(filePath));
            // Read integers from the file and handle exceptions
            try {
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    // Attempt to parse the integer and handle format exceptions
                    try {
                        int value = Integer.parseInt(line);
                        // Successfully read an integer
                        System.out.println("Read integer: " + value);
                    } catch (NumberFormatException e) {
                        // Rethrow with a custom message
                        throw new NumberFormatException("Invalid integer format: " + line);
                    }
                }
                // Close scanners
                userInput.close();
                fileScanner.close();
            } catch (NoSuchElementException e) {
                // Rethrow with a custom message
                throw new NoSuchElementException("The file is empty or does not contain an integer.");
            }
        } catch (FileNotFoundException e) {
            // Rethrow with a custom message
            throw new RuntimeException("File not found: " + e.getMessage());
        }
    }
}
