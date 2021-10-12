package project_package;

public class payment extends customerOrder {

	/*
	 * 고객이 결제하는 페이지입니다.
	 * 
	 */

	public static void payment_mainpage() {
		admin_page admin = new admin_page();
		dessert_menu dessert = new dessert_menu();

		int val = payment.customer_payment();
		System.out.println("총 결제하실 금액 : " + val);
		System.out.println();
		System.out.print("결제를 진행하겠습니다. 얼마를 투입하시겠습니까? : ");
		int pay = project_Main.scanner.nextInt();
		if (pay >= val) {
			System.out.println("결제 후 잔액은 " + (pay - val) + " 입니다. ");
			System.out.println("결제가 완료되었습니다. 이용해 주셔서 감사합니다. ");

			// 결제가 완료되었다면 저장된 메뉴의 재고를 감소시켜야 합니다.
			inventory_refresh();

		} else {
			System.out.println("금액이 부족합니다. ");
			return;
		}

	}

	public payment() {
	}

	public static int customer_payment() {
		System.out.println("결제를 진행합니다. ");
		System.out.println("주문하신 메뉴는 다음과 같습니다. ");
		// 1. 고객이 주문한 메뉴를 출력합니다.
		customerOrder.order_print();
		int customerPayment = coffee_payment() + dessert_payment();
		System.out.println(customerPayment);
		return customerPayment;
	}

	// [주문] 고객이 지불할 커피 메뉴 항목의 금액을 산출하는 메소드입니다.
	public static int coffee_payment() {
		int c_money = 0;
		// 1. customer_coffeeArray 에는 고객이 주문한 커피 정보가 담겨있습니다.
		for (int i = 0; i < coffee_menu.customer_coffeeArray.size(); i++) {
			int var1 = coffee_menu.customer_coffeeArray.get(i).getCustomer_picked_coffeeQuantity();
			int var2 = coffee_menu.customer_coffeeArray.get(i).getCustomer_picked_coffeePrice();
			int multi = var1 * var2;
			c_money += multi;
		}
		return c_money;
	}

	// [주문] 고객이 지불할 디저트 메뉴 항목의 금액을 산출하는 메소드입니다.
	public static int dessert_payment() {
		int d_money = 0;
		// 1. 고객이 지불할 디저트 항목 금액입니다.

		for (int i = 0; i < dessert_menu.customer_dessertArray.size(); i++) {
			int var1 = dessert_menu.customer_dessertArray.get(i).getCustomer_picked_dessertPrice();
			int var2 = dessert_menu.customer_dessertArray.get(i).getCustomer_picked_dessertQuantity();
			int multi = var1 * var2;
			d_money += multi;
		}
		return d_money;
	}

	// [주문] 결제 완료 후, 재고를 감소시키는 메소드입니다.
	public static void inventory_refresh() {

		for (int i = 0; i < coffee_menu.customer_coffeeArray.size(); i++) {
			for (int k = 0; k < admin_page.admin_coffeeArray.size(); k++) {
				if (admin_page.admin_coffeeArray.get(k).getAdmin_coffeeName()
						.equals(coffee_menu.customer_coffeeArray.get(i).getCustomer_picked_coffeeType())) {
					int c_inventory_minus = coffee_menu.customer_coffeeArray.get(i).getCustomer_picked_coffeeQuantity();
					admin_page.admin_coffeeArray.get(k).setAdmin_coffeeInventory(
							admin_page.admin_coffeeArray.get(k).getAdmin_coffeeInventory() - c_inventory_minus);
				}
			}

		}

		for (int j = 0; j < dessert_menu.customer_dessertArray.size(); j++) {
			for (int w = 0; w < admin_page.admin_dessertArray.size(); w++) {
				if (admin_page.admin_dessertArray.get(w).getAdmin_dessertName()
						.equals(dessert_menu.customer_dessertArray.get(j).getCustomer_picked_dessertName())) {
					int d_inventory_minus = dessert_menu.customer_dessertArray.get(j)
							.getCustomer_picked_dessertQuantity();
					admin_page.admin_dessertArray.get(w).setAdmin_dessertInventory(
							admin_page.admin_dessertArray.get(w).getAdmin_dessertInventory() - d_inventory_minus);
				}

			}

		}
	}

}
