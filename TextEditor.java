import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextEditor {
    public static void main(String[] args) {
        String fileName = "document.txt";

        try {
            // Writing content to file
            FileWriter writer = new FileWriter(fileName);

            writer.write("Welcome to Java File Handling.\n");
            writer.write("This content is written using FileWriter.\n");
            writer.write("The file is read using FileReader.");

            writer.close();

            System.out.println("Content written successfully.");

            // Reading content from file
            FileReader reader = new FileReader(fileName);

            int character;

            System.out.println("\nFile Content:");

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}