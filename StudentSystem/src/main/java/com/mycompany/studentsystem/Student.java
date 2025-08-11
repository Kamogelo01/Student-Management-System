package com.mycompany.studentsystem;

public class Student {
    
    // Private fields to store student details
    private String ID;
    private String name;
    private int age;
    private double grade;
    
    // Default constructor that sets default values
    Student(){
    this("000","Unknown",0,0.0);
    }
   
    // Parameterized constructor to initialize student object with given values
    Student(String ID,String name,int age,double grade){
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    
    //Getter And Setters of my private fields
    
    public void setID(String ID){
        this.ID = ID;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setGrade(double grade){
        this.grade = grade;
    }
    
    public String getID(){
        return this.ID;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public double getGrade(){
        return this.grade;
    }
    
    // Overriding toString method to return student details as a formatted string
    @Override
    public String toString(){
        return "Student{ID : " + getID() + ", Name : " + getName() + ", Age : " + getAge() + ", Grade : " + getGrade() + "}";
    }
}

