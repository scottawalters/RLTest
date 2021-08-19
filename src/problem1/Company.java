/**
 * 
 */
package problem1;

/**
 * Company object. Stores an Address object.
 * @author Scott Walters
 *
 */
class Company {

	/** address of the company */
	private Address address;
	
	/**
	 * Constructor for a Company object.
	 * @param address the address of the company
	 */
	public Company(Address address) {
		this.address = address;
	}

	// Getters and Setters
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
	/**
	 * Returns a string representation of a Company object.  Used for testing.
	 * @return string representation of a company
	 */
	@Override
	public String toString() {
		return "Company [address=" + address + "]";
	}

}