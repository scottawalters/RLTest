/**
 * 
 */
package problem2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author Scott Walters
 *
 */
public class FormatFileContents {

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
