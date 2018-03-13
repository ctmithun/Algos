/**
 * 
 */
package quicksort;

import java.util.PriorityQueue;

/**
 * @author mtheertha
 *
 */
public class PriorityQueueExample {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		//add
		pq.add(8);
		pq.add(7);
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(4);
		pq.add(5);
		pq.add(6);
		pq.add(6);
		pq.add(6);
		pq.add(6);
		pq.add(6);
		pq.add(6);
		pq.add(-1);
		pq.add(-2);
		pq.add(-10);
		System.out.println("Queue size: "+pq.size());
		//poll
		pq.remove(2);
		System.out.println(pq);
	}
}
