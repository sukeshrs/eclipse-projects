package singleton;

public final class LazyInitializedThreadSafeSingleton {
    private static volatile LazyInitializedThreadSafeSingleton instance = null;

    private LazyInitializedThreadSafeSingleton() {}

    public static LazyInitializedThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized(LazyInitializedThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new LazyInitializedThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}