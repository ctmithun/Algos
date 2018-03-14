/**
 * 
 */
package quicksort;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;

/**
 * @author mtheertha
 *
 */
public class StreamExample {
	public static void main(String[] args) {
		StreamExample se = new StreamExample();
		se.checkStream();
	}

	private void checkStream() {
		int[] a = new int[] {1,2,3,4,5,6};
		System.out.println("Sum of array is "+ Arrays.toString(Arrays.stream(a).boxed().toArray()));
		
	}
}
