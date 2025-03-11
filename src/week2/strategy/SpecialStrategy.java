package week2.strategy;

public class SpecialStrategy implements TaxStrategy {
    private String name;
    private double rate;
    private String type;

    public SpecialStrategy(String name, double rate, String type) {
        this.name = name;
        this.rate = rate;
        this.type = type;
    }

    @Override
    public void calculateTax(int amount) {
        System.out.println("Special tax: " + amount * rate);
    }
}
