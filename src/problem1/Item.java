package problem1;

/**
 * Item object.  Stores the itemID, quantity, description, and price.
 * @author Scott Walters
 *
 */
class Item {

	private int quantity;
	private int itemId;
	private String description;
	private double unitPrice;
	
	/**
	 * Constructor for an Item object.  
	 * @param quantity quantity of items
	 * @param itemId item ID number
	 * @param description item description
	 * @param unitPrice price per individual unit of the item
	 */
	public Item(int quantity, int itemId, String description, double unitPrice) {
		this.quantity = quantity;
		this.itemId = itemId;
		this.description = description;
		this.unitPrice = unitPrice;
	}
	
	/**
	 * Calculates the total price for the line item by multiplying quantity times unit cost.
	 * @return total price for line item
	 */
	protected double getLineSum() {
		return quantity * unitPrice;
	}

	// Getters and Setters
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
	
	/**
	 * Returns a string representation of an Item object.  Used for testing.
	 * @return string representation of an item
	 */
	@Override
	public String toString() {
		return "\nItem [quantity=" + this.getQuantity() + ", itemId=" + this.getItemId() + ", description=" + this.getDescription() + ", unitPrice="
				+ this.getUnitPrice() + ", getLineSum()=" + this.getLineSum() + "]";
	}
}