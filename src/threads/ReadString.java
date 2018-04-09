/**
 * 
 */
package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author mtheertha
 *
 */
public class ReadString implements Runnable{
	String s = "Hello Webmi";
	volatile int count = 0;
	@Override
	public void run() {
		
		try {
			System.out.println("Entering the readchar() method from thread "+Thread.currentThread().getName());
			readChar();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void readChar() throws InterruptedException {
		synchronized (this) {
			while(true) {
				if(count >= s.length()) {
					this.notifyAll();
					break;
				}
				if(Thread.currentThread().getName().equals("pool-1-thread-"+String.valueOf(count%4==0?1 : count%4))) {
					/*if(s.charAt(count) == ' ') {
						++count;
					}*/
					System.out.println(Thread.currentThread().getName() + " reads character "+s.charAt(count));
					++count;
				} 
				this.notifyAll();
                try
                {
                    this.wait();
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		ReadString rs = new ReadString();
		ExecutorService se = Executors.newFixedThreadPool(4);
		/*Thread t1 = new Thread(rs,"t0");
		Thread t2 = new Thread(rs,"t1");
		Thread t3 = new Thread(rs,"t2");
		Thread t4 = new Thread(rs,"t3");
		t1.start();
		t2.start();
		t3.start();
		t4.start();*/
		for (int i = 0; i < 4; i++) {
			se.execute(rs);
		}
		se.awaitTermination(10, TimeUnit.SECONDS);
		/*Thread t1  = new Thread(rs, "t1");
		t1.start();
		Thread t2  = new Thread(rs, "t2");
		t2.start();
		Thread t3  = new Thread(rs, "t3");
		t3.start();
		Thread t4  = new Thread(rs, "t4");
		t4.start();*/
	}
}
