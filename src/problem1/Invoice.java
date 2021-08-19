/**
 * 
 */
package problem1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * @author Scott Walters
 *
 */
class Invoice {
	@Override
	public String toString() {
		return "Invoice\n" + "InvoiceNum=" + this.getInvoiceNum() + "\ndate=" + this.getFormattedDate() + "\n[client=\n" + client + "\n[company=\n" + company + "\nitems=" + items + "\ngetInvoiceSum()=" + this.getInvoiceSum() + "]";
		
	}

	Client client;
	Company company;
	int InvoiceNum;
	GregorianCalendar date;
	ArrayList<Item> items;
	
	public Invoice(Client client, Company company, int invoiceNum, GregorianCalendar date, ArrayList<Item> items) {
		this.client = client;
		this.company= company;
		this.InvoiceNum = invoiceNum;
		this.date = date;
		this.items = items;
	}
	
	private double getInvoiceSum() {
		double sum = 0;
		for (Item item : items) {
			sum = sum + item.getLineSum();
		}
		return sum;
	}

	/**
	 * @return the invoiceNum
	 */
	public int getInvoiceNum() {
		return InvoiceNum;
	}

	/**
	 * @return the date
	 */
	public String getFormattedDate() {
		return new SimpleDateFormat("MMMM dd, YYYY").format(date.getTime());
	}
	
	/**
	 * @return the date object
	 */
	public GregorianCalendar getDateObject() {
		return date;
	}

	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @return the company
	 */
	public Company getCompany() {
		return company;
	}

	/**
	 * @return the items
	 */
	public ArrayList<Item> getItems() {
		return items;
	}

}