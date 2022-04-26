package OOPS;

class NormalUser {
    int deliveryCharges = 100;
    int deliveryTime = 5;
}

class PrimeUser extends NormalUser{
    int deliveryCharges = 0;
    int deliveryTime = 1;
}

class AmazonNormalUsers {
    NormalUser show() {
        NormalUser user = new NormalUser();
        return user;
    }
}

class AmazonPrimeUsers extends AmazonNormalUsers {
    @Override
    PrimeUser show() {
        PrimeUser user = new PrimeUser();
        return user;
    }
}

public class CovariantReturnType {
    public static void main(String[] args) {
        
    }
}
