import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        System.out.println("Enter your name : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();   // will take input until we press Enter
        System.out.println("Hello : " + name);
        scanner.close();
    }
}
