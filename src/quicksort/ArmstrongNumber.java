package quicksort;

/**
 * 
 * @author mtheertha
 *
 */
public class ArmstrongNumber {
	public static void main(String[] args) {
		ArmstrongNumber arm = new ArmstrongNumber();
		System.out.println(arm.checkValid(371));
	}

	private boolean checkValid(int num) {
		int len = String.valueOf(num).length();
		int sum = 0;
		for(int i = 1; num/i > 0; i*=10) {
			int norm = (num/i)%10;
			sum += (Math.pow(norm, len));
		}
		System.out.println("Sum is : "+sum);
		return sum == num;
	}
}
