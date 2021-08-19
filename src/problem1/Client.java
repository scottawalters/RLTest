package problem1;

/**
 * Client object.  Stores a customer name and address.
 * @author Scott Walters
 *
 */
class Client {

	private int customerNo;
	private Address address;
	
	/**
	 * Constructor for a Client object.
	 * @param customerNo Customer Number
	 * @param address Customer Address
	 */
	public Client(int customerNo, Address address) {
		this.customerNo = customerNo;
		this.address = address;
	}

	// Getters and Setters
	/**
	 * @return the customerNo
	 */
	public int getCustomerNo() {
		return customerNo;
	}
	
	/**
	 * @return the customer address
	 */
	public Address getAddress() {
		return this.address;
	}

	/**
	 * @param customerNo the customerNo to set
	 */
	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
	/**
	 * Returns a string representation of a Client object.  Used for testing.
	 * @return string representation of a client
	 */
	@Override
	public String toString() {
		return "Client [customerNo=" + this.getCustomerNo() + ", address=" + address + "]";
	}

}