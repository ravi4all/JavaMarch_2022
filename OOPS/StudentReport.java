package OOPS;

class StudentDetails {
    int rollno;
    String name;
    String course;
    String address;
    double fees;
}

public class StudentReport {
    public static void main(String[] args) {
        StudentDetails ram = new StudentDetails();

        ram.rollno = 101;
        ram.name = "Ram Sharma";
        ram.course = "Btech";
        ram.address = "Delhi";
        ram.fees = 4500.00;

        System.out.println("Roll No is : "+ram.rollno);
        System.out.println("Name is : "+ram.name);
        System.out.println("Course is : "+ram.course);
        System.out.println("Address is : "+ram.address);
        System.out.println("Fees is : "+ram.fees);

        
        StudentDetails shyam = new StudentDetails();

        shyam.rollno = 102;
        shyam.name = "Shyam Sharma";
        shyam.course = "Btech";
        shyam.address = "Delhi";
        shyam.fees = 5500.00;

        System.out.println("Roll No is : "+shyam.rollno);
        System.out.println("Name is : "+shyam.name);
        System.out.println("Course is : "+shyam.course);
        System.out.println("Address is : "+shyam.address);
        System.out.println("Fees is : "+shyam.fees);

    }
}
