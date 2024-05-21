package com.malkinfo.rentalapp;

// Interface for Payment Role
interface PaymentRole {
    String processPayment(double amount);
}

// Concrete Player 1: Credit Card Processor
class CreditCardProcessor implements PaymentRole {
    @Override
    public String processPayment(double amount) {
        return "Processing payment with credit card: $" + amount;
        // Credit card processing logic
    }
}

// Concrete Player 2: Mobile Banking Processor
class MobileBankingProcessor implements PaymentRole {
    @Override
    public String processPayment(double amount) {
        return "Processing payment with mobile banking: $" + amount;
        // Mobile banking processing logic
    }
}

// Context class where players can dynamically play roles
class PaymentSystem {
    private PaymentRole paymentRole;

    public PaymentSystem(){
        this.paymentRole = paymentRole;
    }

    public void setPaymentRole(PaymentRole paymentRole) {
        this.paymentRole = paymentRole;
    }

    public String processPayment(double amount) {
        if (paymentRole != null) {
            return paymentRole.processPayment(amount);
        }
        return "No payment method selected";
    }
}
