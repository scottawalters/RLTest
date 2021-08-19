/**
 * 
 */
package problem1;

/**
 * @author Scott Walters
 *
 */
class Company {
	@Override
	public String toString() {
		return "Company [address=" + address + "]";
	}

	Address address;
	
	public Company(Address address) {
		this.address = address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
}