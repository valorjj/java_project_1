package project_package;

import java.util.ArrayList;

/* ------ 고객이 커피를 주문하는 화면을 출력합니다. ------- */

public class coffee_menu extends admin_page {

	int customer_picked_coffeePrice;
	static ArrayList<coffee> customer_coffeeArray = new ArrayList<coffee>();

	public coffee_menu() {
	}

	// 1. [고객] 주문 내역을 출력하는 메소드
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

	// 2. [고객] 메인 메소드
	public static void coffee_mainPage() {
		System.out.println("커피를 주문받는 화면입니다. ");
		coffee_menu.order();

	}

	// 3. [고객] 커피를 주문하는 창을 띄우는 메소드
	public static void order() {

		boolean flag = true;

		while (flag) {
			System.out.print("[커피 주문] 1. 주문 | 2. 뒤로 : ");
			int userSelect = project_Main.scanner.nextInt();
			if (userSelect == 1) {
				// 1. coffee_order() 메소드에서 실제로 커피를 주문 받습니다.
				coffee_order();
			} else if (userSelect == 2) {
				System.out.println("[커피 주문] 이전 화면으로 돌아갑니다. ");
				flag = false;
			}
		}
	}

	// 4. [고객] 커피를 주문 받아서 customer_coffeeArray 에 저장하는 메소드
	public static void coffee_order() {
		// 0. [고객] order() 메소드에 의해 호출됩니다.
		coffee cof;

		adminCoffeeList(); // 1. 주문가능한 커피 리스트를 출력합니다.
		System.out.println();

		// 2. [고객] 커피 이름을 입력받아서 admin_coffeeArray 에 있는지 검사합니다.
		System.out.print("[커피 주문] 어떤 커피를 주문하시겠습니까? : ");
		String c_name = project_Main.scanner.next();

		// 3. [고객] 입력된 값이 메뉴에 존재했을 경우 나머지 정보를 입력받습니다.
		for (int i = 0; i < admin_coffeeArray.size(); i++) {
			if (admin_coffeeArray.get(i).getAdmin_coffeeName().equals(c_name)) {

				/*
				 * cof 객체에는 이름, 온도, 사이즈, 주문수량, 가격 총 5개의 정보가 저장됩니다.
				 *
				 */
				System.out.print("[커피 주문] Hot | Ice : ");
				String c_tempt = project_Main.scanner.next();
				System.out.print("[커피 주문] S | M | L : ");
				String c_size = project_Main.scanner.next();
				System.out.print("[커피 주문] 주문 수량 : ");
				int c_quantity = project_Main.scanner.nextInt();
				int c_inventory = admin_coffeeArray.get(i).getAdmin_coffeeInventory();
				if (c_inventory < c_quantity) {
					System.out.println("재고가 부족합니다. ");
					break;
				} else {
					int c_price = admin_coffeeArray.get(i).getAdmin_coffeePrice();
					cof = new coffee(c_name, c_tempt, c_size, c_quantity, c_price);
					cof.setCustomer_picked_coffeePrice(c_price);

					// 1. 위에서 생성한 cof 객체는 최종적으로 customer_coffeeArray 에 저장됩니다.
					customer_coffeeArray.add(cof);
					// 2.coffee_mainPage 자체가 이미 메인 메소드안의 반복문에 위치하기 때문에 불필요한 반복을 막기 위해서 여기서 break 를
					// 걸어줍니다.
					break;

				}

			} else {
				// 1. 커피 이름이 메뉴에 존재하지 않는다면 에러 메시지를 출력합니다.
				System.out.println("[커피 주문] 잘못된 입력입니다. ");
			}
		}
	}

	public int getCustomer_picked_coffeePrice() {
		return customer_picked_coffeePrice;
	}

	public void setCustomer_picked_coffeePrice(int customer_picked_coffeePrice) {
		this.customer_picked_coffeePrice = customer_picked_coffeePrice;
	}

}
