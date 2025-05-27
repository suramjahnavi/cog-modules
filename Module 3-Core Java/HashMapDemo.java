import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Add entries
        System.out.println("Enter student ID and name (type 'done' to finish):");

        while (true) {
            System.out.print("Enter ID: ");
            String idInput = scanner.nextLine();
            if (idInput.equalsIgnoreCase("done")) break;

            int id;
            try {
                id = Integer.parseInt(idInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid ID. Try again.");
                continue;
            }

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            studentMap.put(id, name);
        }

        // Retrieve by ID
        System.out.print("Enter student ID to search: ");
        int searchId = scanner.nextInt();

        String studentName = studentMap.get(searchId);
        if (studentName != null) {
            System.out.println("Student Name: " + studentName);
        } else {
            System.out.println("No student found with that ID.");
        }

        scanner.close();
    }
}