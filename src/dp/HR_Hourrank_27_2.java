/**
 * 
 */
package dp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author mtheertha
 *
 */
public class HR_Hourrank_27_2 {
	private static Set<Integer> products = new HashSet<Integer>();

	/*
	 * Complete the maximumProfit function below.
	 */
	static long maximumProfit(int[] p) {
        /*
         * Write your code here.
         */
        int data[] = new int[3];
 
        // Print all combination using temprary
        // array 'data[]'
        combinationUtil(p, p.length, 3, 0, data, 0);
        if(products.isEmpty()) {
        	return -1;
        }
        int s = Collections.max(products);
        return s;
    }

	static void combinationUtil(int arr[], int n, int r,
                          int index, int data[], int i)
    {
        // Current combination is ready to be printed, 
        // print it
        if (index == r) {
        	int z = data[0];
        	boolean a = true;
        	int prev = data[0];
        	for (int j = 1; j < r; j++) {
        		if(data[j] > prev) {
        			z *= data[j];
        			prev = data[j];
        		} else {
        			a = false;
        		}
            }
        	if(a) {
        		products.add(z);
        	}
            return;
        }
 
        // When no more elements are there to put in data[]
        if (i >= n)
            return;
 
        // current is included, put next at next
        // location
        data[index] = arr[i];
        combinationUtil(arr, n, r, index + 1, 
                               data, i + 1);
 
        // current is excluded, replace it with
        // next (Note that i+1 is passed, but
        // index is not changed)
        combinationUtil(arr, n, r, index, data, i + 1);
    }

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(scanner.nextLine().trim());

		int[] p = new int[n];

		String[] pItems = scanner.nextLine().split(" ");

		for (int pItr = 0; pItr < n; pItr++) {
			int pItem = Integer.parseInt(pItems[pItr].trim());
			p[pItr] = pItem;
		}

		long result = maximumProfit(p);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();
	}
}
