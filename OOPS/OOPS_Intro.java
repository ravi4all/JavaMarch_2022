package OOPS;

public class OOPS_Intro {
    int x = 120;
    int y = 2;

    void add() {
        int z = x + y;
        System.out.println("Sum is "+z);
    }

    void sub() {
        int z = x - y;
        System.out.println("Sub is "+z);
    }

    public static void main(String[] args) {
        
        OOPS_Intro obj = new OOPS_Intro();
        obj.add();
        obj.sub();
    }
}
