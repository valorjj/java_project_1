package project_package;

import java.util.ArrayList;

public class dessert_menu extends admin_page {

	String dessertType;
	int dessertPrice;
	int dessertStock;

	static ArrayList<dessert> customer_coffeeArray = new ArrayList<dessert>();

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

	public static void dessert_mainPage() {
		System.out.println("커피를 주문하는 화면입니다. ");
		dessert_menu.order();

	}

	public static void order() {
		customerOrder customer;

		boolean flag = true;
		while (flag) {
			System.out.print("1번. 주문 | 2번. 뒤로 : ");
			int userSelect = project_Main.scanner.nextInt();
			if (userSelect == 1) {
				dessert_order();
			} else if (userSelect == 2) {
				System.out.println("이전화면으로 돌아갑니다. ");
				flag = false;
			}
		}
	}

	public static void dessert_order() {
		dessert des;
		// 1. 디저트를 주문받습니다.
		adminDessertList(); // 1. 관리자가 입력해둔 디저트 리스트를 출력해서 보여줍니다.
		System.out.print("어떤 디저트를 주문하시겠습니까? : ");
		String d_name = project_Main.scanner.next();
		for (int i = 0; i < project_Main.manage_dessert_list.size(); i++) {
			if (project_Main.manage_dessert_list.get(i)) {
				System.out.println("몇개나 주문하시겠습니까 ? : ");
				int d_quantity = project_Main.scanner.nextInt();

				des = new dessert(userSelect_dessert_name, userSelect_dessert_howmany);
				dessertArray[i] = des;
				customer_coffeeArray.add(des);

				System.out.println();
				break;
			} else {
				System.out.println("선택한 커피가 메뉴에 등록되어있지 않습니다. 관리자에게 문의하세요. ");
				break;
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

	public static dessert[] getDessertArray() {
		return dessertArray;
	}

	public static void setDessertArray(dessert[] dessertArray) {
		dessert_menu.dessertArray = dessertArray;
	}

}
