package threads;

public class DeadLock {
	public static void main(String[] args) throws InterruptedException {
		Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        
        Thread thread1 = new Thread(new SynchroThread( obj1, obj2),"Thread111");
        Thread thread2 = new Thread(new SynchroThread( obj2, obj3),"Thread222");
        Thread thread3 = new Thread(new SynchroThread( obj3, obj1),"Thread333");
        
        SynchroThread synchroThread  = new SynchroThread( obj1, obj2);
        synchroThread.run();
        synchroThread.run();
        synchroThread.run();
             
        thread1.start();
        Thread.sleep(3000);
        thread2.start();
        Thread.sleep(3000);
        thread3.start();
        
	}

}
