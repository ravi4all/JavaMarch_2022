package OOPS;

abstract class Shape {
    abstract void calculateArea();
    abstract void show();
}

class Rectangle extends Shape {

    @Override
    void calculateArea() {
        System.out.println("Calculating Area...");
    }

    @Override
    void show() {
        System.out.println("Rectangle Show");
    }
    
}

class Square extends Shape {

    @Override
    void calculateArea() {
        // TODO Auto-generated method stub
        
    }

    @Override
    void show() {
        // TODO Auto-generated method stub
        
    }

}

public class AbstractDemo {
    
}
