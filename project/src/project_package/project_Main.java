package project_package;

import java.util.ArrayList;
import java.util.Scanner;

public class project_Main {

	/*
	 * 관리자 등록하는 메뉴 고객이 주문하는 목록
	 * 
	 * 
	 */

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		// 1. 해당 클래스의 메소드를 전부 static 영역으로 지정해뒀기 때문에
		// 새로운 생성자를 만들 필요가 없습니다.

//		admin_page adminPage = new admin_page();
//		coffee_menu coffeeMenu = new coffee_menu();
//		dessert_menu dessertMenu = new dessert_menu();

		System.out.println("메인 실행 화면입니다. ");
		boolean flag = true;
		while (flag) {

			System.out.print("1번. 주문화면 | 2. 관리자 메뉴 | 3. 프로그램 종료 ");
			int userChoice1 = scanner.nextInt();

			if (userChoice1 == 1) { // 1. 주문 화면 출력

				boolean flag2 = true;
				while (flag2) {
					System.out.print("1번. 커피 | 2번. 디저트 3번. 장바구니 >>> ");
					int userChoice2 = scanner.nextInt();
					if (userChoice2 == 1) {
						// 1. 커피 주문하는 화면 출력
						coffee_menu.coffee_mainPage();

					}

					else if (userChoice2 == 2) {
						// 2. 디저트 주문하는 화면 출력
						dessert_menu.dessert_mainPage();

					}

					else if (userChoice2 == 3) {
						// 3. 주문을 완료하고 결과를 출력합니다.
						System.out.println("주문결과입니다. ");
						customerOrder.order_print();
						System.out.println("결제를 진행합니다. ");
						payment.payment_mainpage();
					}

					else {
						System.out.println("잘못된 입력입니다. ");
						flag2 = false;
					}
				}
			} else if (userChoice1 == 2) { // 2. 관리자 화면 출력
				admin_page.adminMenu();
			} else if (userChoice1 == 3) { // 3. 프로그램 종료
				System.out.println("프로그램을 종료합니다. ");
				flag = false;
			} else {
				System.out.println("잘못된 입력입니다. ");
			}

		}

	}

}
