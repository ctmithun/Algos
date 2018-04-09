/**
 * 
 */
package stackoverflow;

/**
 * @author mtheertha
 *
 */
public class Question49720828 {
	private static class Marsupial {
	    public static boolean isBiped() {
	        return false;
	    }

	    public void getMarsupialDescription() {
	        System.out.println("Value of this : " + this.getClass().getName() + " , Marsupial walks on two legs: " + isBiped());
	    }
	}

	private static class Kangaroo extends Marsupial {
	    public static boolean isBiped() {
	        return true;
	    }
	    public Kangaroo() {
			System.out.println(isBiped());
		}
	    public void getKangarooDescription() {
	        System.out.println("Value of this : " + this.getClass().getName() + ", Kangaroo hops on two legs: " + isBiped());
	    }

	    public static void main(String[] args) {
	        Kangaroo joey = new Kangaroo();
	        joey.getMarsupialDescription(); // Question here
	        joey.getKangarooDescription();
	    }

	}
	
	public static void main(String[] args) {
		Kangaroo k = new Kangaroo();
		k.getMarsupialDescription();
		k.getKangarooDescription();
	}
}
