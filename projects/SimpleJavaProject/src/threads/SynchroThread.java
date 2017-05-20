package threads;

public class SynchroThread implements Runnable {
	
	private Object obj11;
	private Object obj22;

	public SynchroThread(Object obj1, Object obj2) {
		this.obj11 = obj1;
		this.obj22 = obj2;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("Name:" + name);
		
		synchronized (obj11) {
			
			System.out.println(name + " acquired lock on Object1: " + obj11);
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
/*			synchronized (obj22) {
				 System.out.println(name + " acquired lock on Object2: " + obj22);
				
			}
			System.out.println(name + " released lock on Object2: " + obj22);*/
		}
		
		System.out.println(name + " released lock on Object1: " + obj11);

	}

}
