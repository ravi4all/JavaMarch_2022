package ExceptionHandling;

class UserException extends Exception {
    double age[] = {20,21,34,50,18,19,16,22};
    public UserException(String str) {
        super(str);
    }
}

public class ExceptionDemo_3 {
    public static void main(String[] args) {
        UserException obj = new UserException("Not Eligible for Vote...");
        try {
            for(int i = 0; i < obj.age.length; i++) {
                if(obj.age[i] < 18) {
                    throw obj;
                }
                else {
                    System.out.println("Elgible :: " + obj.age[i]);
                }
            }
        }
        catch (UserException e) {
            // e.printStackTrace();
            System.out.println("Not Eligible for Vote...");
        }
    }
}
