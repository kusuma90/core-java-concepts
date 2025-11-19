package main.java.com.kusuma.oops.inheritance.realinhertexample;

public class Circle extends Shape{

    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI * radius * radius;
    }

    public void displayCircle(){
        System.out.println("This is circle with area: "+calculateArea());
    }

}
