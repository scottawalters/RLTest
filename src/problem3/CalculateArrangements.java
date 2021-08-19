/**
 * Problem 3 for Replacements, Ltd. coding test.
 */
package problem3;

/**
 * @author Scott Walters
 *
 */
public class CalculateArrangements {
	
	public static void main(String[] args) {
		
		// Validate inputs
		if (args.length < 1) {
			System.out.println("You must enter a height as a command line argument.");
			System.exit(1);
		}
		
		try {
			
			int height = Integer.parseInt(args[0]);
			
			if (height < 1) {
				System.out.println("Height must be at least 1.");
				System.exit(2);
			}
			
			// Call recursive function and print output to the screen
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
		
		if (height == 1) { // Base case returning one since the only additional combination is to add a small shelf
			return 1;
		} else if (height == 2) { // Base case returning two since the only additional combinations left are a large shelf or two small shelves
			return 2;
		} else {
			return count(height - 1) + count(height - 2);
		}
		
	}
	
}
