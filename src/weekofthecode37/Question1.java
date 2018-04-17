/**
 * 
 */
package weekofthecode37;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @author mtheertha
 *
 */
public class Question1 {
	static void averageOfTopEmployees(int[] rating) {
        int sum = 0;
        int count = 0;
        for(int i =0;i< rating.length;i++) {
            if(rating[i] >= 90) {
                sum += rating[i];
                ++count;
            }
        }
//        System.out.println(round(sum/count, 2));
    }
	
	public static String round(double value, int count, int numberOfDigitsAfterDecimalPoint) {
        BigDecimal bigDecimal = new BigDecimal(value);
        BigDecimal countBigD = new BigDecimal(value);
        bigDecimal = bigDecimal.divide (countBigD, numberOfDigitsAfterDecimalPoint, BigDecimal.ROUND_HALF_UP);
        /*bigDecimal = bigDecimal.setScale(numberOfDigitsAfterDecimalPoint,
                BigDecimal.ROUND_HALF_UP);*/
        return bigDecimal.toEngineeringString();
    }
}
