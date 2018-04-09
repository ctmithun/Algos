/**
 * 
 */
package quicksort;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author mtheertha
 *
 */
public class SubsetOfArray {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        Set<Integer> unique = new HashSet<>(n);
        Set<Integer> repeated = new HashSet<>(n);
        for(int expenditure_i = 0; expenditure_i < n; expenditure_i++){
            a[expenditure_i] = in.nextInt();
        }
        int temp[] = new int[d];
        combinationSet(a, n, 0, d, temp, unique, repeated, 0);
        System.out.println(unique.stream().mapToInt(i -> i).sum());
    }
    
    public static void combinationSet(int[] a, int n, int startIndex, int r, int[] temp, Set<Integer> unique, Set<Integer> repeated, int currentSize) {
        if(currentSize == r) {
            int sum = 0;
            for(int i = 0;i<r;i++) {
                sum += temp[i];
            }
            if(repeated.contains(sum)) {
                unique.remove(sum);
            } else {
                repeated.add(sum);
                unique.add(sum);
            }
            return;
        }
        
        if(startIndex == n) {
            return;
        }
        
        temp[currentSize] = a[startIndex];
        
        combinationSet(a,n,startIndex+1,r,temp,unique,repeated,currentSize+1);
        combinationSet(a,n,startIndex+1,r,temp,unique,repeated,currentSize);
    }
}
