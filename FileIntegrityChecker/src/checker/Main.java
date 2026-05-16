package checker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        IntegrityManager manager = new IntegrityManager();

        boolean running = true;

        while (running) {
            System.out.println("\n===== File Integrity Checker =====");
            System.out.println("1. Register a file");
            System.out.println("2. Check file integrity");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter file path: ");
                String filePath = scanner.nextLine();

                manager.registerFile(filePath);

            } else if (choice == 2) {
                System.out.print("Enter file path: ");
                String filePath = scanner.nextLine();

                manager.checkFileIntegrity(filePath);

            } else if (choice == 3) {
                running = false;
                System.out.println("Program terminated.");

            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}