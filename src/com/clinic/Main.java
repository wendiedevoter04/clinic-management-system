package com.clinic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PatientService service = new PatientService();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== CLINIC SYSTEM MENU =====");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Search Patient");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();

            if (choice == 1) {

                System.out.print("Enter ID: ");
                int id = scanner.nextInt();

                scanner.nextLine();

                System.out.print("Enter Name: ");
                String name = scanner.nextLine();

                System.out.print("Enter Age: ");
                int age = scanner.nextInt();

                scanner.nextLine();

                System.out.print("Enter Illness: ");
                String illness = scanner.nextLine();

                Patient patient = new Patient(id, name, age, illness);
                service.addPatient(patient);

            } else if (choice == 2) {

                service.viewPatients();

            } else if (choice == 3) {

                System.out.print("Enter Patient ID to search: ");
                int id = scanner.nextInt();

                service.searchPatientById(id);

            } else if (choice == 4) {

                System.out.println("Exiting system...");
                break;

            } else {
                System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}