package PackagesDemo.com.bmpl.banking.customers;

public class Users {
    private String email;
    private String password;

    protected String name;
    protected int accNo;

    String acc_type = "Saving";

    public String bankname = "HDFC";

    public Users() {
        System.out.println("User object created...");
    }

    public static void main(String[] args) {
        
    }
}
