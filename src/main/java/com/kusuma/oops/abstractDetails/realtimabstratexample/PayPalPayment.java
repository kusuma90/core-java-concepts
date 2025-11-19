package main.java.com.kusuma.oops.abstractDetails.realtimabstratexample;

public class PayPalPayment extends Payment{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment: $"+amount);
    }
}
