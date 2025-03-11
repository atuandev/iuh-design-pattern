package week2.state;

public class OrderStateTest {
    public static void main(String[] args) {
        OrderContext context = new OrderContext();

        State orderCreationState = new OrderCreationState();
        context.setState(orderCreationState);
        context.doAction();

        State orderProcessingState = new OrderProcessingState();
        context.setState(orderProcessingState);
        context.doAction();

        State orderDeliveringState = new OrderDeliverState();
        context.setState(orderDeliveringState);
        context.doAction();

        State orderCancelState = new OrderCancelState();
        context.setState(orderCancelState);
        context.doAction();
    }
}
