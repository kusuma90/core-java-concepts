package main.java.com.kusuma.oops.inheritance.realinhertexample;

public class Rectangle extends Shape{
    double width;
    double height;

    public Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }

    @Override
    public double calculateArea(){
        return width * height;
    }

    public void displayRectanle(){
        System.out.println("This is rectangle with ares: "+calculateArea());
    }
}
