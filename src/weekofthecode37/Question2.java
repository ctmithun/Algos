/**
 * 
 */
package weekofthecode37;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author mtheertha
 *
 */
public class Question2 {
	/*
     * Complete the maximumProgramValue function below.
     */
    static long maximumProgramValue(int n) {
        /*
         * Write your code here.
         */
        long max = 0;
        long t = 0;
        for(int i = 0; i< n ; i++) {
            String s = scanner.next();
            int m = scanner.nextInt();
            switch (s) {
			case "add":
				t += m;
				break;
			case "set":
				t = m;
				break;
			}
            if(t > max) {
            	max = t;
            }
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        long result = maximumProgramValue(n);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
        System.out.println(result);
    }
}
