package main.java.com.kusuma.oops.polymorphisim.realpolyexample;

public class Payment {

    //Abstract method to process the payment, implementation varies by payment type
    public void processPayment(double amount){
        System.out.println("Processing of generic payment of $"+amount);
    }

    //Concrete method that applies to all payment types.
    public void displayReceipt(double amount){
        System.out.println("Receipt for payment of: $"+amount);
    }
}
