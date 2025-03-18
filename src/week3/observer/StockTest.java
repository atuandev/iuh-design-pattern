package week3.observer;

public class StockTest {
    public static void main(String[] args) {
        // Tạo instance của Stock
        Stock stock = new Stock();

        // Tạo các nhà đầu tư
        Observer investor1 = new StockSubscriber("Investor 1");
        Observer investor2 = new StockSubscriber("Investor 2");
        Observer investor3 = new StockSubscriber("Investor 3");

        // Đăng ký nhà đầu tư với cổ phiếu
        stock.register(investor1);
        stock.register(investor2);
        stock.register(investor3);

        // Liên kết cổ phiếu với nhà đầu tư
        investor1.setSubject(stock);
        investor2.setSubject(stock);
        investor3.setSubject(stock);

        // Kiểm tra cập nhật trước khi thay đổi giá
        investor1.update();

        // Thay đổi giá cổ phiếu
        stock.setPrice(100.0);

        // Hủy đăng ký một nhà đầu tư
        stock.unregister(investor2);

        // Thay đổi giá lần nữa
        stock.setPrice(105.5);
    }
}