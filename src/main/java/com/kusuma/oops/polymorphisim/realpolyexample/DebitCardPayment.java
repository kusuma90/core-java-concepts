package main.java.com.kusuma.oops.polymorphisim.realpolyexample;

public class DebitCardPayment extends Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing debit card payment of: $"+amount);
    }
}
