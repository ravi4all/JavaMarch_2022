package OOPS;

// final class Parent {

// }

class Parent {
    final void show() {
        System.out.println("Show...");
    }
}

class Child extends Parent {
    // @Override
    // void show() {
    //     System.out.println("Show overrided...");
    // }
}

public class FinalUse {
    public static void main(String[] args) {
        final double PI = 3.14;
        // PI++;
        // Math.PI
    }
}
