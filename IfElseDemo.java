public class IfElseDemo {
    public static void main(String[] args) {
        // int x = 12;

        // if(x % 2 == 0) {
        //     System.out.println("Even Number...");
        // }
        // else {
        //     System.out.println("Odd Number...");
        // }

        int x = 12, y = 44, z = 45;

        if(x > y && x > z) {
            System.out.println("X is greatest...");
        }
        else if(y > x && y > z) {
            System.out.println("Y is greatest...");
        }
        else {
            System.out.println("Z is greatest...");
        }
    }
}
