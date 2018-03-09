/**
 * 
 */
package quicksort;

/**
 * @author mtheertha
 *
 */
public class Merge2Strings {
	public static void main(String[] args) {
		Merge2Strings mer = new Merge2Strings();
		mer.merge("Bye", "Hello");
	}

	private void merge(String string, String string2) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < string.length(); i++) {
			sb.append(string.charAt(i));
			if(i<string2.length()) {
				sb.append(string2.charAt(i));
				if(i == string.length()-1) {
					sb.append(string2.subSequence(i+1, string2.length()));
				}
			}
			
		}
		System.out.println(sb.toString());
	}
}
