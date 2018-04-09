/**
 * 
 */
package quicksort;

/**
 * @author mtheertha
 *
 */
public class StackOverFlowExample {
	int a;
	public static void main(String[] args) {
		StackOverFlowExample st = new StackOverFlowExample();
		st.example();
	}
	
	private void example() {
		++a;
		System.out.println("Stack No : "+a);
		if(a < 10000 )
			example();
	}
}
