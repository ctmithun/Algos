/**
 * 
 */
package quicksort;

import java.util.Arrays;

/**
 * @author mtheertha
 *
 */
public class InsertionSort {
	public static void main(String[] args) {
		InsertionSort ins = new InsertionSort();
		System.out.println(Arrays.toString(ins.sort(new int[] {5,43,2,3,55,78,29,78})));
	}

	private int[] sort(int[] is) {
		// TODO Auto-generated method stub
		int max = findMax(is);
		int temp[] = new int[max+1];
		int ans[] = new int[is.length];
		for (int i = 0; i < is.length; i++) {
			++temp[is[i]]; 
		}
		int w = 0;
		for (int i = 0; i < temp.length; i++) {
			if(temp[i] == 0)
				continue;
			else {
				for (int j = 0; j < temp[i]; j++) {
					ans[w] = i;
					++w;
				}
			}
		}
		return ans;
	}

	private int findMax(int[] is) {
		int max = is[0];
		for (int i = 1; i < is.length; i++) {
			if(is[i] > max)
				max = is[i];
		}
		return max;
	}
}
