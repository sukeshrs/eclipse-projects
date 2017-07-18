package singleton;

public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton threadSafeSingle ;
	private ThreadSafeSingleton(){};
		
	public static synchronized ThreadSafeSingleton getInstance(){
		if(null==threadSafeSingle){
			threadSafeSingle= new ThreadSafeSingleton();
		}
		return threadSafeSingle;		
	}

}
