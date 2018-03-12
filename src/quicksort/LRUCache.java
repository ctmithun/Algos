/**
 * 
 */
package quicksort;

import java.util.HashMap;

/**
 * @author mtheertha
 *
 */
public class LRUCache {
	private int capacity;
	private HashMap<Integer, Node> hash;
	private Node head;
	private Node tail;
	
	public LRUCache(int capacity) {
		this.capacity = capacity;
		this.hash  = new HashMap<>(capacity);
	}
	
	public void get(int k) {
		if(hash.containsKey(k)) {
			Node n = hash.get(k);
			remove(n);
			n.next = head;
			n.prev = null;
			head = n;
		}
	}

	private void remove(Node n) {
		if(n.prev != null) {
			n.prev.next = n.next;
		} else {
			head = n.next;
		}
		
		if(n.next != null) {
			n.next.prev = n.prev;
		} else {
			tail = n.prev;
		}
	}
	
	public void setHead(Node n) {
		n.next = head;
		n.prev = null;
		if(head != null) {
			head.prev = n;
		} 
		head = n;
		if(tail == null) {
			tail = head;
		}
	}
	
	public void set(int key, int value) {
		if(hash.containsKey(key)) {
			Node n = hash.get(key);
			setHead(n);
		} else {
			Node n = new Node();
			n.key = key;
			n.value = value;
			if(hash.size() >= this.capacity) {
				hash.remove(tail.key);
				remove(tail);
			}
			hash.put(key, n);
			setHead(n);
		}
	}
	
	public static void main(String[] args) {
		LRUCache cache = new LRUCache(4);
		cache.set(1, 1);
		cache.set(2, 2);
		cache.set(3, 3);
		cache.set(4, 4);
		cache.set(5, 5);
		System.out.println(cache.head.key);
	}
}
