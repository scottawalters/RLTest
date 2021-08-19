/**
 * Problem 2 for Replacements, Ltd. coding test.
 * 
 * Given 2 inputs – 1) filename and 2) max # of characters per line, take the contents of the input
 * file and format its contents so that there are exactly input2 characters per line. If a word must
 * be split between two lines, split using a dash. If the first character of a word is the last character
 * on a line, add a blank space instead and move the entire word to the next new line. It is OK for a
 * blank space to end a line.
 * 
 * Sample Example:
 * 
 * Filename: Testfile.txt
 * Max Characters: 10
 * 
 * Testfile.txt contents:
 * This is a great job. I love programming and the challenges it
 * brings. Solving problems is what I love to do.
 * 
 * Output:
 * This is a
 * great job.
 * I love
 * programmi-
 * ng and th-
 * e challen-
 * ges it br-
 * ings. So-
 * ving prob-
 * lems is w-
 * hat I lov-
 * e to do.
 */
package problem2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Program to apply word wrap to a given text file.  Takes in command line parameters for a text file to format and a width for the text to be displayed.  
 * Hyphenates words that wrap from one line to the next. Prevents the first character of a word from ending a line.
 * @author Scott Walters
 *
 */
public class FormatFileContents {

	/**
	 * Runs the program. Reads in the text file.  Applies the word wrap.  Prints out results to the screen.
	 * Requires a command line argument for a text file and an integer width.
	 * @param args command line arguments.
	 */
	public static void main(String[] args) {
		
		// Validate command line parameters and read into vars
		if (args.length < 2) {
			System.out.println("Must specify command line arguments for <input file> <line width>.");
			System.exit(3);
		}
		
		int maxChars = 0;
		try {
			maxChars = Integer.parseInt(args[1]);
		} catch (NumberFormatException e) {
			System.out.println("The width entered must be an integer.");
			System.exit(4);
		}
		
		if (maxChars < 2) {
			System.out.println("Characters per line must be greater than 1.");
			System.exit(2);
		}
		
		// Read file contents into variable and ensure file exists
		String contents = "";
		String fileName = args[0];
		
		try {
			Path filePath = Path.of(fileName);
			contents = Files.readString(filePath);
		} catch (IOException e) {
			System.out.println("No file named " + fileName + " exists, or could not be read.");
			System.exit(1);		
		}
		
		// Strip out newline and carriage return characters
		contents = contents.replaceAll("\\r\\n|\\r|\\n", " ");
		
		// Read file contents, maxChars at a time
		while (contents.length() > 0) {
			
			String chunk = "";
			
			// Capture maxChars of the file text as chunk, or the remaining text from the file if less than maxChars remains
			if (contents.length() > maxChars) {
				chunk = contents.substring(0, maxChars);
				contents = contents.substring(maxChars);
			} else {
				chunk = contents.substring(0, contents.length());
				contents = "";
			}
			
			// Check last 2 digits of chunk to be sure a new word does not start at end of line
			if (chunk.charAt(chunk.length() - 2) == ' ' && Character.isLetter(chunk.charAt(chunk.length() - 1))) {
				contents = chunk.charAt(chunk.length() - 1) + contents;
				chunk = chunk.substring(0, maxChars - 1) + " ";
			} else if (Character.isLetter(chunk.charAt(chunk.length() - 1))) { // Add hyphen in word needs to wrap
				contents = chunk.charAt(chunk.length() - 1) + contents;
				chunk = chunk.substring(0, chunk.length() - 1) + "-";
			}
			
			// Output the line of text to the screen
			System.out.println(chunk);
			
		}
		
	}

}
