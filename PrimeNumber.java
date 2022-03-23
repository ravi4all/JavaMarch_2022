import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();
        boolean prime = false;
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                prime = false;
                break;
            }
            else {
                prime = true;
            }
        }
        if(prime) {
            System.out.println(num + " is a Prime Number");
        }
        else {
            System.out.println(num + " is not a Prime Number");
        }

        scanner.close();

    }
}
