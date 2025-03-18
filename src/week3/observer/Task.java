package week3.observer;

import java.util.ArrayList;
import java.util.List;

public class Task implements Subject {
    private List<Observer> observers;
    private String status;
    private boolean changed;
    private final Object MUTEX = new Object();

    public Task() {
        this.observers = new ArrayList<>();
        this.status = "Not Started";
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
        return this.status;
    }

    public void setStatus(String status) {
        System.out.println("Task status updated to: " + status);
        this.status = status;
        this.changed = true;
        notifyObservers();
    }
}