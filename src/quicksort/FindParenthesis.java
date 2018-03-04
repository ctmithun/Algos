/**
 * 
 */
package quicksort;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author mtheertha
 *
 */
public class FindParenthesis {

	static int closingBracePosition(String inputSentence, int openingBraceNum) {
        /*
         * Write your code here.
         */
		if(checkIsValid(inputSentence)) {
            int openPosition = 0; 
			int start = 0; 
			for (int i = 1; i <= openingBraceNum; i++) {
				openPosition = inputSentence.indexOf('(', start);
                start = openPosition + 1;
			}
			boolean searchPosition = true;
			start = openPosition;
			while(searchPosition) {
				int cInd = inputSentence.indexOf(')', start);
                if(start == inputSentence.length()-1) {
					return cInd + 1;
				}
				int oInd = inputSentence.indexOf('(', start+1);
				if(cInd < oInd || oInd < 0) {
					return cInd + 1;
				}
				start = cInd+1;
			}
		}
		
		return -1;
    }

	private static boolean checkIsValid(String inputSentence) {
		int openCount = 0;
		int closeCount = 0;
		int i = 0;
        int start = 0;
		while(i >= 0) {
			i = inputSentence.indexOf('(', start);
			if(i >= 0) {
				++openCount;
			} else {
				break;
			}
            start = i+1;
		}
		start = 0;
        i = 0;
		while(i >= 0) {
			i = inputSentence.indexOf(')', start);
			if(i >= 0) {
				++closeCount;
			} else {
				break;
			}
            start = i+1;
		}
		return closeCount == openCount;
	}
	
	private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //System.out.println(closingBracePosition("(I want (to write a language parser), would (you) help me)", 2));
    	System.out.println(closingBracePosition("((jahdsjkashdkjas as(jdklasjdkasjd () ajdsjlaksjdla dsakjd) lk(jasdk)j() ()))", 3));
    }
}
