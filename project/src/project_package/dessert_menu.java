package project_package;

import java.util.ArrayList;

/* ------ 고객이 디저트를 주문하는 화면을 출력합니다. ------- */

public class dessert_menu extends admin_page {

	int customer_picked_dessertPrice;
	static ArrayList<dessert> customer_dessertArray = new ArrayList<dessert>();

	public dessert_menu() {
	}

	// 1. [고객] 디저트 주문 내역을 출력하는 메소드
	public void customer_deesert_order_print() {
		for (dessert d : customer_dessertArray) {
			System.out.println("[ 주문내역 ] ");
			System.out.println("[디저트 주문] 종류 : " + d.getCustomer_picked_dessertName());
			System.out.println("[디저트 주문] 갯수 : " + d.getCustomer_picked_dessertQuantity());
			System.out.println();
		}

	}

	// 2. [고객] 디저트 주문의 메인 페이지
	public static void dessert_mainPage() {
		System.out.println("[디저트 주문] 디저트를 주문하는 화면입니다. ");
		dessert_menu.order();

	}

	// 3. [고객] 디저트 주문하는 페이지
	public static void order() {
		customerOrder customer;

		boolean flag = true;
		while (flag) {
			System.out.print("[디저트 주문] 1. 주문 | 2. 뒤로 : ");
			int userSelect = project_Main.scanner.nextInt();
			if (userSelect == 1) {
				dessert_order();
			} else if (userSelect == 2) {
				System.out.println("[디저트 주문] 이전 면으로 돌아갑니다. ");
				flag = false;
			}
		}
	}

	// 4. [고객] 디저트 주문하는 상세 페이지
	public static void dessert_order() {
		dessert des;
		adminDessertList();
		System.out.println();
		System.out.print("[디저트 주문] 어떤 디저트를 주문하시겠습니까? : ");
		String d_name = project_Main.scanner.next();
		for (int i = 0; i < admin_dessertArray.size(); i++) {
			if (admin_dessertArray.get(i).getAdmin_dessertName().equals(d_name)) {
				System.out.print("[디저트 주문] 주문 수량 : ");
				int d_quantity = project_Main.scanner.nextInt();
				int d_inventory = admin_dessertArray.get(i).getAdmin_dessertInventory();
				if (d_inventory < d_quantity) {
					System.out.println("재고가 부족합니다. ");
					break;
				} else {
					int d_price = admin_dessertArray.get(i).getAdmin_dessertPrice();
					des = new dessert(d_name, d_quantity, d_price);
					des.setCustomer_picked_dessertPrice(d_price);
					customer_dessertArray.add(des);
					break;
				}

			} else {
				System.out.println("[디저트 주문] 잘못된 입력입니다. ");
			}
		}
	}

	public int getCustomer_picked_dessertPrice() {
		return customer_picked_dessertPrice;
	}

	public void setCustomer_picked_dessertPrice(int customer_picked_dessertPrice) {
		this.customer_picked_dessertPrice = customer_picked_dessertPrice;
	}

}
