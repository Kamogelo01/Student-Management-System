package com.mycompany.studentsystem;

import java.util.Scanner;

public class StudentSystem {

    public static void main(String[] args) {
        
        System.out.println("Welcome to the Library System!");
        Classroom cr = new Classroom();
        Scanner input = new Scanner(System.in);
        while (true) {
            
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. Display students");
            System.out.println("4. Show average");
            System.out.println("5. Edit student");
            System.out.println("6. Exit");
            System.out.print("Choose an option (1-5): ");
            
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    cr.addStudent();
                    break;
                case 2:
                   cr.deleteStudent();
                    break;
                case 3:
                    cr.displayStudents();
                    break;
                case 4:
                   cr.calcAverage();
                    break; 
                case 5:
                   cr.editStudent();
                    break; 
                case 6:
                    
                    System.out.println("Goodbye!");
                   System.exit(0);
                    
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
