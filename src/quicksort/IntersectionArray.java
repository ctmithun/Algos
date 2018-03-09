/**
 * 
 */
package quicksort;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author mtheertha
 *
 */
public class IntersectionArray {
	
	public static void main(String[] args) {
		IntersectionArray inr = new IntersectionArray();
		inr.getIntersectArray(new int[] {21, 34, 41, 22, 35}, new int[] {61, 34, 45, 21, 11});
	}

	private void getIntersectArray(int[] is, int[] is2) {
		Set<Integer> mergedSet = new HashSet<>();
		Set<Integer> mergedSet2 = new HashSet<>();
		for(int i = 0; i< is.length;i++) {
			if (i < is.length) {
				mergedSet.add(is[i]);
			}
		}
		int arr[] = new int[is.length];
		for (int i : is2) {
			if(mergedSet2.contains(i)) {
//				arr
			}
		}
		
	}
	
	
}
