package com.mycompany.anton;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Home task 3, Variant 3, Group RIBO-03-21, Student Pogosyan A.S.");
        System.out.print("Choose task [1,2]: ");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                task1(scanner);
                break;
            case 2:
                task2(scanner);
                break;
        }
    }

    public static void task1(Scanner scanner) {
        while (true) {
            System.out.print("Write salary: ");
            int salary = scanner.nextInt();
            System.out.print("Write your seniority: ");
            int seniority = scanner.nextInt();
            System.out.print("Write your name: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.println("1 - Doctor");
            System.out.println("2 - Nurse");
            System.out.println("3 - Surgeon");
            System.out.print("Select desired class (0 to exit) [1,2,3]: ");
            Doctor doctor;
            switch (scanner.nextInt()) {
                case 1:
                    doctor = new Doctor(salary, seniority, name);
                    break;

                case 2:
                    doctor = new Nurse(salary, seniority, name);
                    break;

                case 3:
                    doctor = new Surgeon(salary, seniority, name);
                    break;

                case 0:
                    return;

                default:
                    continue;
            }
            System.out.println(doctor + "\n");
        }
    }

    public static void task2(Scanner scanner) {
        System.out.print("Write the recipe: ");
        scanner.nextLine();
        String recipe = scanner.nextLine();

        Doctor doctor = new Doctor(7500, 4, "Walter White");
        doctor.writeRecipe(recipe);

        Nurse nurse = new Nurse(4000, 1, "Starr Janet");
        nurse.writeRecipe(recipe);

        Surgeon surgeon = new Surgeon(6000, 2, "Sergey Pogosyan");
        surgeon.writeRecipe(recipe);
    }
}
