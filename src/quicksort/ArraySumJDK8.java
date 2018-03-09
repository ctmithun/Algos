/**
 * 
 */
package quicksort;

import java.util.Arrays;

/**
 * @author mtheertha
 *
 */
public class ArraySumJDK8 {
	public static void main(String[] args) {
		ArraySumJDK8 arj = new ArraySumJDK8();
		arj.calculateSum(new int[] {1,2,3,4,5});
	}

	private void calculateSum(int[] is) {
		System.out.println(Arrays.stream(is).sum());
		
	}
}
