package week1.singleton;

// 21129321 - Nguyen Phan Anh Tuan
public class BillPughSingleton {
    private BillPughSingleton() {
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
