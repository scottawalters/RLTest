/**
 * Problem 1 for Replacements, Ltd. coding test.
 */
package problem1;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Test driver for Invoice.java.  Constructs an Invoice object with sample data. Then prints stored Invoice data.
 * @author Scott Walters
 */
public class InvoiceDriver {

	/**
	 * Constructs Address, Company, Client, Item, and Invoice objects with sample data. Then prints stored Invoice data.
	 * @param args command line arguments (ignored)
	 */
	public static void main(String[] args) {
		
		// Construct sample objects
		Address compAddress = new Address("International Widgets", "742 Evergreen Terrace", "Springfield", "MO");
		Address custAddress = new Address("Foo, Inc.", "23 Main St.", "Thorpleburg", "TX");
		Client client = new Client(56, custAddress);
		Company company = new Company(compAddress);
		int invoiceNum = 125;
		GregorianCalendar date = new GregorianCalendar(2002, 8, 13);
		ArrayList<Item> items = new ArrayList<Item>();
		items.add(new Item(4, 563, "56\" Blue Freen", 3.50));
		items.add(new Item(32, 851, "Spline End (Xtra Large)", .25));
		items.add(new Item(5, 692, "3\" Red Freen", 12.00));
		Invoice i = new Invoice(client, company, invoiceNum, date, items);
		
		// Print out data stored in Invoice object
		System.out.println(i);
		
	}
	
}
