package OOPS;

public class StudentCaller {
    public static void main(String[] args) {
        // Student student_1 = new Student();   // will call default const
        // student_1.takeInput(101, "Ram", "BCA", "Delhi", 5600.00);
        // student_1.showDetails();

        // Student student_2 = new Student();   // will call default const
        // student_2.takeInput(102, "Shyam", "MCA", "Noida", 6700.00);
        // student_2.showDetails();

        Student student_1 = new Student(101, "Ram", "BCA", "Delhi", 5600.00);   // will call parameterized const
        student_1.showDetails();

        Student student_2 = new Student(102, "Shyam", "MCA", "Noida", 6700.00); // will call parameterized const
        student_2.showDetails();

    }
}
