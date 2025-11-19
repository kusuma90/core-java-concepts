package main.java.com.kusuma.oops.interfaceDetails.interfacerealtimeExample;

public interface PaymentMethod {

    //we share method name and what params need to pass, hide internal implementation/method body to acheive abstraction
    boolean validateDetails();
    void processPayment(double amount);
}
