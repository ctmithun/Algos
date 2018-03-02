/**
 * 
 */
package quicksort;

/**
 * @author mtheertha
 *
 */
public class BinarySearch {

	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		int resut = bs.search(new int[] {1,2,45,67,70,97,124,125,145,170}, 30);
		System.out.println(resut < 0 ? "Not found":"Found at index"+ resut);
	}

	private int search(int[] a, int find) {
		int min = 0;
		int max = a.length-1;
		int mid = (max/2)+min;
		
		while(min <= max) {
			int middle = a[mid];
			if(find > middle) {
				min = mid+1;
			} else if(find < middle){
				max = mid - 1;
			} else {
				return mid;
			}
			mid = (min+max)/2;
		}
		return -1;
		
	}
}
