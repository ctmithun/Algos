/**
 * 
 */
package dp;

/**
 * @author mtheertha
 *
 */
public class StringUnique {
	public static void main(String[] args) {
		String str = "zbcdz";
		int checker = 0;
		for (int i=0; i<str.length(); i++)
        {
            int bitAtIndex = str.charAt(i)-'a';
            System.out.println("1<<Bitindex: "+(1<<bitAtIndex));
            // if that bit is already set in checker,
            // return false
            if ((checker & (1<<bitAtIndex)) > 0)
                return ;
 
            // otherwise update and continue by
            // setting that bit in the checker
            checker = checker | (1<<bitAtIndex);
            System.out.println("checker: "+checker);
        }
	}
}
