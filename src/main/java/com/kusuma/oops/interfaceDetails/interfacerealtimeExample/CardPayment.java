package main.java.com.kusuma.oops.interfaceDetails.interfacerealtimeExample;

public class CardPayment implements PaymentMethod{

    private String cardNumber;

    public CardPayment(String cardNumber){
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean validateDetails() {
        System.out.println("Validating card details: "+cardNumber);
        return cardNumber.length()==16;   //for simple validation;
    }
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing card payment of "+amount+ " using card: "+cardNumber);
    }
}
