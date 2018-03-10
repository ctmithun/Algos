/**
 * 
 */
package quicksort;

/**
 * @author mtheertha
 *
 */
public class MinSubArraySum {
	public static void main(String[] args) {
		MinSubArraySum msa = new MinSubArraySum();
		System.out.println(msa.calculateMinSubArray(new int[] {1,2,3,4},8));
	}

	private int calculateMinSubArray(int[] is, int num) {
		int sum = 0;
		int end = 0, start = 0;
		int min = is.length + 1;
		int n = is.length;
		while(end < n) {
			while(end < n) {
				if(is[end] >= num)
					return 1;
				sum += is[end++];
			}
			
			while(sum >= num && start < n) {
				if((end - start) < min) {
					min = end - start;
				}
				sum -= is[start++];
			}
		}
		
		return min == (is.length +1) ? -1 : min; 
	}
	
}
