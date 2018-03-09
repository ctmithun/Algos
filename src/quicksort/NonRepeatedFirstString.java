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
public class NonRepeatedFirstString {
	public static void main(String[] args) {
		NonRepeatedFirstString nrs = new NonRepeatedFirstString();
		System.out.println(nrs.getNonRepeatedWord("swweeddrr"));
	}

	private String getNonRepeatedWord(String string) {
		int index = 1;
		Set<Character> charSet = new HashSet<>();
		for (char c: string.toCharArray()) {
			int tIndex = string.indexOf(c, index);
			if(tIndex < 0 && !charSet.contains(c)) {
				return String.valueOf(c);
			}
			charSet.add(c);
			++index;
		}
		return "Nothing non repeated in a given string";
	}
}
