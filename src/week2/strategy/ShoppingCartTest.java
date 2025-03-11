package week2.strategy;

public class ShoppingCartTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.pay(new VATStrategy("VAT", 0.1, "Vietnam"));
        cart.pay(new ConsumptionTaxStrategy("Sales Tax", 0.10));
        cart.pay(new SpecialStrategy("Special Tax", 0.05, "Luxury"));
    }
}
