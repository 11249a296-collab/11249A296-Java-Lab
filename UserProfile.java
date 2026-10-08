import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class UserProfile {
    public static void main(String[] args) {
        String fileName = "userprofile.txt";

        try {
            // Writing data to file
            FileOutputStream fos = new FileOutputStream(fileName);

            String profile = "Name: Ramesh\n"
                           + "Age: 20\n"
                           + "Height: 175 cm\n"
                           + "Weight: 65 kg\n"
                           + "Fitness Goal: Build Muscle";

            fos.write(profile.getBytes());
            fos.close();

            System.out.println("Profile data written successfully.");

            // Reading data from file
            FileInputStream fis = new FileInputStream(fileName);

            int data;
            System.out.println("\nUser Profile:");

            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }

            fis.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}