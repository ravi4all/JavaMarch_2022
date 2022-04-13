package OOPS;

class A {
    A() {
        System.out.println("A Default Const called...");
    }
    A(int x) {
        this();     // will call it's own default constructor
        System.out.println("A Parameterized Const called...");
    }
}

class B extends A {
    B() {
        // super();    // calling parent class default constructor, it is written internally
        super(5);   // will call parent's parameterized constructor
        System.out.println("B Default Const called...");
    }
    B(int x, int y) {
        // super(4);   // calling parent class parameterized constructor
        this();     // will call it's own default constructor
        System.out.println("B Parameterized Const called...");
    }
}

public class SuperVsThis {
    public static void main(String[] args) {
        // B obj = new B();
        B obj = new B(12,2);
    }
}
