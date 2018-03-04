/**
 * 
 */
package quicksort;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author mtheertha
 *
 */
public class RomanNumbers {
	static String[] romanizer(int[] numbers) {
		String[] romans = new String[numbers.length];
		String sb = "";
        for (int i = 0; i < numbers.length; i++) {
        	for(int exp = 1; numbers[i]/exp > 0; exp=exp*10) {
    			sb = getRomans(numbers[i], exp) + sb;
    		}
        	romans[i] = sb;
        	sb = "";
		}
        
        return romans;
    }

	private static String getRomans(int numbers, int exp) {
		int norm = numbers/exp;
		return findRoman(numbers, exp, norm);
	}

	private static String findRoman(int num, int exp, int norm) {
		HashMap<Integer, String> romanRef = new HashMap<>();		
		romanRef.put(1, "I");
		romanRef.put(2, "II");
		romanRef.put(3, "III");
		romanRef.put(4, "IV");
		romanRef.put(5, "V");
		romanRef.put(6, "VI");
		romanRef.put(7, "VII");
		romanRef.put(8, "VIII");
		romanRef.put(9, "IX");
		romanRef.put(10, "X");
		romanRef.put(20, "XX");
		romanRef.put(30, "XXX");
		romanRef.put(10, "X");
		romanRef.put(40, "XL");
		romanRef.put(50, "L");
		romanRef.put(60, "LX");
		romanRef.put(70, "LXX");
		romanRef.put(80, "LXXX");
		romanRef.put(90, "XC");
		romanRef.put(100, "C");
		romanRef.put(200, "CC");
		romanRef.put(300, "CCC");
		romanRef.put(400, "CD");
		romanRef.put(500, "D");
		romanRef.put(600, "DC");
		romanRef.put(700, "DCC");
		romanRef.put(800, "DCCC");
		romanRef.put(900, "CM");
		romanRef.put(1000, "M");
		
		return romanRef.get(norm*exp);
	}
		
}
