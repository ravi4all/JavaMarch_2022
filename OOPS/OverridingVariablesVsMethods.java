package OOPS;

class A1 {
    int x = 12;
    int y = 15;
    void show() {
        System.out.println("Inside show method of A1 class...");
    }
}

class B1 extends A1 {
    int x = 20;
    @Override
    void show() {
        System.out.println("Inside show method of B1 class...");
    }
}

public class OverridingVariablesVsMethods {
    public static void main(String[] args) {
        B1 obj = new B1();
        obj.show();
        System.out.println("X is " + obj.x);
        System.out.println("Y is " + obj.y);
    }
}
