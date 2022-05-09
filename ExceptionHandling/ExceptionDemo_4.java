package ExceptionHandling;

public class ExceptionDemo_4 {

    // DAO - Data Access Object
    void dao(int x, int y) throws ArithmeticException {
        int z = x / y;
        System.out.println("Output is :: " + z);
    }

    void helper(int x, int y) throws ArithmeticException {
        // Handle the request and response
        dao(x, y);
    }

    void view(int x, int y) {
        // UI
        try {
            helper(x, y);
        }
        catch(ArithmeticException e) {
            System.out.println("Some Error...");
        }
    }

    public static void main(String[] args) {
        ExceptionDemo_4 obj = new ExceptionDemo_4();
        int x = 12;
        int y = 0;
        obj.view(x, y);
    }
}
