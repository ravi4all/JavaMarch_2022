import java.util.Scanner;

public class PrimeNumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter min number : ");
        int min = scanner.nextInt();

        System.out.println("Enter max number : ");
        int max = scanner.nextInt();

        boolean prime = false;
        for(int i = min; i <= max; i++) {
            int num = i;
            for(int j = 2; j < num; j++) {
                if(num % j == 0) {
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
        }

        scanner.close();

    }
}
