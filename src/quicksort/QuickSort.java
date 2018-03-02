/**
 * 
 */
package quicksort;

import java.util.Arrays;

/**
 * @author CTM
 *
 */
public class QuickSort {
	public static void main(String[] args) {
		int arr[] = {10,80,20,30,90,50,70};
		QuickSort quick = new QuickSort();
		quick.quicksort(arr, 0, arr.length);
		System.out.println("Sorted array is : "+Arrays.toString(arr));
	}
	
	public void quicksort(int[] arr, int low, int high) {
		if(low < high) {
			int pi = partition(arr, low, high);
			quicksort(arr, low, pi-1);
			quicksort(arr, pi+1, high);
		}
	}

	private int partition(int[] arr, int low, int high) {
		int i = low-1;
		int pi = arr[high-1];
		for (int j = low; j < high-1; j++) {
			if(arr[j] >= pi) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = pi;
		arr[high -1] = temp;
		return i+1;
	}
}
