/**
 * 
 */
package quicksort;

import java.util.Arrays;

/**
 * @author mtheertha
 *
 */
public class RadixSort {
	private int[] readixSort(int a[]) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		for(int exp = 1; max/exp > 0; exp=exp*10) {
			redixSort(a, exp);
		}
		System.out.println(Arrays.toString(a));
		
		return null;
	}
	
	private void redixSort(int[] a, int exp) {
		int n = a.length;
		int[] output = new int[n];
		
		int[] count = new int[10];
		
		for (int i = 0; i < n; i++) {
			int normalized = a[i]/exp;
			++count[normalized%10];  
		}
		
		//reserve space for indices having more than 1 count
		for (int i = 1; i < 10 ; i++) {
			count[i] += count[i-1];
		}
		
		for (int i = n-1; i >= 0 ; i--) {
			int normalized = a[i]/exp;
			int tempIndex = count[(normalized%10)]-1;
			count[normalized%10]--;
			output[tempIndex] = a[i];
		}
		
		System.arraycopy(output, 0, a, 0, n);
		
	}

	public static void main(String[] args) {
		RadixSort rs = new RadixSort();
		rs.readixSort(new int[] {170, 45,75,90,802,24,2,66});
	}
}
