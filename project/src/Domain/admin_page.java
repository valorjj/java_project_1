package Domain;

import View.*;

public class admin_page {

	String admin_Id = "admin";
	String admin_password = "1234";

	//
	public admin_page(String admin_Id, String admin_password) {
		this.admin_Id = admin_Id;
		this.admin_password = admin_password;
	}

	// 관리자 계정으로 로그인하는 메소드입니다.
	// 관리자 계정, 관리자 비밀번호는 미리 정해져있습니다.
	public static boolean admin_logIn() {
		admin_page admin = new admin_page();

		System.out.println("관리자 계정 아이디 : ");
		String id = main.scanner.next();
		System.out.println("관리자 계정 비밀번호 : ");
		String password = main.scanner.next();

		if (admin.getAdmin_Id().equals(id) && admin.getAdmin_password().equals(password)) {
			// 관리자 아이디와 비밀번호가 일치할 하면 로그인 성공
			System.out.println("관리자 계정으로 로그인되셨습니다. ");
			return true;
		}

		return false;
	}

	// 빈 생성자
	public admin_page() {
	}

	// 1. 관리자 메인 화면 출력하는 메소드입니다.
	public static void adminMenu() {

		coffee_menu coffee = new coffee_menu();
		dessert_menu dessert = new dessert_menu();

		if (admin_logIn()) { // 1. 아이디 & 비밀번호가 일치해야 관리자 메뉴 실행시킵니다.
			System.out.println("관리자 메뉴입니다. ");
			System.out.println("메뉴를 선택하세요. ");
			boolean run = true;

			while (run) {
				System.out.print("1번. 메뉴 추가 | 2번. 메뉴 수정 | 3번. 메뉴 삭제 | 4번. 프로그램 종료 >>> ");
				int adminSelect = main.scanner.nextInt();
				// 1. 관리자가 메뉴를 추가합니다.
				if (adminSelect == 1) {
					System.out.print("메뉴를 추가합니다. ");
					System.out.println("어떤 메뉴를 추가하시겠습니까? 1번. 커피 | 2번. 디저트 >>> ");
					int adminSelect2 = main.scanner.nextInt();
					// 1번 선택 시 커피 리스트에 메뉴를 추가합니다.
					if (adminSelect2 == 1) {
						System.out.println("커피 메뉴 추가하는 화면입니다. ");

						adminAddCoffeeMenu();

					}
					// 2번 선택 시 디저트 리스트에 메뉴를 추가합니다.
					else if (adminSelect2 == 2) {
						System.out.println("디저트 메뉴 추가하는 화면입니다. ");
						adminAddDessert();
					}

					else {
						System.out.println("잘못된 입력입니다. ");
					}

				}
				// 2. 관리자가 메뉴를 수정합니다.
				else if (adminSelect == 2) {

				}
				// 3. 관리자가 메뉴를 삭제합니다.
				else if (adminSelect == 3) {

				}
				// 4. 프로그램을 종료합니다.
				else if (adminSelect == 4) {
					System.out.println("관리자 메뉴를 종료합니다. ");
					run = false;

				}
				// 5. 1~4번 값이 아닌경우 에러 메시지를 출력합니다.
				else {
					System.out.println("유효하지 않은 입력입니다. ");
				}
			}
		}

	}

	// 2. 중복메뉴가 있는지 체크하는 메소드입니다.
	public static boolean adminMenuCheck(String name) {
		for (int i = 0; i < main.coffeeList.length; i++) {
			if (main.coffeeList[i].getCoffeeType().equals(name) || main.dessertList[i].getDessert_name().equals(name)) {
				// 둘중 하나라도 겹치는 경우에는
				System.out.println("중복입니다. ");
				return false; // 중복인 경우에는 false 를 리턴합니다.
			}
		}
		return true; // 중복이 아닌 경우에는 true 를 리턴합니다.
	}

	// 3. 커피 메뉴를 추가하는 메소드입니다.
	public static void adminAddCoffeeMenu() {
		coffee_menu coffee;
		System.out.println("새로운 커피를 추가하는 화면입니다. ");
		System.out.print("커피 이름 : >>> ");
		String c_name = main.scanner.next();
		if (adminMenuCheck(c_name)) { // 커피 이름이 기존의 리스트와 중복되지 않습니다.
			System.out.print("커피 가격 : >>> ");
			String c_price = main.scanner.next();
			System.out.print("커피 재고 : >>> ");
			String c_stock = main.scanner.next();
			coffee = new coffee_menu(c_name, c_price, c_stock);
			for (int i = 0; i < main.coffeeList.length; i++) {
				if (main.coffeeList[i] != null) {
					main.coffeeList[i] = coffee; // 비어있는 coffeeList 에 추가합니다.
				}
			}
		} else {
			System.out.println("입력된 메뉴는 이미 존재하는 메뉴입니다. ");
		}

	}

	// 4. 디저트 메뉴를 추가하는 메소드입니다.
	public static void adminAddDessert() {
		dessert_menu dessert;
		System.out.println("디저트 이름 : ");
		String d_name = main.scanner.next();
		if (adminMenuCheck(d_name)) { // 디저트 이름이 기존 리스트와 중복되지 않습니다.
			System.out.println(d_name + " 커피 가격 : ");
			String d_price = main.scanner.next();
			System.out.println(d_name + " 커피 재고 : ");
			String d_stock = main.scanner.next();

			dessert = new dessert_menu(d_name, d_price, d_stock); // coffee 객체를 생성합니다.
			for (int i = 0; i < main.coffeeList.length; i++) {
				if (main.dessertList[i] != null) {
					main.dessertList[i] = dessert; // 비어있는 coffeeList 에 추가합니다.
				}
			}
		} else {
			System.out.println("입력된 메뉴는 이미 존재하는 메뉴입니다. ");
		}

	}

	// 5. 커피 메뉴를 삭제하는 메소드입니다.
	public void adminDeleteCoffeeMenu() {

	}

	// 6. 디저트 메뉴를 삭제하는 메소드입니다.
	public void adminDeleteDessertMenu() {

	}

	public String getAdmin_Id() {
		return admin_Id;
	}

	public void setAdmin_Id(String admin_Id) {
		this.admin_Id = admin_Id;
	}

	public String getAdmin_password() {
		return admin_password;
	}

	public void setAdmin_password(String admin_Password) {
		this.admin_password = admin_Password;
	}

}
