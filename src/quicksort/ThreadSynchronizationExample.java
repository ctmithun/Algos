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
		try {
			Thread.sleep(1000);
			System.out.println("run1");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void run2() {
		try {
			Thread.sleep(2000);
			System.out.println("run2");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static synchronized void run3() {
		try {
			Thread.sleep(3000);
			System.out.println("run3");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static class CheckThreadSync{
		public static void checkThread() throws InterruptedException {
			ThreadSynchronizationExample ts = new ThreadSynchronizationExample();
			Runnable r1,r2,r3;
			Thread t1 = new Thread(r1 = new Runnable() {
				ThreadSynchronizationExample te = ts;
				
				public ThreadSynchronizationExample getTe() {
					return te;
				}

				public void setTe(ThreadSynchronizationExample te) {
					this.te = te;
				}

				@Override
				public void run() {
					te.run1();
					
				}
			});
			
			Thread t2= new Thread(r2 = new Runnable() {
				ThreadSynchronizationExample te = ts;
				
				public ThreadSynchronizationExample getTe() {
					return te;
				}

				public void setTe(ThreadSynchronizationExample te) {
					this.te = te;
				}

				@Override
				public void run() {
					te.run2();
					
				}
			});
			Thread t3 = new Thread(r3 = new Runnable() {
				ThreadSynchronizationExample te = ts;;
				
				public ThreadSynchronizationExample getTe() {
					return te;
				}

				public void setTe(ThreadSynchronizationExample te) {
					this.te = te;
				}

				@Override
				public void run() {
					te.run3();
				}
			});
			long then = System.currentTimeMillis();
			t1.start();
			t2.start();
			t3.start();
			while(t1.isAlive() || t2.isAlive() || t3.isAlive());		
			long now = System.currentTimeMillis();
			System.out.println("Total elapsed time: "+(now - then));
		}
	}


	@Override
	public void run() {
		System.out.println("Created Thread");
	}
	
	public static void main(String[] args) throws InterruptedException {
		CheckThreadSync ch = new CheckThreadSync();
		ch.checkThread();
	}
}


