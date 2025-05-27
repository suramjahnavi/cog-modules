import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to write to file: ");
        String input = scanner.nextLine();

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(input);
            System.out.println("Data written to output.txt successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}