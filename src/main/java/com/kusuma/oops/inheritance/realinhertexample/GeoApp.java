package main.java.com.kusuma.oops.inheritance.realinhertexample;

public class GeoApp {

    public static  void main(String[] args){
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(5.0,10.0);

        circle.display();//inherited from shape
        circle.displayCircle();
        rectangle.display(); //inherited from shape
        rectangle.displayRectanle();
    }
}

/*
Out Put:
This is from parent shape - class
This is circle with area: 78.53981633974483
This is from parent shape - class
This is rectangle with ares: 50.0
 */