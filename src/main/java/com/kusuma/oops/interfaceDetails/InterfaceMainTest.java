package main.java.com.kusuma.oops.interfaceDetails;

public class InterfaceMainTest {

    public static void main(String[] args){
        //InterfaceDetails interfaceDetails = new InterfaceDetails();  //'InterfaceDetails' is abstract; cannot be instantiated

        ArithmeticOps arithmeticOps = new ArithmeticOps();
        arithmeticOps.add(2,4);
        arithmeticOps.multiply(5);
        System.out.println(arithmeticOps.getValue());

    }
}
