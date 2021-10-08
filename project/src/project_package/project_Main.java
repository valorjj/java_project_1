package project_package;

import java.util.Scanner;

public class project_Main {

	public static Scanner scanner = new Scanner(System.in);
	public static coffee_menu[] coffeeList = new coffee_menu[30];
	public static dessert_menu[] dessertList = new dessert_menu[30];

	public static customerOrder[] shoppingCart = new customerOrder[100];

	public static void main(String[] args) {

		admin_page adminPage = new admin_page();
		coffee_menu coffeeMenu = new coffee_menu();
		dessert_menu dessertMenu = new dessert_menu();

		System.out.println("메인 실행 화면입니다. ");
		boolean flag = true;
		while (flag) {

			System.out.print("1번. 주문화면 | 2. 관리자 메뉴 | 3. 프로그램 종료 ");
			int userChoice1 = scanner.nextInt();

			if (userChoice1 == 1) { // 1. 주문 화면 출력

				boolean flag2 = true;
				while (flag2) {
					System.out.println("1번. 커피 | 2번. 디저트 3번. 주문완료 >>> ");
					int userChoice2 = scanner.nextInt();
					if (userChoice2 == 1) {
						// 1번. 커피 주문하는 화면 출력
						
					} 
					else if (userChoice2 == 2) {
						// 2번. 디저트 주문하는 화면 출력
						dessertMenu.dessert_mainPage();;
					}
					else {
						System.out.println("잘못된 입력입니다. ");
						flag2 = false;
					}
				}
			} else if (userChoice1 == 2) { // 2. 관리자 화면 출력
				adminPage.adminMenu();
			} else if (userChoice1 == 3) { // 3. 프로그램 종료
				System.out.println("프로그램을 종료합니다. ");
				flag = false;
			} else {
				System.out.println("잘못된 입력입니다. ");
			}

		}

	}

}
