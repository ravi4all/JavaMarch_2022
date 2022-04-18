package OOPS;

class A2 {
    protected void show() {
        System.out.println("Show..");
    }

    public void disp() {
        System.out.println("Disp..");
    }
}

class B2 extends A2 {
    @Override
    protected void show() {
        System.out.println("Show...");
    }

    @Override
    public void disp() {
        System.out.println("Disp..");
    }
}

public class OverridingRules {
    public static void main(String[] args) {
        
    }
}
