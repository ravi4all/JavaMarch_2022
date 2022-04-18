package PackagesDemo.com.bmpl.banking.cards;

import PackagesDemo.com.bmpl.banking.customers.Users;

public class CreditCardCustomers extends Users {
    void show() {
        // Users obj = new Users();
        // System.out.println(obj.acc_type);
        // System.out.println(acc_type);

        // we can access only protected members of Users class
        System.out.println(name + "," + accNo);
    }
}
