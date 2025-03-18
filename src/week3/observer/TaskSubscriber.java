package week3.observer;

public class TaskSubscriber implements Observer {
    private String name;
    private Subject task;

    public TaskSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String status = (String) task.getUpdate(this);
        if (status == null) {
            System.out.println(name + ":: No new status update");
        } else {
            System.out.println(name + ":: Received status update: " + status);
        }
    }

    @Override
    public void setSubject(Subject sub) {
        this.task = sub;
    }
}