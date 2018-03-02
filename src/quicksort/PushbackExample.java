/**
 * 
 */
package quicksort;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

/**
 * @author CTM
 *
 */
public class PushbackExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "if (a == 4) a=0;\n";
		byte buf[] = s.getBytes();
		ByteArrayInputStream bis = new ByteArrayInputStream(buf);
		int c;
		try(PushbackInputStream f = new PushbackInputStream(bis)) {
			while((c = f.read()) != -1) {
				switch (c) {
				case '=':
					if((c = f.read()) == '=') {
						System.out.print(".eq.");
					} else {
						System.out.print("<-");
						f.unread(c);
					}
					break;
				default:
					System.out.print((char)c);
					break;
				}
			}
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

}
