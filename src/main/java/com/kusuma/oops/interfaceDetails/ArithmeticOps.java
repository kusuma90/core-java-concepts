package main.java.com.kusuma.oops.interfaceDetails;

public class ArithmeticOps implements InterfaceDetails, InterfaceDetails2{

    @Override
    public void add(int a, int b) {
        System.out.println("Sum is: "+(a+b));
    }

    @Override
    public void multiply(int a) {
       System.out.println("Multiplication is: "+(a*a));
    }

    @Override
    public String getValue(){
     return "processed data";
    }

}
