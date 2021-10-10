package project_package;

public class coffee extends coffee_menu {

	// 1. 고객이 입력할 데이터는 다음과 같습니다.
	// 1. 종류, 뜨겁게/차갑게, 사이즈, 수량
	// 2. manage_coffee_list 에 해당 메뉴의 가격을 불러옵니다.

	String customer_picked_coffeeType;
	String customer_picked_coffeeHotorIce;
	String customer_picked_coffeeSize;
	int customer_picked_coffeeQuantity;
	int custmer_picked_coffeePrice;

	public coffee() {

	}

	/**
	 * @param customer_picked_coffeeType
	 * @param customer_picked_coffeeHotorIce
	 * @param customer_picked_coffeeSize
	 * @param customer_picked_coffeeQuantity
	 * @param custmer_picked_coffeePrice
	 */
	public coffee(String customer_picked_coffeeType, String customer_picked_coffeeHotorIce,
			String customer_picked_coffeeSize, int customer_picked_coffeeQuantity, int custmer_picked_coffeePrice) {
		super();
		this.customer_picked_coffeeType = customer_picked_coffeeType;
		this.customer_picked_coffeeHotorIce = customer_picked_coffeeHotorIce;
		this.customer_picked_coffeeSize = customer_picked_coffeeSize;
		this.customer_picked_coffeeQuantity = customer_picked_coffeeQuantity;
		this.custmer_picked_coffeePrice = custmer_picked_coffeePrice;
	}

	public String getCustomer_picked_coffeeType() {
		return customer_picked_coffeeType;
	}

	public void setCustomer_picked_coffeeType(String customer_picked_coffeeType) {
		this.customer_picked_coffeeType = customer_picked_coffeeType;
	}

	public String getCustomer_picked_coffeeHotorIce() {
		return customer_picked_coffeeHotorIce;
	}

	public void setCustomer_picked_coffeeHotorIce(String customer_picked_coffeeHotorIce) {
		this.customer_picked_coffeeHotorIce = customer_picked_coffeeHotorIce;
	}

	public String getCustomer_picked_coffeeSize() {
		return customer_picked_coffeeSize;
	}

	public void setCustomer_picked_coffeeSize(String customer_picked_coffeeSize) {
		this.customer_picked_coffeeSize = customer_picked_coffeeSize;
	}

	public int getCustomer_picked_coffeeQuantity() {
		return customer_picked_coffeeQuantity;
	}

	public void setCustomer_picked_coffeeQuantity(int customer_picked_coffeeQuantity) {
		this.customer_picked_coffeeQuantity = customer_picked_coffeeQuantity;
	}

}
