/**
 * 
 */
package quicksort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author mtheertha
 *
 */
public class ConcurrentExceptionExample {
	public static void main(String[] args) throws InterruptedException {
		ConcurrentExceptionExample ce = new ConcurrentExceptionExample();
//		ce.method2();
		ce.method1();
	}
	
	public void method1() {
		List<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(1);
		ints.add(1);
		ints.add(1);
		ints.add(1);
		int i = 0;
		for (Integer integer : ints) {
			System.out.println("Passed index: "+i);
			if(i == 2) {
			 ints.remove(2);	
			}
			++i;
		}
		
	}
	
	public void method2() throws InterruptedException {
		List<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(1);
		ints.add(1);
		ints.add(1);
		ints.add(1);
		Runnable rn = () -> {
			int i =0;
			for (Iterator iterator = ints.iterator(); iterator.hasNext();) {
				Integer integer = (Integer) iterator.next();
				if(i == 2) {
					iterator.remove();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				++i;
			}
		};
		Thread t1 = new Thread(rn);
		Thread t2 = new Thread(rn);
		t1.start();
		t2.start();
	}
}
