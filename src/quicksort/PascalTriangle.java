/**
 * 
 */
package quicksort;

/**
 * @author mtheertha
 *
 */
public class PascalTriangle {
	public static void main(String[] args) {
		PascalTriangle pst = new PascalTriangle();
//		pst.printPascal(50);
//		pst.printPascalv2(6);
		pst.printPascalv3(10);
	}

	private void printPascal(int i) {
		
		long[][] prevArr = new long[i][i];
		prevArr[0][0] = 1;
		
		for (int j = 0; j < i; j++) {
			StringBuilder sb = new StringBuilder("1");
			prevArr[j][0] = 1;
			for (int j2 = 1; j2 <= j; j2++) {
				long newNum = prevArr[j-1][j2-1]+prevArr[j-1][j2];
				sb.append("\t" + newNum);
				prevArr[j][j2] = newNum;
			}
			System.out.println(sb.toString());
		}
		
	}
	
	private void printPascalv2(int i) {
		
		for (int j = 1; j <= i; j++) {
			long c = 1;
			StringBuilder sb = new StringBuilder();
			for (int j2 = 1; j2 <= j; j2++) {
				sb.append(c+"\t");
				c = c * (j - j2)/j2;
			}
			System.out.println(sb.toString());
		}
		
	}
	
	private void printPascalv3(int i) {
		int[][] arr = new int[i][2*i];
		for (int j = 0; j < i; j++) {
			long c = 1;
//			StringBuilder sb = new StringBuilder();
			for(int k = i ; k > j; k--) {
				System.out.print("\t");
			}
			for (int k = 0; k <= j; k++) {
				System.out.print(c + "\t");
				c = (c * (j-k))/(k+1); 
				System.out.print("\t");
			}
			System.out.println();
		}
		
	}
}
