package project_package;

import java.util.ArrayList;

public class dessert_menu extends admin_page {

	String dessertType;
	int dessertPrice;
	int dessertStock;

	static ArrayList<dessert> customer_dessertArray = new ArrayList<dessert>();

	/**
	 * @param dessertType
	 * @param dessertPrice
	 * @param dessertStock
	 */
	public dessert_menu(String dessertType, int dessertPrice, int dessertStock) {
		super();
		this.dessertType = dessertType;
		this.dessertPrice = dessertPrice;
		this.dessertStock = dessertStock;
	}

	public dessert_menu() {
	}

	public void customer_deesert_order_print() {
		for (dessert d : customer_dessertArray) {
			System.out.println("[ 주문내역 ] ");
			System.out.println("[디저트 주문] 종류 : " + d.getCustomer_picked_dessertName());
			System.out.println("[디저트 주문] 갯수 : " + d.getCustomer_picked_dessertQuantity());
			System.out.println();
		}

	}

	public static void dessert_mainPage() {
		System.out.println("[디저트 주문] 디저트를 주문하는 화면입니다. ");
		dessert_menu.order();

	}

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

	public static void dessert_order() {
		dessert des;
		// 1. 디저트를 주문받습니다.
		adminDessertList(); // 1. 관리자가 입력해둔 디저트 리스트를 출력해서 보여줍니다.
		System.out.println();
		System.out.print("[디저트 주문] 어떤 디저트를 주문하시겠습니까? : ");
		String d_name = project_Main.scanner.next();

		for (int i = 0; i < admin_dessertArray.size(); i++) {
			if (admin_dessertArray.get(i).getAdmin_dessertName().equals(d_name)) {
				int idx = admin_dessertArray.indexOf(d_name);
				System.out.print("[디저트 주문] 주문 수량 : ");
				int d_quantity = project_Main.scanner.nextInt();
				int d_price = admin_dessertArray.get(idx).getAdmin_dessertPrice();
				des = new dessert(d_name, d_quantity, d_price);
				customer_dessertArray.add(des);
				break;
			} else {
				System.out.println("[디저트 주문] 잘못된 입력입니다 ... ");
			}
		}

	}

	public String getDessertType() {
		return dessertType;
	}

	public void setDessertType(String dessertType) {
		this.dessertType = dessertType;
	}

	public int getDessertPrice() {
		return dessertPrice;
	}

	public void setDessertPrice(int dessertPrice) {
		this.dessertPrice = dessertPrice;
	}

	public int getDessertStock() {
		return dessertStock;
	}

	public void setDessertStock(int dessertStock) {
		this.dessertStock = dessertStock;
	}

}
