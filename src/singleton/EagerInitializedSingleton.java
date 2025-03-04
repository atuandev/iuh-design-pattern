package singleton;

// 21129321 - Nguyen Phan Anh Tuan
public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new
            EagerInitializedSingleton();

    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
