public class SwitchCase {
    public static void main(String[] args) {
        int x = 10;
        switch(x) {
            case 2:
                System.out.println("Number is 2...");
                break;
            case 4:
                System.out.println("Number is 4...");
                break;
            case 6:
                System.out.println("Number is 6...");
                break;
            case 8:
                System.out.println("Number is 8...");
                break;
            case 10:
                System.out.println("Number is 10...");
                break;

            default:
                System.out.println("Number not found...");
                break;
        }
    }
}
