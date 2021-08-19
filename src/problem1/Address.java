/**
 * 
 */
package problem1;

/**
 * @author Scott Walters
 *
 */
class Address {

	@Override
	public String toString() {
		return "Address [line1=" + this.getLine1() + ", line2=" + this.getLine2() + ", city=" + this.getCity() + ", state=" + this.getState() + "]";
	}

	String line1;
	String line2;
	String city;
	String state;
	
	public Address(String line1, String line2, String city, String state) {
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.state = state;
	}

	/**
	 * @return the line1
	 */
	public String getLine1() {
		return line1;
	}

	/**
	 * @return the line2
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
	 * @param line1 the line1 to set
	 */
	public void setLine1(String line1) {
		this.line1 = line1;
	}

	/**
	 * @param line2 the line2 to set
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
}