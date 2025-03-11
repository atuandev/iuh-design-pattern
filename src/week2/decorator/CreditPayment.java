package week2.decorator;

public class CreditPayment extends PaymentDecorator {
    public CreditPayment(Payment payment) {
        super(payment);
    }

    @Override
    public void pay() {
        super.pay();
        System.out.println("Thanh toan bang the tin dung");
    }
}
