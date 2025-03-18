package week3.observer;

public class StockSubscriber implements Observer {
    private String name;
    private Subject stock;

    public StockSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        Double price = (Double) stock.getUpdate(this);
        if (price == null) {
            System.out.println(name + ":: No new price update");
        } else {
            System.out.println(name + ":: Received price update: " + price);
        }
    }

    @Override
    public void setSubject(Subject sub) {
        this.stock = sub;
    }
}
