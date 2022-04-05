// SRP - Single Reponsibility Principle
// Encapsulation - wrapping of variables and methods in class
// Data Abstraction - make variables private;
// Good Encapsulation - Data Hiding + Encapsulation

package OOPS;

import java.util.Scanner;

public class Student {
    private int rollno;
    private String name;
    private String course;
    private String address;
    private double fees;
    private String collegeName;
    Scanner scanner = new Scanner(System.in);

    // Default Constructor
    // to initialize variables we use constructor
    public Student() {
        System.out.println("Object Created...");
        this.collegeName = "DU";
    }

    // Parameterized Constructor
    public Student(int rollno, String name, String course, String address, double fees) {
        this();     // will call default constructor - constructor chaining
        this.rollno = rollno;
        this.name = name;
        this.course = course;
        this.address = address;
        this.fees = fees;
    }

    // void takeInput(int rollno, String name, String course, String address, double fees) {
    //     this.rollno = rollno;
    //     this.name = name;
    //     this.course = course;
    //     this.address = address;
    //     this.fees = fees;
    // }

    // void takeInput() {
    //     System.out.print("Enter Roll No : ");
    //     rollno = scanner.nextInt();
    //     scanner.nextLine();
    //     System.out.print("Enter Name : ");
    //     name = scanner.nextLine();

    //     System.out.print("Enter Course : ");
    //     course = scanner.nextLine();

    //     System.out.print("Enter Address : ");
    //     address = scanner.nextLine();
        
    //     System.out.print("Enter Fees : ");
    //     fees = scanner.nextDouble();
        
    // }

    void showDetails() {
        // System.out.println("Address of "+this.name + "," + this);
        System.out.println("Welcome to : " + this.collegeName);
        System.out.println("Roll No is : "+this.rollno);
        System.out.println("Name is : "+this.name);
        System.out.println("Course is : "+this.course);
        System.out.println("Address is : "+this.address);
        System.out.println("Fees is : "+this.fees);
    }
}
