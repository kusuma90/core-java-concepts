package main.java.com.kusuma.oops.interfaceDetails.interfacerealtimeExample;

public class PaymentProcessor {

    void conductTransaction(PaymentMethod method,double amount){
        if(method.validateDetails()){
            method.processPayment(amount);
        }else{
            System.out.println("Invalid payment details provided.");
        }
    }

    public static  void main(String args[]){

        PaymentProcessor processor = new PaymentProcessor();

        CardPayment cardPayment = new CardPayment("123467890123456");
        processor.conductTransaction(cardPayment,1000.80);

        BankTransferPayment bankTransferPayment = new BankTransferPayment("1234567890");
        processor.conductTransaction(bankTransferPayment,180.0);

    }
}
