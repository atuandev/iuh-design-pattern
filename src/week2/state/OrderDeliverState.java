package week2.state;

public class OrderDeliverState implements State {
    @Override
    public void doAction() {
        System.out.println("Don hang da duoc giao");
    }
}
