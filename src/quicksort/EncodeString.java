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
public class EncodeString {
	/*
     * Complete the function below.
     */
    static String collapseString(String input) {
    	int start = 0;
    	int i = 0;
    	String output = "";
    	char ch = input.charAt(0);
    	while (i != -1 || start < input.length()) {
    		int count = 1;
    		while((start+1) < input.length() && input.charAt(start+1) == ch) {
    			ch = input.charAt(start);
    			++count;
    			start +=1;
    		}
    		
    		//i = input.indexOf(String.valueOf(ch));
			//int times = (i - start) + 1;
    		if((start+1) >= input.length()) {
    			output += count+String.valueOf(ch);
				break;
			}
			output += count+String.valueOf(ch);
			ch = input.charAt(start+1);
			start += 1;
		}
    	return output;
    }
    
    public static void main(String[] args) {
		System.out.println(collapseString("GGGGGrrrrrrrrrrrrrrt1234111"));
	}
}
