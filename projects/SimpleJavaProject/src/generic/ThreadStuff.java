package generic;


public class ThreadStuff {
	
	int i=0;

	public static void main(String[] args) {
		
		int i = 0;
		
		threadTest();
			
		}

	private static void threadTest() {
		Runnable r = new Runnable(){
			@Override
			public void run() {
				System.out.println("My Runnable");
			
			}};
			
		Runnable r1 = new Runnable(){
				@Override
				public void run() {
					System.out.println("My Runnable");
				}};
		r.run();
		r1.run();
	}

}
