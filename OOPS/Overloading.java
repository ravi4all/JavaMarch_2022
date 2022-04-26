package OOPS;

public class Overloading {
    void show(int x) {
        System.out.println("Int Show Called...");
    }

    void show(float x, int y) {
        System.out.println("Float and Int Show Called...");
    }

    void show(Integer x, int y, float z) {
        System.out.println("Integer, Int and Float Show Called...");
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.show(12.5f, 56);
    }
}
