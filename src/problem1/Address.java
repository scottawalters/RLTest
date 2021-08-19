package problem1;

/**
 * Address object.  Stores a value name, address, city, and state.
 * @author Scott Walters
 *
 */
class Address {

	/** name line for the address */
	private String line1;
	/** street line for address */
	private String line2;
	/** city of the address */
	private String city;
	/** state of the address */
	private String state;
	
	/**
	 * Constructor for an Address object.  
	 * @param line1 name line
	 * @param line2 address line
	 * @param city city
	 * @param state state
	 */
	public Address(String line1, String line2, String city, String state) {
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.state = state;
	}

	// Getters and Setters
	/**
	 * @return the name line of the address
	 */
	public String getLine1() {
		return line1;
	}

	/**
	 * @return the street line of the address
	 */
	public String getLine2() {
		return line2;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param line1 the name line to set
	 */
	public void setLine1(String line1) {
		this.line1 = line1;
	}

	/**
	 * @param line2 the address line to set
	 */
	public void setLine2(String line2) {
		this.line2 = line2;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	/**
	 * Returns a string representation of an Address object.  Used for testing.
	 * @return string representation of an address
	 */
	@Override
	public String toString() {
		return "Address [line1=" + this.getLine1() + ", line2=" + this.getLine2() + ", city=" + this.getCity() + ", state=" + this.getState() + "]";
	}
}