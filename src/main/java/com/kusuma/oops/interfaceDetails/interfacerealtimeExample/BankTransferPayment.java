package main.java.com.kusuma.oops.interfaceDetails.interfacerealtimeExample;

public class BankTransferPayment implements PaymentMethod{

    private String accountNumber;


    public BankTransferPayment(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public boolean validateDetails() {
        System.out.println("Validating Bank account details: "+accountNumber);
        return accountNumber.length()==10;   //for simple validation;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing bank account payment of "+amount+ " using account: "+accountNumber);
    }
}
