import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
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
        String fullName = "";

        for(String n : names) {
            name = String.valueOf(n.charAt(0)).toUpperCase() + n.substring(1).toLowerCase();
            fullName += name + " ";
        }

        System.out.println("Enter your age : ");
        int age = scanner.nextInt();

        System.out.println("Enter 12th Percentage : ");
        float marks = scanner.nextFloat();

        System.out.println("Enter your salary : ");
        double salary = scanner.nextDouble();

        Locale locale = new Locale("hi", "IN");
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        String formatSalary = nf.format(salary);

        Date date = new Date();
        System.out.println("Orignal Date : " + date);

        // DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, locale);
        // DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, locale);
        // DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
        // DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, locale);
        DateFormat df = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        String formattedDate = df.format(date);
        System.out.println("Formatted Date : " + formattedDate);

        System.out.println("Emp ID : " + id);
        System.out.println("Hello : " + fullName);
        System.out.println("Marks : " + marks);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + formatSalary);

        scanner.close();
    }
}
