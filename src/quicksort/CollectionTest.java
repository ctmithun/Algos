/**
 * 
 */
package quicksort;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author mtheertha
 *
 */
public class CollectionTest {
	public static void main(String[] args) {
		List<String> ls = new ArrayList<>(32);
		ls.add(null);
		System.out.println(ls.get(0));
		
		Set<String> ss = new HashSet<>();
		ss.add(null);
		System.out.println(ss.contains(null));
		
		// throws NullPointerExcpetion
		Set<String> ts = new TreeSet<>();
		ss.add(null);
	}
}
