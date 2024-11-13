package com.paymentprocessing.paymentsystem_processing;

public class CreditCardPayment extends Payment implements MyCard {
	 
    private String cardNumber;
 
    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }
 
    @Override
    public void processPayment() {
        validateCard();
        chargeCard();
        System.out.println("Credit Card Payment Processed: " + getAmount());
    }
 

    public void validateCard() {
        System.out.println("Validating credit card " + cardNumber);
    }
 
  
    public void chargeCard() {
        System.out.println("Charging credit card " + cardNumber + " with amount " + getAmount());
    }
}
