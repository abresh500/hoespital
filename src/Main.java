import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HOSPITAL hospital = new HOSPITAL();
        Scanner scanner = new Scanner(System.in);

        hospital.addPerson(new Doctor("Dr. Abrham", "Nebiyu", 21, "Hormonal Analysis", "2 years"));
        hospital.addPerson(new Doctor("Dr. Merwan", "Jemal", 20, "brain  specialist", "4 years"));

        System.out.println("=== HOSPITAL MANAGEMENT SYSTEM ===\n");

        boolean running = true;
        while (running)
        {
            System.out.println("1. Add Patient");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("ስም: ");
                String pFirstName = scanner.nextLine();
                System.out.print("የአባት ስም: ");
                String pLastName = scanner.nextLine();
                System.out.print("edme: ");
                int pAge = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Diagnosis: ");
                String diagnosis = scanner.nextLine();
                int roomNumber = 0;
                hospital.addPerson(new Patient(pFirstName, pLastName, pAge, diagnosis, roomNumber), true);
                System.out.println("Patient added!\n");
            } else if (choice == 2) {
                System.out.println("\n All People in Hospital");
                hospital.displayAll();

            } else if (choice == 3) {
                System.out.println("chaww thanks for visiting dude!");
                running = false;

            } else {
                System.out.println("mn arg new metlew koy.\n");
            }
        }

        scanner.close();
    }
}