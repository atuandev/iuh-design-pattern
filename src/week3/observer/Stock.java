package week3.observer;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject {
    private List<Observer> observers;
    private double price;
    private boolean changed;
    private final Object MUTEX = new Object();

    public Stock() {
        this.observers = new ArrayList<>();
        this.price = 0.0;
        this.changed = false;
    }

    @Override
    public void register(Observer obj) {
        if (obj == null) throw new NullPointerException("Null Observer");
        synchronized (MUTEX) {
            if (!observers.contains(obj)) {
                observers.add(obj);
            }
        }
    }

    @Override
    public void unregister(Observer obj) {
        synchronized (MUTEX) {
            observers.remove(obj);
        }
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal = null;
        synchronized (MUTEX) {
            if (!changed) return;
            observersLocal = new ArrayList<>(this.observers);
            this.changed = false;
        }
        for (Observer obj : observersLocal) {
            obj.update();
        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.price;
    }

    public void setPrice(double price) {
        System.out.println("Stock price updated to: " + price);
        this.price = price;
        this.changed = true;
        notifyObservers();
    }
}