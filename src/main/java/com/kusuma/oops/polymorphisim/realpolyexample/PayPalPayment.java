package main.java.com.kusuma.oops.polymorphisim.realpolyexample;

public class PayPalPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment: $"+amount);
    }
}
