package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first number : ");
            int fnum = scanner.nextInt();
    
            System.out.print("Enter second number : ");
            int snum = scanner.nextInt();
    
            int add = fnum + snum;
            System.out.println("Addition is :: " + add);

            int sub = fnum - snum;
            System.out.println("Subtraction is :: " + sub);

            int div = fnum / snum;
            System.out.println("Division is :: " + div);

            int mul = fnum * snum;
            System.out.println("Multiplication is :: " + mul);
    
            scanner.close();
        }

        catch(InputMismatchException e) {
            System.out.println("Invalid Input...Please Enter a Valid Number");
        }

        catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero...");
        }

        catch(Exception e) {
            System.out.println("Some other error...Please contact admin");
        }

    }
}
