package week2.strategy;

public class VATStrategy implements TaxStrategy {
    private String name;
    private double rate;
    private String country;

    public VATStrategy(String name, double rate, String country) {
        this.name = name;
        this.rate = rate;
        this.country = country;
    }

    @Override
    public void calculateTax(int amount) {
        System.out.println("VAT: " + amount * rate);
    }
}
