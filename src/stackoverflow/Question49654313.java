/**
 * 
 */
package stackoverflow;

/**
 * @author mtheertha
 *
 */
public class Question49654313 implements Runnable{
	A a = new A();
	B b = new B();
	Thread t;

	@Override
	public void run() {
	    b.bar(a);
	}

	public static void main(String args[]) {
		Thread.currentThread().setName("MainThread");
		Question49654313 q = new Question49654313();
	    q.deadLock();
	}

	private void deadLock() {
		Thread t = new Thread(this, "RacingThread");
	    a.foo(b);
	    t.setPriority(10);
	    t.start();
	}
}
