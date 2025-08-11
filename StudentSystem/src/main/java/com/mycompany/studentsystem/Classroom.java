package com.mycompany.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Classroom {
    
    // List to store Student objects
    ArrayList<Student> students = new ArrayList<>();
   
    Scanner input = new Scanner(System.in);
    
    // List to store Student objects
    public void addStudent(){
        
        try{
           
        System.out.println("Enter the Student ID");
        String studentID = input.next();
        System.out.println("Enter the Student name");
        String studentName = input.next();
        System.out.println("Enter the Student age");
        int studentAge = input.nextInt();
        System.out.println("Enter the Student grade");
        int studentGrade = input.nextInt();
        students.add(new Student(studentID,studentName,studentAge,studentGrade));
        System.out.println("Student :" + students.get(students.size()-1).getID() + " added"); 
        }catch(NullPointerException e){// Handle null inputs by prompting again
            System.out.println("Error: Null input");
            addStudent();
        }catch(IllegalArgumentException e){// Handle invalid input formats by prompting again
            System.out.println("Error: Invalid input");
            addStudent();
        }
    }
    
    // Method to edit details of an existing student
    public void editStudent(){
        System.out.println("Enter the ID of the student");
        String studentID = input.next();
        for (int i = 0; i < students.size() ; i++) {
            if(studentID.equalsIgnoreCase( students.get(i).getID())){
                System.out.println(students.get(i));
                System.out.println("What do you want to edit?");
                while (true) {
            // Infinite loop to let user choose what to edit
                System.out.println("1. ID");
                System.out.println("2. Name");
                System.out.println("3. Age");
                System.out.println("4. Grade");
                System.out.print("Choose an option (1-4): ");
            
                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                       System.out.println("Enter the new ID");
                       String newID = input.next();
                       students.get(i).setID(newID);
                        System.out.println("New ID is set successfully");
                        break;
                    case 2:
                       System.out.println("Enter the new Name");
                       String newName = input.next();
                       students.get(i).setName(newName);
                        System.out.println("New name is set successfully");
                        break;
                    case 3:
                       System.out.println("Enter the new age");
                       int newAge = input.nextInt();
                       students.get(i).setAge(newAge);
                        System.out.println("New age is set successfully");
                        break;
                    case 4:
                       System.out.println("Enter the new grade");
                       int newGrade = input.nextInt();
                       students.get(i).setGrade(newGrade);
                        System.out.println("New grade is set successfully");
                        break;

                    default:
                        System.out.println("Invalid option. Try again.");
                    }
                break;
                }
                
            }else{
                System.out.println("ID is not found");
                break;
                }
        }
    }
     // Method to delete a student by ID
    public void deleteStudent(){
        System.out.println("Enter the ID of the student");
        String studentID = input.next();
        for (int i = 0; i < students.size() ; i++) {
            if(studentID.equalsIgnoreCase(students.get(i).getID())){
                students.remove(i);
                System.out.println(studentID + " is removed");
            }else{
               System.out.println("ID is not found");
            }
        }
    }    
    
    // Method to calculate and print average grade of all students
    public void calcAverage(){
        double av = 0;
        for (int i = 0; i < students.size() ; i++) {
            av += students.get(i).getGrade()/students.size();
        }
       
        System.out.println("The average =" + av);
    }
    
    // Method to display all students in the list
    public void displayStudents(){
        int j = 0;
        for (Student i : students){
            j++;
            System.out.println(j+ ". " + i);
        }
    }
}


