import java.io.IOException;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) throws IOException {
        // System.out.println("Enter your name : ");
        // int x = System.in.read();
        // System.out.println(x);
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first num : ");
        int x = scanner.nextInt();
        
        System.out.print("Enter second num : ");
        int y = scanner.nextInt();
        int z = x + y;
        System.out.println("Sum is : "+z);
        scanner.close();
    }
}
