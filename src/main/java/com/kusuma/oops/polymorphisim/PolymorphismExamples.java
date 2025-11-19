package main.java.com.kusuma.oops.polymorphisim;


//An object can behave in various forms/ways.
//2tyeps: Compiletime(static binding)/Method over loading; Runtime(Dynamic binding)/method overriding
public class PolymorphismExamples {

    //1. Method Over loading / compile time / static binding

    //the 3 methods have same method name but differentiating with either no.of parameters or data type of parameters.
    //Based on you provide params data, the method would be invoked.
    public void add(int a, int b){
        System.out.println("sum of a and b is : "+(a+b));
    }
    public void add(int a, int b, int c){
        System.out.println("sum of a,b and c is : "+(a+b+c));
    }
    public void add(double a, double b){
        System.out.println("sum of a and b is : "+(a+b));
    }

}
