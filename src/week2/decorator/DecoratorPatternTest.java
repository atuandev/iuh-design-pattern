package week2.decorator;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        Payment creditPayment = new CreditPayment(new BasicPayment());
        creditPayment.pay();

        Payment paypalPayment = new PaypalPayment(new BasicPayment());
        paypalPayment.pay();

    }
}
