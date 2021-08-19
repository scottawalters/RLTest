package problem1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Invoice object.  Stores a Client, Company, Invoice Number, Date, and an ArrayList of items.
 * @author Scott Walters
 *
 */
class Invoice {
	
	private Client client;
	private Company company;
	private int InvoiceNum;
	private GregorianCalendar date;
	private ArrayList<Item> items;
	
	/**
	 * Constructor for an Invoice object.
	 * @param client the client associated with the invoice
	 * @param company the company providing the invoice
	 * @param invoiceNum the invoice number
	 * @param date date of the invoice
	 * @param items list of items included in the invoice
	 */
	public Invoice(Client client, Company company, int invoiceNum, GregorianCalendar date, ArrayList<Item> items) {
		this.client = client;
		this.company= company;
		this.InvoiceNum = invoiceNum;
		this.date = date;
		this.items = items;
	}
	
	/**
	 * Calculate the total dollar amount for the entire invoice.  Calculated by adding together the sum from each line item.
	 * @return the total dollar amount of the invoice
	 */
	private double getInvoiceSum() {
		double sum = 0;
		for (Item item : items) {
			sum = sum + item.getLineSum();
		}
		return sum;
	}

	// Getters and Setters
	/**
	 * @return the invoiceNum
	 */
	public int getInvoiceNum() {
		return InvoiceNum;
	}

	/**
	 * Returns a formatted string representation of the date.  Used for populating date field on invoice.
	 * @return the formatted date
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

	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(Company company) {
		this.company = company;
	}

	/**
	 * @param invoiceNum the invoiceNum to set
	 */
	public void setInvoiceNum(int invoiceNum) {
		InvoiceNum = invoiceNum;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(GregorianCalendar date) {
		this.date = date;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	
	/**
	 * Returns a string representation of an Invoice object.  Used for testing.
	 * @return string representation of an invoice
	 */
	@Override
	public String toString() {
		return "Invoice\n" + "InvoiceNum=" + this.getInvoiceNum() + "\ndate=" + this.getFormattedDate() + "\n[client=\n" + client + "\n[company=\n" + company + "\nitems=" + items + "\ngetInvoiceSum()=" + this.getInvoiceSum() + "]";
		
	}


}