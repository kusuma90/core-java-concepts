package main.java.com.kusuma.oops.polymorphisim.realpolyexample;

public abstract class PaymentProcessor {

    public static void main(String[] args) {
        Payment applePayment = new CreditCardPayment();
        applePayment.displayReceipt(1000);
        applePayment.processPayment(1000);

        Payment creditCardPayment = new CreditCardPayment();
        creditCardPayment.displayReceipt(1200);
        creditCardPayment.processPayment(1200);

        Payment debitCardPayment = new DebitCardPayment();
        debitCardPayment.displayReceipt(2000);
        debitCardPayment.processPayment(2000);

        Payment payPalPayment = new PayPalPayment();
        payPalPayment.displayReceipt(2000);
        payPalPayment.processPayment(2000);



    }

    public abstract void processPayment(double amount);
}
