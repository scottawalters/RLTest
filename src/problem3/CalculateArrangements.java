/**
 * 
 */
package problem3;

/**
 * @author Scott Walters
 *
 */
public class CalculateArrangements {
	
	static int sol = 0;

	public static void main(String[] args) {
		
		if (args.length < 1) {
			System.out.println("You must enter a height as a command line argument.");
			System.exit(1);
		}
		
		try {
			int height = Integer.parseInt(args[0]);
			count(height);
			System.out.println(sol);

		} catch (NumberFormatException e) {
			System.out.println("The height entered must be an integer.");
			System.exit(2);
		}
		
	}
	

	private static void count(int height) {
		
		if (height <= 0) {
			return;
		} else if (height == 1) {
			sol++;
			return;
		} else if (height == 2) {
			sol = sol + 2;
			return;
		} else {
			count(height - 1);
			count(height - 2);
		}
		
	}
	
}
