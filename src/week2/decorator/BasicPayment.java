package week2.decorator;

public class BasicPayment implements Payment {
    @Override
    public void pay() {
        System.out.print("Thanh toan co ban. ");
    }
}
