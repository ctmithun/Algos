/**
 * 
 */
package quicksort;

import java.util.Arrays;

/**
 * @author mtheertha
 *
 */
public class Java8StreamExamples {
	public static void main(String[] args) {
		int a[] = new int[] {3,4,5,6,7,1,2};
		System.out.println(Arrays.stream(a).max().getAsInt());
		
		System.out.println(Arrays.stream(a).filter(i -> (i%2 == 0)).sum());;
	}
}
