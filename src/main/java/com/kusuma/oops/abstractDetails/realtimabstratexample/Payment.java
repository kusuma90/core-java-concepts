package main.java.com.kusuma.oops.abstractDetails.realtimabstratexample;

public abstract class Payment {

    //Abstract method to process the payment, implementation varies by payment type
    public abstract void processPayment(double amount);

    //Concrete method that applies to all payment types.
    public void displayReceipt(double amount){
        System.out.println("Receipt for payment of: $"+amount);
    }
}
