package main.java.com.kusuma.oops.polymorphisim;

public class RuntimePolyExample extends PolymorphismExamples{

    // sub class and parent class have same method signature.

    public void add(int a, int b){
        System.out.println("Addition  of a and b is : "+(a+b));
    }

    public void add(double a, double b){
        System.out.println("Addition of a and b is : "+(a+b));
    }
}
