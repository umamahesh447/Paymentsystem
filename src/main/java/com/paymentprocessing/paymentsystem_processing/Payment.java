package com.paymentprocessing.paymentsystem_processing;

public abstract class Payment {
    protected double amount;
 
    public Payment(double amount) {
        this.amount = amount;
    }
 
    public double getAmount() {
        return amount;
    }
 
    public abstract void processPayment();  
}