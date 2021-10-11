package project_package;



public class dessert {

	String customer_picked_dessertName;
	int customer_picked_dessertQuantity;
	int customer_picked_dessertPrice;

	public dessert() {

	}

	/**
	 * @param customer_picked_dessertName
	 * @param customer_picked_dessertQuantity
	 * @param customer_picked_dessertPrice
	 */
	public dessert(String customer_picked_dessertName, int customer_picked_dessertQuantity,
			int customer_picked_dessertPrice) {
		super();
		this.customer_picked_dessertName = customer_picked_dessertName;
		this.customer_picked_dessertQuantity = customer_picked_dessertQuantity;
		this.customer_picked_dessertPrice = customer_picked_dessertPrice;
	}

	public String getCustomer_picked_dessertName() {
		return customer_picked_dessertName;
	}

	public void setCustomer_picked_dessertName(String customer_picked_dessertName) {
		this.customer_picked_dessertName = customer_picked_dessertName;
	}

	public int getCustomer_picked_dessertQuantity() {
		return customer_picked_dessertQuantity;
	}

	public void setCustomer_picked_dessertQuantity(int customer_picked_dessertQuantity) {
		this.customer_picked_dessertQuantity = customer_picked_dessertQuantity;
	}

	public int getCustomer_picked_dessertPrice() {
		return customer_picked_dessertPrice;
	}

	public void setCustomer_picked_dessertPrice(int customer_picked_dessertPrice) {
		this.customer_picked_dessertPrice = customer_picked_dessertPrice;
	}
	
	

}
