/**
 * 
 */
package quicksort;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author mtheertha
 *
 */
public class ThreadLockExample implements Runnable {
    private final Lock lock = new ReentrantLock();
	public  void run1() {
		lock.lock();
		try {
			Thread.sleep(1000);
			System.out.println("run1");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public  void run2() {
		lock.lock();
		try {
			Thread.sleep(2000);
			System.out.println("run2");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public  void run3() {
		lock.lock();
		try {
			Thread.sleep(3000);
			System.out.println("run3");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public static class CheckThreadSync {
		public static void checkThread() throws InterruptedException {
			ThreadLockExample ts = new ThreadLockExample();
			Runnable r1, r2, r3;
			Thread t1 = new Thread(r1 = new Runnable() {
				ThreadLockExample te = ts;

				public ThreadLockExample getTe() {
					return te;
				}

				public void setTe(ThreadLockExample te) {
					this.te = te;
				}

				@Override
				public void run() {
					te.run1();

				}
			});

			Thread t2 = new Thread(r2 = new Runnable() {
				ThreadLockExample te = ts;

				public ThreadLockExample getTe() {
					return te;
				}

				public void setTe(ThreadLockExample te) {
					this.te = te;
				}

				@Override
				public void run() {
					te.run2();

				}
			});
			Thread t3 = new Thread(r3 = new Runnable() {
				ThreadLockExample te = ts;;

				public ThreadLockExample getTe() {
					return te;
				}

				public void setTe(ThreadLockExample te) {
					this.te = te;
				}

				@Override
				public void run() {
					te.run3();
				}
			});
			long then = System.currentTimeMillis();
			ExecutorService pool = Executors.newFixedThreadPool(2);
			pool.execute(r1);
			pool.execute(r2);
			pool.execute(r3);
			pool.shutdown();
			while (!pool.isTerminated());
			long now = System.currentTimeMillis();
			System.out.println("Total elapsed time: " + (now - then));
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