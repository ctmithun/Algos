/**
 * 
 */
package quicksort;

/**
 * @author mtheertha
 *
 */
public class ThreadSynchronizationExample implements Runnable {
	public synchronized void run1() {
		long t= System.currentTimeMillis();
		long end = t+2000;
		while(System.currentTimeMillis() < end) {
		  // do something
		  // pause to avoid churning
		  
		}
	}
	
	public synchronized void run2() {
		long t= System.currentTimeMillis();
		long end = t+2000;
		while(System.currentTimeMillis() < end) {
		  // do something
		  // pause to avoid churning
		  
		}
	}
	
	public static synchronized void run3() {
		long t= System.currentTimeMillis();
		long end = t+3000;
		while(System.currentTimeMillis() < end) {
		  // do something
		  // pause to avoid churning
		  
		}
	}
	
	
	public static class CheckThreadSync{
		public static void checkThread() {
			ThreadSynchronizationExample ts = new ThreadSynchronizationExample();
			long then = System.currentTimeMillis();
			Thread t1 = new Thread(ts);
			t1.start();
			Thread t2= new Thread(ts);
			t2.start();
			Thread t3 = new Thread(ts);
			t3.start();
			
			long now = System.currentTimeMillis();
			System.out.println(now - then);
		}
	}


	@Override
	public void run() {
		System.out.println("Created Thread");
		run1();run2();run3();
	}
	
	public static void main(String[] args) {
		CheckThreadSync ch = new CheckThreadSync();
		ch.checkThread();
	}
}


