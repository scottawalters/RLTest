/**
 * 
 */
package problem1;

/**
 * @author Scott Walters
 *
 */
class Item {
	@Override
	public String toString() {
		return "\nItem [quantity=" + this.getQuantity() + ", itemId=" + this.getItemId() + ", description=" + this.getDescription() + ", unitPrice="
				+ this.getUnitPrice() + ", getLineSum()=" + this.getLineSum() + "]";
	}

	int quantity;
	int itemId;
	String description;
	double unitPrice;
	
	public Item(int quantity, int itemId, String description, double unitPrice) {
		this.quantity = quantity;
		this.itemId = itemId;
		this.description = description;
		this.unitPrice = unitPrice;
	}
	
	protected double getLineSum() {
		return quantity * unitPrice;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @return the itemId
	 */
	public int getItemId() {
		return itemId;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the unitPrice
	 */
	public double getUnitPrice() {
		return unitPrice;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param unitPrice the unitPrice to set
	 */
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
}