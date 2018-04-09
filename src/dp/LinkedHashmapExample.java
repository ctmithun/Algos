/**
 * 
 */
package dp;

import java.util.LinkedHashMap;

/**
 * @author mtheertha
 *
 */
public class LinkedHashmapExample {
	public static void main(String[] args) {
		LinkedHashMap<String, String> lh = new LinkedHashMap<>();
		lh.put("A","A");
		lh.put("B","B");
		
		System.out.println(lh.values());
	}
}
