package OOPS;

import java.util.Date;

class Account {
    int accNo;
    double balance;
    String userName;
    void openAccount() {
        Date date = new Date();
        System.out.println("Account was opened on : " + date);
    }

    void deposit(){
        System.out.println("Deposit limit by default is 50000...");
    }

    void withdraw() {
        System.out.println("Withdraw limit by default is 100000...");
    }
}

class SavingAccount extends Account {
    void computeROI() {
        System.out.println("Saving Account ROI is 6%...");
    }
    
    @Override
    void withdraw() {
        System.out.println("Withdraw limit for saving account is 80000...");
    }
}

class CurrentAccount extends Account {
    void computeOD() {
        System.out.println("OD Limit is 1 Lakh..");
    }

    @Override
    void deposit() {
        System.out.println("Deposit limit for current account is 100000");
    }
}

public class ISA_Demo {

    void caller(Account account) {
        account.openAccount();
        account.deposit();
        account.withdraw();
        if(account instanceof SavingAccount) {
            SavingAccount sa = (SavingAccount) account;     // Downcasting
            sa.computeROI();
        }
        else if(account instanceof CurrentAccount) {
            CurrentAccount ca = (CurrentAccount) account;   // Downcasting
            ca.computeOD();
        }
    }

    public static void main(String[] args) {

        ISA_Demo obj = new ISA_Demo();
        obj.caller(new SavingAccount());
        obj.caller(new CurrentAccount());

        // SavingAccount sa = new SavingAccount();
        // sa.openAccount();
        // sa.withdraw();
        // sa.deposit();
        // sa.computeROI();

        // System.out.println("======================");

        // CurrentAccount ca = new CurrentAccount();
        // ca.openAccount();
        // ca.withdraw();
        // ca.deposit();
        // ca.computeOD();

        // Account acc = new SavingAccount();   // Upcasting
        // acc.openAccount();
        // acc.withdraw();
        // acc.deposit();
        // acc.computeROI();

        // System.out.println("======================");

        // acc = new CurrentAccount();
        // acc.openAccount();
        // acc.withdraw();
        // acc.deposit();
        // acc.computeOD();

    }
}
