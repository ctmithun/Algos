/**
 * 
 */
package quicksort;

/**
 * @author mtheertha
 *
 */
public class LegendresTheoremOfPrimeFactors {
	public static void main(String[] args) {
		LegendresTheoremOfPrimeFactors lg = new LegendresTheoremOfPrimeFactors();
		System.out.println(lg.calculate(146, 15));
		
	}

	// ans = (n/j) + (n/j^2) + (n/j^3)....
	public int calculate(int i, int j) {
		int ans = 0;
		int n = i;
		while(n > 0) {
			n /= j;
			ans += n;
		}
		return ans;
	}
}
