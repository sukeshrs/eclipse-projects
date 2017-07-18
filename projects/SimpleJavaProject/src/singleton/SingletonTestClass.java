package singleton;

public class SingletonTestClass {

	public static void main(String[] args) {

		System.out.println(BaseSingleton.getInstance());
		System.out.println(BaseSingleton.getInstance());
		System.out.println(BaseSingleton.getInstance());
		System.out.println(EagerSingleton.getInstance());
		System.out.println(EagerSingleton.getInstance());
		System.out.println(EagerSingleton.getInstance());
		System.out.println(LazyInitializedThreadSafeSingleton.getInstance());
		System.out.println(LazyInitializedThreadSafeSingleton.getInstance());
		System.out.println(LazyInitializedThreadSafeSingleton.getInstance());
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		System.out.println(classLoader);
	}

}
