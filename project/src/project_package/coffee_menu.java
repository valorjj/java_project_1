package project_package;

import java.util.ArrayList;

/* ------ 소비자가 커피를 주문하는 화면을 출력합니다. ------- */

// 1. coffee 객체를 생성해서 customer_coffeeArray 에 담습니다. 

public class coffee_menu extends admin_page {

	String customer_picked_coffeeType;
	int customer_picked_coffeePrice;

	int customer_picked_coffeeQuantity;
	static ArrayList<coffee> customer_coffeeArray = new ArrayList<coffee>();

	// 빈 생성자
	public coffee_menu() {
	}

	// 1. 소비자의 주문 내역을 출력하는 메소드
	public void customer_coffee_order_print() {
		for (coffee c : customer_coffeeArray) {
			System.out.println("[ 주문내역 ]");
			System.out.println("[커피 주문] 종류 : " + c.getCustomer_picked_coffeeType());
			System.out.println("[커피 주문] Hot / Ice : " + c.getCustomer_picked_coffeeHotorIce());
			System.out.println("[커피 주문] 사이즈 : " + c.getCustomer_picked_coffeeSize());
			System.out.println("[커피 주문] 갯수 : " + c.getCustomer_picked_coffeeQuantity());
			System.out.println("[커피 주문] 가격 : " + c.getCustomer_picked_coffeePrice());
			System.out.println();
		}

	}

	// 1. 커피 주문창을 출력하는 메인 메소드
	public static void coffee_mainPage() {
		System.out.println("커피를 주문받는 화면입니다. ");
		coffee_menu.order();

	}

	// 2.
	public static void order() {

		boolean flag = true;

		while (flag) {
			System.out.print("[커피 주문] 1. 주문 | 2. 뒤로 : ");
			int userSelect = project_Main.scanner.nextInt();
			if (userSelect == 1) {
				// 1. 커피 혹은 디저트를 주문하는 메소드를 호출합니다.
				coffee_order();
			} else if (userSelect == 2) {
				System.out.println("[커피 주문] 이전 화면으로 돌아갑니다. ");
				flag = false;
			}
		}
	}

	// 3. 커피를 주문 받아서 customer_coffeeArray 에 저장하는 메소드
	public static void coffee_order() {

		coffee cof;

		adminCoffeeList(); // 1. 주문가능한 커피 리스트를 출력합니다.

		System.out.println();
		// 2. 커피 이름을 입력받아서 admin_coffeeArray 에 있는지 검사합니다.
		System.out.print("[커피 주문] 어떤 커피를 주문하시겠습니까? : ");
		String c_name = project_Main.scanner.next();

		// 3. 나머지 세부사항을 입력받습니다.
		for (int i = 0; i < admin_coffeeArray.size(); i++) {
			int idx = i;
			System.out.println("idx : " + idx);
			System.out.println("i : " + i);
			if (admin_coffeeArray.get(idx).getAdmin_coffeeName().equals(c_name)) {
				System.out.print("[커피 주문] Hot | Ice : ");
				String c_tempt = project_Main.scanner.next();
				System.out.print("[커피 주문] S | M | L : ");
				String c_size = project_Main.scanner.next();
				System.out.print("[커피 주문] 주문 수량 : ");
				int c_quantity = project_Main.scanner.nextInt();
				int c_price = admin_coffeeArray.get(idx).getAdmin_coffeePrice();
				System.out.println("c_price " + c_price);
				cof = new coffee(c_name, c_tempt, c_size, c_quantity, c_price);
				System.out.println("type : " + cof.getCustomer_picked_coffeeType());
				System.out.println("price : " + cof.getCustomer_picked_coffeePrice());
				customer_coffeeArray.add(cof);
				break;
			} else {
				System.out.println("[커피 주문] 잘못된 입력입니다 ... ");
			}
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
