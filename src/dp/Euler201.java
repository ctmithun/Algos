/**
 * 
 */
package dp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author mtheertha
 *
 */
public class Euler201 {
	private Set<Integer> allSet = new HashSet<>();
	private Set<Integer> uniqueSet = new HashSet<>();
	Integer s = new Integer(0);
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int r = 3;
		Euler201 eu201 = new Euler201();
		eu201.findUniqueSum(a,r);
	}

	private void findUniqueSum(int[] a, int r) {
		int b[] = new int[r];
		calculate(a,b,0,a.length-1,0,r);
		System.out.println(s);
	}

	private void calculate(int[] a, int[] b, int start, int end, int index, int r) {
		if(index == r) {
			int sum = Arrays.stream(b).sum();
			if(allSet.contains(sum)) {
				s -= sum;
				return;
			}
			//uniqueSet.add(sum);
			s += sum;
			allSet.add(sum);
			return;
		}
		
		for (int i = start; i <= end && end-i+1 >= r-index; i++) {
			b[index] = a[i];
			calculate(a, b, i+1, end, index+1, r);
			System.out.println((end-i+1) + ">=" + (r-index));
		}
	}

}
