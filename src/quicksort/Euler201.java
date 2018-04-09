/**
 * 
 */
package quicksort;

import java.util.HashSet;
import java.util.Set;

/**
 * @author mtheertha
 *
 */
public class Euler201 {
	public static void main(String[] args) {
		Set<Integer> unique = new HashSet<>();
		unique.stream().mapToInt(i -> i).sum();
	}
}
