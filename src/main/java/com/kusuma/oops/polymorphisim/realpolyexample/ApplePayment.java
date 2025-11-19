package main.java.com.kusuma.oops.polymorphisim.realpolyexample;

public class ApplePayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing apple payment of: $"+amount);
    }
}
