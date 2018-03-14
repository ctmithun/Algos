/**
 * 
 */
package quicksort;

/**
 * @author mtheertha
 *
 */
@FunctionalInterface
public interface FunctionalExample {
	public int yes();
	default void no() {
		System.out.println("No");
	}
}
