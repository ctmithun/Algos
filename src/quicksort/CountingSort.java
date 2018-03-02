/**
 * 
 */
package quicksort;

import java.util.Arrays;

/**
 * @author mtheertha
 *
 */
public class CountingSort {

	private int[] sort(int a[]) {
		int count[] = new int[99];
		for (int i = 0; i < a.length; i++) {
			++count[a[i]];
		}
		int j = 0;
		for (int i = 0; i < count.length; i++) {
			if(count[i] == 0) 
				continue;
			for (int k = 0; k < count[i]; k++) {
				a[j] = i;
				++j;
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		CountingSort sort = new CountingSort();
		System.out.println(Arrays.toString(sort.sort(new int [] {1, 4, 1, 2, 7, 5, 2})));
	}
	
}
