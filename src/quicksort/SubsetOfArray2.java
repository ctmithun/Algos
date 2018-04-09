/**
 * 
 */
package quicksort;

/**
 * @author mtheertha
 *
 */
public class SubsetOfArray2 {
	   // Print all subsets of given set[]
    static void printSubsets(int set[], int m)
    {
        int n = set.length;
 
        // Run a loop for printing all 2^n
        // subsets one by obe
        System.out.println(Math.pow(2, 100));
        for (int i = 0; i < (1<<n); i++)
        {
//            System.out.print("{ ");
        	int count = 0;
        	int sum = 0;
            // Print current subset
            for (int j = 0; j < n; j++) {
 
                // (1<<j) is a number with jth bit 1
                // so when we 'and' them with the
                // subset number we get which numbers
                // are present in the subset and which
                // are not
                if ((i & (1 << j)) > 0) {
//                    System.out.print(set[j] + " ");
                    ++count;
                    sum += set[j];
                }
        	}
            if(count == 3) {
            	System.out.println(sum);
            }
//            System.out.println("}");
        }
    }
    
    public static void main(String[] args) {
    	printSubsets(new int[] {1, 3, 6, 8, 10, 11}, 3);
	}
}
