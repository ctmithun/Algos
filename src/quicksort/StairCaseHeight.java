/**
 * 
 */
package quicksort;

import java.util.Scanner;

/**
 * @author mtheertha
 *
 */
public class StairCaseHeight {
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] tm = new int[n];
        for(int tm_i = 0; tm_i < n; tm_i++){
            tm[tm_i] = in.nextInt();
            int bCount = tm[tm_i];
            int count = 0;
            while(bCount>0 && bCount >= count) {
                ++count;
                bCount = bCount - count;
            }
            System.out.println(count);
        }
	}
}
