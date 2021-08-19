/**
 * Problem 3 for Replacements, Ltd. coding test.
 * 
 * A warehouse is being divided up with shelves. A large shelf takes up two stories of the
 * warehouse, and a small shelf takes up one story.
 * 
 * Write a function that, given the height (# of stories) of the warehouse, calculates the number of
 * different possible arrangements of shelves.
 * 
 * For example, if the warehouse is three stories high it can accommodate three different possible
 * arrangements of shelves: small-small-small, small-large, and large-small.
 */
package problem3;

/**
 * Program to determine the possible combination of small (1 unit tall) and large (2 unit tall) shelves that can make up a warehouse.  Requires a command line parameter specifying
 * the height of the building.
 * @author Scott Walters
 *
 */
public class CalculateArrangements {
	
	/**
	 * Starts the program.  Reads in building height, calls recursive function to do calculation, prints result to the screen.
	 * @param args command line arguments.  Requires an integer value for the height of the building.
	 */
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
	 * Recursive function to determine the number of possible combinations or large (2 unit tall) and small (1 unit small) shelves that could be used to populate a building.
	 * @param height the height of the building
	 * @return the number of possible combinations of shelves that could populate the building
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
