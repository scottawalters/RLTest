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
}