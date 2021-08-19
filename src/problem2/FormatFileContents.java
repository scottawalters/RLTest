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
		
		if (args.length < 2) {
			System.out.println("Must specify command line arguments for <input file> <line width>.");
			System.exit(3);
		}
		
		String fileName = args[0];
		Path filePath = Path.of(fileName);
		
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
		
		String contents = "";
		
		try {
			contents = Files.readString(filePath);
		} catch (IOException e) {
			System.out.println("No file named " + fileName + " exists.");
			System.exit(1);		
		}
		
		contents = contents.replaceAll("\\r\\n|\\r|\\n", " ");
		
		while (contents.length() > 0) {
			
			String chunk = "";
			
			if (contents.length() > maxChars) {
				chunk = contents.substring(0, maxChars);
				contents = contents.substring(maxChars);
			} else {
				chunk = contents.substring(0, contents.length());
				contents = "";
			}
			
			if (chunk.charAt(chunk.length() - 2) == ' ' && Character.isLetter(chunk.charAt(chunk.length() - 1))) {
				contents = chunk.charAt(chunk.length() - 1) + contents;
				chunk = chunk.substring(0, maxChars - 1) + " ";
				System.out.println(chunk);
			} else if (Character.isLetter(chunk.charAt(chunk.length() - 1))) {
				contents = chunk.charAt(chunk.length() - 1) + contents;
				chunk = chunk.substring(0, chunk.length() - 1) + "-";
				System.out.println(chunk);
			} else {
				System.out.println(chunk);
			}
			
		}
		
	}

}
