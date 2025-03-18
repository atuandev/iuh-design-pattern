package week3.observer;

public class TaskTest {
    public static void main(String[] args) {
        Task task = new Task();

        // Tạo các thành viên trong nhóm
        Observer member1 = new TaskSubscriber("Member 1");
        Observer member2 = new TaskSubscriber("Member 2");
        Observer member3 = new TaskSubscriber("Member 3");

        // Đăng ký thành viên với công việc
        task.register(member1);
        task.register(member2);
        task.register(member3);

        // Liên kết công việc với thành viên
        member1.setSubject(task);
        member2.setSubject(task);
        member3.setSubject(task);

        // Thay đổi trạng thái công việc
        task.setStatus("In Progress");

        // Hủy đăng ký một thành viên
        task.unregister(member2);

        // Thay đổi trạng thái lần nữa
        task.setStatus("Completed");
    }
}