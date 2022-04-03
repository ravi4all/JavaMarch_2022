package OOPS;

class StudentDetailsA {
    int rollno;
    String name;
    String course;
    String address;
    double fees;

    void showDetails() {
        System.out.println("Address of "+this.name + "," + this);
        System.out.println("Roll No is : "+this.rollno);
        System.out.println("Name is : "+this.name);
        System.out.println("Course is : "+this.course);
        System.out.println("Address is : "+this.address);
        System.out.println("Fees is : "+this.fees);
    }
}

public class StudentReportDry {
    public static void main(String[] args) {
        StudentDetailsA ram = new StudentDetailsA();
        ram.rollno = 101;
        ram.name = "Ram Sharma";
        ram.course = "Btech";
        ram.address = "Delhi";
        ram.fees = 4500.00;
        ram.showDetails();

        System.out.println("Address of Ram is :" + ram);

        StudentDetailsA shyam = new StudentDetailsA();
        shyam.rollno = 102;
        shyam.name = "Shyam Sharma";
        shyam.course = "Btech";
        shyam.address = "Delhi";
        shyam.fees = 5500.00;
        shyam.showDetails();

        System.out.println("Address of Shyam is :"+shyam);
    }
}
