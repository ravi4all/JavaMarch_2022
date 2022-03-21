import java.util.Scanner;

public class TakingInputDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your ID : ");
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        // char e = name.charAt(0);
        // String firstchar = String.valueOf(e);
        // firstchar = firstchar.toUpperCase();
        // name = firstchar + name.substring(1).toLowerCase();

        // name = String.valueOf(name.charAt(0)).toUpperCase() + name.substring(1).toLowerCase();

        String names[] = name.split(" ");

        System.out.println("Enter your age : ");
        int age = scanner.nextInt();

        System.out.println("Enter 12th Percentage : ");
        float marks = scanner.nextFloat();

        System.out.println("Enter your salary : ");
        double salary = scanner.nextDouble();

        System.out.println("Emp ID : " + id);
        System.out.println("Hello : " + name);
        System.out.println("Marks : " + marks);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);

        scanner.close();
    }
}
