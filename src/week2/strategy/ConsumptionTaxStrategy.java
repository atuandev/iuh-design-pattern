package week2.strategy;

public class ConsumptionTaxStrategy implements TaxStrategy {
    private String name;
    private double rate;

    public ConsumptionTaxStrategy(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    @Override
    public void calculateTax(int amount) {
        System.out.println("Consumption tax: " + amount * rate);
    }
}
