/**
 * 
 */
package quicksort;

/**
 * @author mtheertha
 *
 */
public class PrimeFactorPowerCalculation {
	public static void main(String[] args) {
		PrimeFactorPowerCalculation pmf = new PrimeFactorPowerCalculation();
		int pow = pmf.calculatePrimeFactor(146, 10);
		System.out.println(pow);
	}

	private int calculatePrimeFactor(int i, int j) {
		LegendresTheoremOfPrimeFactors lg = new LegendresTheoremOfPrimeFactors();
		int n = Integer.MAX_VALUE;
		int m = j;
		while(m%2 == 0) {
			m /= 2;
		}
		for (int k = 3; k <= Math.sqrt(m); k+=2) {
			while (m % k == 0) {
				n  = Math.min(n, lg.calculate(i, k));
				m /= k;
			}
			
		}
		
		// if n is a prime number
		if(m > 2) {
			n  = Math.min(n, lg.calculate(i, m));
		}
		return n;
	}
}
