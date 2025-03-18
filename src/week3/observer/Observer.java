package week3.observer;

public interface Observer {
    public void update();

    public void setSubject(Subject sub);
}
