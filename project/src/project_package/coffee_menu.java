package project_package;

import java.util.ArrayList;

import java.util.List;

/* ------ 소비자가 커피를 주문하는 화면을 출력합니다. ------- */

public class coffee_menu extends admin_page {

	String customer_picked_coffeeType;
	int customer_picked_coffeePrice;
	int customer_picked_coffeeQuantity;
	static ArrayList<coffee> customer_coffeeArray = new ArrayList<coffee>();

	// 빈 생성자
	public coffee_menu() {
	}

	// 1. 커피를 주문하는 창을 띄우는 메소드입니다.
	public static void coffee_mainPage() {
		// 1. 커피를 주문받습니다.
		System.out.println("커피를 주문받는 화면입니다. ");
		coffee_menu.order();

	}

	public static void order() {

		boolean flag = true;

		while (flag) {
			System.out.print("1번. 주문 | 2번. 뒤로 : ");
			int userSelect = project_Main.scanner.nextInt();
			if (userSelect == 1) {
				// 1. 커피 혹은 디저트를 주문하는 메소드를 호출합니다.
				coffee_order();
			} else if (userSelect == 2) {
				System.out.println("이전화면으로 돌아갑니다. ");
				flag = false;
			}
		}
	}

	// 2. 커피를 주문받아서 customer 객체에 저장하는 메소드입니다.
		// 1. 저장할 데이터는 다음과 같습니다.
			// 1. 종류 2. Hot or Ice 3. 사이즈 4. 갯수

	public static void coffee_order() {
		
		coffee cof;

		adminCoffeeList(); // 1. 주문가능한 커피 리스트를 출력합니다.
		
		System.out.println();
		System.out.print("어떤 커피를 주문하시겠습니까? : ");
		String c_name = project_Main.scanner.next();
		if (admin_coffeeArray.contains(c_name)) {
			System.out.print("Hot or Ice : ");
			String c_tempt = project_Main.scanner.next();
			System.out.print("S | M | L : ");
			String c_size = project_Main.scanner.next();
			System.out.print("갯수 : ");
			int c_quantity = project_Main.scanner.nextInt();
			
			cof = new coffee(c_name, c_tempt, c_size, c_quantity);
			
			customer_coffeeArray.add(cof);
			
		}
	}

	/**
	 * @param customer_picked_coffeeType
	 * @param customer_picked_coffeePrice
	 * @param customer_picked_coffeeQuantity
	 */
	public coffee_menu(String customer_picked_coffeeType, int customer_picked_coffeePrice,
			int customer_picked_coffeeQuantity) {
		super();
		this.customer_picked_coffeeType = customer_picked_coffeeType;
		this.customer_picked_coffeePrice = customer_picked_coffeePrice;
		this.customer_picked_coffeeQuantity = customer_picked_coffeeQuantity;
	}

	public String getCustomer_picked_coffeeType() {
		return customer_picked_coffeeType;
	}

	public void setCustomer_picked_coffeeType(String customer_picked_coffeeType) {
		this.customer_picked_coffeeType = customer_picked_coffeeType;
	}

	public int getCustomer_picked_coffeePrice() {
		return customer_picked_coffeePrice;
	}

	public void setCustomer_picked_coffeePrice(int customer_picked_coffeePrice) {
		this.customer_picked_coffeePrice = customer_picked_coffeePrice;
	}

	public int getCustomer_picked_coffeeQuantity() {
		return customer_picked_coffeeQuantity;
	}

	public void setCustomer_picked_coffeeQuantity(int customer_picked_coffeeQuantity) {
		this.customer_picked_coffeeQuantity = customer_picked_coffeeQuantity;
	}

}
