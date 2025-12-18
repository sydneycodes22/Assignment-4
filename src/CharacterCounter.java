public class CharacterCounter {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Character Counter!");
        System.out.println("This program will count the characters, words, and lines in a user inputed file.\n");

        System.out.println("Let's begin! Please enter the file path:");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String filePath = scanner.nextLine();
        java.io.File file = new java.io.File(filePath);
        if (!file.exists()) {
            throw new java.io.FileNotFoundException("File not found: " + filePath);
        }
        java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(file));
        StringBuilder contentBuilder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            contentBuilder.append(line).append("\n");
        }
        String fileText = contentBuilder.toString();
        countCharacters(fileText);
        countWords(fileText);
        countLines(fileText);
        reader.close();
    }
    public static void countCharacters(String fileText) {
        int charCount = fileText.length();
        System.out.println("Total Characters: " + charCount);
    }
    public static void countWords(String fileText) {
        String[] words = fileText.trim().split("\\s+");
        int wordCount = words.length;
        System.out.println("Total Words: " + wordCount);
    }
    public static void countLines(String fileText) {
        String[] lines = fileText.split("\n");
        int lineCount = lines.length;
        System.out.println("Total Lines: " + lineCount);
    }
}
