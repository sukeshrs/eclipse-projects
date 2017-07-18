package singleton;

public class BaseSingleton {
	
	private static BaseSingleton single =null;
	
	private BaseSingleton() {
	};

	public static BaseSingleton getInstance() {
		if (single == null) {
			single = new BaseSingleton();
		}
		return single;

	}
}
