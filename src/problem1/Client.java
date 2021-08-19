/**
 * 
 */
package problem1;

/**
 * @author Scott Walters
 *
 */
class Client {
	@Override
	public String toString() {
		return "Client [customerNo=" + this.getCustomerNo() + ", address=" + address + "]";
	}

	int customerNo;
	Address address;
	
	public Client(int customerNo, Address address) {
		this.customerNo = customerNo;
		this.address = address;
	}

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

}