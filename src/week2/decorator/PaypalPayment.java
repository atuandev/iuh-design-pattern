package week2.decorator;

public class PaypalPayment extends PaymentDecorator {
    public PaypalPayment(Payment payment) {
        super(payment);
    }

    @Override
    public void pay() {
        super.pay();
        System.out.println("Paypal payment");
    }
}
