package project_package;

public class customerOrder {

	public customerOrder() {

	}

	public static void order_print() {
		coffee_menu cm = new coffee_menu();
		// 1. 주문한 커피 내역을 출력합니다.
		System.out.println("------- [주문 내역] --------- ");
		System.out.println("[커피] >>> ");
		cm.customer_coffee_order_print();
		System.out.println("[디저트] >>> ");
		dessert_menu dm = new dessert_menu();

	}

}
