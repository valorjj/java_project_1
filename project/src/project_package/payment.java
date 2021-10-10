package project_package;

public class payment extends customerOrder {

	/*
	 * customerOrder 를 상속받습니다. customerOrder 데이터를 호출하여 최종적으로 결제할 금액 project_Main 에
	 * coffeeList, dessertList 의 stock 을 조정합니다.
	 */

	int coffeePayment;
	int dessertPayment;

	public static void payment_mainpage() {
		int val = payment.customer_payment();
		System.out.println("총 결제하실 금액 : " + val);
		System.out.println();
		System.out.print("결제를 진행하겠습니다. 얼마를 투입하시겠습니까? >>> ");
		int pay = project_Main.scanner.nextInt();
		if (pay >= val) {
			System.out.println("결제가 완료되었습니다. 이용해 주셔서 감사합니다. ");
		} else {
			System.out.println("금액이 부족합니다. ");
		}

	}

	public payment() {
	}

	public static int customer_payment() {
		payment p = new payment();
		System.out.println("결제를 진행합니다. ");
		System.out.println("주문하신 메뉴는 다음과 같습니다. ");
		// 1. 고객이 주문한 메뉴를 출력합니다.
		customerOrder.order_print();
		p = new payment(p.getCoffeePayment(), p.getDessertPayment());
		int customerPayment = p.coffeePayment + p.dessertPayment;
		System.out.println(customerPayment);
		return customerPayment;
	}

	// 1. 고객이 지불할 커피 메뉴 항목의 금액을 산출하는 메소드입니다.
	public static void coffee_payment() {
		payment p = new payment();
		int c_money = 0;
		// 1. customer_coffeeArray 에는 고객이 주문한 커피 정보가 담겨있습니다. 
		for (int i = 0; i < coffee_menu.customer_coffeeArray.size(); i++) {
			int var1 = coffee_menu.customer_coffeeArray.get(i).getCustomer_picked_coffeeQuantity();
			int var2 = coffee_menu.customer_coffeeArray.get(i).getCustomer_picked_coffeePrice();
			int multi = var1 * var2;
			c_money += multi;
		}
		p.setCoffeePayment(c_money);
	}

	public static void dessert_payment() {

		payment p = new payment();
		int d_money = 0;
		// 1. 고객이 지불할 디저트 항목 금액입니다.

		for (int i = 0; i < dessert_menu.customer_dessertArray.size(); i++) {
			int var1 = dessert_menu.customer_dessertArray.get(i).getCustomer_picked_dessertPrice();
			int var2 = dessert_menu.customer_dessertArray.get(i).getCustomer_picked_dessertQuantity();
			int multi = var1 * var2;
			d_money += multi;
		}
		p.setDessertPayment(d_money);
	}

	/**
	 * @param coffeePayment
	 * @param dessertPayment
	 */
	public payment(int coffeePayment, int dessertPayment) {
		super();
		this.coffeePayment = coffeePayment;
		this.dessertPayment = dessertPayment;
	}

	public int getCoffeePayment() {
		return coffeePayment;
	}

	public void setCoffeePayment(int coffeePayment) {
		this.coffeePayment = coffeePayment;
	}

	public int getDessertPayment() {
		return dessertPayment;
	}

	public void setDessertPayment(int dessertPayment) {
		this.dessertPayment = dessertPayment;
	}

}
