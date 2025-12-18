public class CharacterCounter {
    public static void main(String[] args) throws Exception {
        // Introduction to program
        System.out.println("Welcome to Character Counter!");
        System.out.println("This program will count the characters, words, and lines in a user inputed file.\n");

        // Prompt user for file path
        System.out.println("Let's begin! Please enter the file path:");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String filePath = scanner.nextLine();
        java.io.File file = new java.io.File(filePath);

        // If file does not exist, throw exception
        if (!file.exists() || !file.isFile()) {
            throw new java.io.FileNotFoundException("File not found: " + filePath);
        }

        try { // Utilizing try-catch block to handle potential exceptions and memory management
            // Read file content
            java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(file));

            // Read entire file content into a single string
            StringBuilder contentBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                contentBuilder.append(line).append("\n");
            }

            // Translate StringBuilder to String
            String fileText = contentBuilder.toString();

            // Count characters, words, and lines
            countCharacters(fileText);
            countWords(fileText);
            countLines(fileText);
        }
        catch (Exception e) {
            // Throw and error message if exception occurs
            throw new RuntimeException("An error occurred while reading the file: " + e.getMessage());
        }
    }
    public static void countCharacters(String fileText) {
        String[] words = fileText.trim().split("\\s+"); // Stripping whitespace
        int charCount = 0;
        for (String word : words) {
            charCount += word.length(); // Counting characters in each word
        }
        System.out.println("Total Characters: " + charCount); // Total of all charcaters is 89 subtracting spaces and new lines
    }
    public static void countWords(String fileText) {
        String[] words = fileText.trim().split("\\s+"); // Stripping whitespace
        int wordCount = words.length; // Accessing length of words array
        System.out.println("Total Words: " + wordCount); // Total of all words is 22
    }
    public static void countLines(String fileText) {
        String[] lines = fileText.split("\n"); // Splitting by newline character
        int lineCount = lines.length; // Accessing length of lines array
        System.out.println("Total Lines: " + lineCount); // Total of all lines is 4
    }
}
