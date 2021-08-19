/**
 * 
 */
package problem3;

/**
 * @author Scott Walters
 *
 */
public class CalculateArrangements {
	
	public static void main(String[] args) {
		
		if (args.length < 1) {
			System.out.println("You must enter a height as a command line argument.");
			System.exit(1);
		}
		
		try {
			
			int height = Integer.parseInt(args[0]);
			System.out.println(count(height));

		} catch (NumberFormatException e) {
			System.out.println("The height entered must be an integer.");
			System.exit(2);
		}
		
	}
	

	/**
	 * @param the height
	 */
	private static int count(int height) {
		
		if (height == 1) {
			return 1;
		} else if (height == 2) {
			return 2;
		} else {
			return count(height - 1) + count(height - 2);
		}
		
	}
	
}
