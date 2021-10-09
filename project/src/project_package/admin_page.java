package project_package;

import java.util.ArrayList;

public class admin_page {

	/*
	 * 관리자 페이지입니다. 편의상 관리자 아이디, 패스워드는 미리 입력되어있습니다.
	 * 
	 */

	String admin_Id = "admin";
	String admin_password = "1234";

	static ArrayList<admin_coffee> admin_coffeeArray = new ArrayList<>();
	static ArrayList<admin_dessert> admin_dessertArray = new ArrayList<>();

	// 빈 생성자
	public admin_page() {
	}

	// 0. 관리자 계정으로 로그인하는 메소드입니다.
	// 1. 관리자 계정은 편의상 "admin", "1234" 로 미리 입력되어있습니다.
	public static boolean admin_logIn() {
		admin_page admin = new admin_page(); // 1. admin 객체 생성

		System.out.print("관리자 계정 아이디 : ");
		String id = project_Main.scanner.next();
		System.out.print("관리자 계정 비밀번호 : ");
		String password = project_Main.scanner.next();
		// 2. admin 계정 정보와 입력하는지 검사
		if (admin.getAdmin_Id().equals(id) && admin.getAdmin_password().equals(password)) {
			// 3. 관리자 아이디와 비밀번호가 일치할 하면 로그인 성공
			System.out.println("관리자 계정으로 로그인되셨습니다. ");
			// 4. 로그인에 성공하면 true 값을 리턴한다.
			return true;
		} else {
			// 5. 아이디 혹은 비밀번호가 일치하지 않을 시 오류 메세지 출력
			System.out.println("잘못입력 하셨습니다. ");
		}
		// 6. 로그인에 실패하면 false 값을 리턴한다.
		return false;
	}

	// 2. 관리자 메인 화면 출력하는 메소드입니다.
	public static void adminMenu() {

		/*
		 * 이미 선언된 메소드들을 호출해서 사용합니다. 프로그램이 최종적으로 동작할 main method 에 선언한 커피, 디저트 리스트를 호출해서
		 * 사용합니다.
		 * 
		 * 
		 */

		coffee_menu coffee = new coffee_menu();
		dessert_menu dessert = new dessert_menu();

		if (admin_logIn()) { // 1. 아이디 & 비밀번호가 일치해야 관리자 메뉴 실행시킵니다.
			System.out.println("관리자 메뉴입니다. ");
			System.out.println("메뉴를 선택하세요. ");
			boolean run = true;

			while (run) {
				// 0. 메인 메뉴 선택화면입니다.
				System.out.print("1번. 메뉴 추가 | 2번. 메뉴 수정 | 3번. 메뉴 삭제 | 4번. 메뉴 출력 | 5번. 프로그램 종료 >>> ");
				int adminSelect = project_Main.scanner.nextInt();
				// 1. 관리자가 메뉴를 추가합니다.
				if (adminSelect == 1) {
					System.out.print("메뉴를 추가합니다. ");
					System.out.print("어떤 메뉴를 추가하시겠습니까? 1번. 커피 | 2번. 디저트 >>> ");
					int adminSelect2 = project_Main.scanner.nextInt();
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
					System.out.print("1번. 커피 메뉴 수정 | 2번. 디저트 메뉴 수정 >>> ");
					int adminSelect4 = project_Main.scanner.nextInt();
					if (adminSelect4 == 1) {
						System.out.println("커피 메뉴 삭제하는 화면입니다. ");
						adminCoffeeModify(); // 1. 커피 메뉴를 수정하는 메소드 호출
					} else if (adminSelect4 == 2) {
						System.out.println("디저트 메뉴 삭제하는 화면입니다. ");
						adminDessertModify(); // 2. 디저트 메뉴를 수정하는 메소드 호출
					} else {
						// 3. 1~2 값이 아닌 다른 입력을 받았을 때 에러 메세지 출력
						System.out.println("잘못된 입력입니다. ");
					}
				}
				// 3. 관리자가 메뉴를 삭제합니다.
				else if (adminSelect == 3) {
					System.out.print("1번. 커피 메뉴 삭제 | 2번. 디저트 메뉴 삭제 >>> ");
					int adminSelect3 = project_Main.scanner.nextInt();
					if (adminSelect3 == 1) {
						System.out.println("커피 메뉴 삭제하는 화면입니다. ");
						adminDeleteCoffeeMenu(); // 1. 커피 메뉴를 삭제하는 메소드 호출
					} else if (adminSelect3 == 2) {
						System.out.println("디저트 메뉴 삭제하는 화면입니다. ");
						adminDeleteDessertMenu(); // 2. 디저트 메뉴를 삭제하는 메소드 호출
					} else {
						// 3. 1~2 값이 아닌 다른 입력을 받았을 때 에러 메세지 출력
						System.out.println("잘못된 입력입니다. ");
					}

				}
				// 4. 메뉴를 출력합니다.
				else if (adminSelect == 4) {

					/*
					 * 관리자가 입력한 메뉴를 출력해서 확인할 수 있습니다. db 와 연동해야만 유의미한 값들 입니다.
					 */

					System.out.println("메뉴를 출력합니다. ");
					System.out.println("----커피------");
					adminCoffeeList(); // 1. 커피 메뉴를 출력하는 메소드 호출
					System.out.println("----디저트----");
					adminDessertList(); // 2. 디저트 메뉴를 출력하는 메소드 호출
					System.out.println("");
				}
				// 5. 프로그램을 종료합니다.
				else if (adminSelect == 5) {
					System.out.println("관리자 메뉴를 종료합니다. ");
					run = false; // 1. run 값을 false 로 바꿈으로써 반복문을 종료시킵니다.

				}
				// 6. 1~4번 값이 아닌경우 에러 메시지를 출력합니다.
				else {
					System.out.println("유효하지 않은 입력입니다. ");
				}
			}
		}

	}

	// 3. 커피 메뉴에 중복메뉴가 있는지 체크하는 메소드입니다.
	public static boolean adminCoffeeCheck(String name) {

		for (int i = 0; i < project_Main.admin_coffee_list.size(); i++) {

			if (project_Main.admin_coffee_list.get(i).equals(name)) {
				// 1. 커피 리스트에 값이 존재하고 입력된 값과 동일한 메뉴가 존재하는 경우 => 중복이 생기는 경우
				System.out.println("중복입니다. ");
				// 2. 중복이 발생하는 경우 false 를 리턴합니다.
				return true;
			}
		}
		return false; // 3. 중복이 아닌 경우에는 true 를 리턴합니다.
	}

	// 4. 디저트 메뉴에 중복메뉴가 있는지 체크하는 메소드입니다.
	public static boolean adminDessertCheck(String name) {
		for (int i = 0; i < project_Main.admin_dessert_list.size(); i++) {
			if (project_Main.admin_dessert_list.get(i).getDessertType().equals(name)) {
				// 디저트 리스트에 값이 존재하고 입력된 값과 동일한 메뉴가 존재하는 경우 => 중복이 생기는 경우
				System.out.println("중복입니다. ");
				return true; // 2. 중복이 발생하는 경우 false 를 리턴합니다.
			}
		}
		return false; // 3. 중복이 아닌 경우에는 true 를 리턴합니다.
	}

	// 5. 커피 메뉴를 추가하는 메소드입니다.
	public static void adminAddCoffeeMenu() {
		coffee_menu coffee;
		System.out.println("새로운 커피를 추가하는 화면입니다. ");
		System.out.print("커피 이름 : >>> ");
		String c_name = project_Main.scanner.next();
		if (!adminCoffeeCheck(c_name)) { // 커피 이름이 기존의 리스트와 중복되지 않습니다.
			System.out.print("커피 가격 : >>> ");
			int c_price = project_Main.scanner.nextInt();
			System.out.print("커피 재고 : >>> ");
			int c_stock = project_Main.scanner.nextInt();
			coffee = new coffee_menu(c_name, c_price, c_stock);
			for (int i = 0; i < project_Main.admin_coffee_list.size(); i++) {
				project_Main.admin_coffee_list.add(coffee); // 비어있는 coffeeList 에 추가합니다.
				break;
			}
		} else {
			System.out.println("입력된 메뉴는 이미 존재하는 메뉴입니다. ");
		}

	}

	// 6. 디저트 메뉴를 추가하는 메소드입니다.
	public static void adminAddDessert() {
		dessert_menu dessert;
		System.out.print("디저트 이름 : ");
		String d_name = project_Main.scanner.next();
		if (!adminDessertCheck(d_name)) { // 1. 디저트 이름이 기존 리스트와 중복되지 않는 경우에 통과합니다.
			System.out.print(d_name + " 디저트 가격 : ");
			int d_price = project_Main.scanner.nextInt();
			System.out.print(d_name + " 디저트 재고 : ");
			int d_stock = project_Main.scanner.nextInt();

			dessert = new dessert_menu(d_name, d_price, d_stock);
			for (int i = 0; i < project_Main.admin_dessert_list.size(); i++) {
				project_Main.admin_dessert_list.add(dessert);
				break;
			}
		} else {
			System.out.println("입력된 메뉴는 이미 존재하는 메뉴입니다. ");
		}

	}

	// 7. 커피 메뉴를 삭제하는 메소드입니다.
	public static void adminDeleteCoffeeMenu() {
		adminCoffeeList(); // 커피 목록 출력하는 메소드 호출
		System.out.println("어떤 커피를 제외시키겠습니까? :");
		String c_name = project_Main.scanner.next();
		for (int i = 0; i < project_Main.admin_coffee_list.size(); i++) {
			if (project_Main.admin_coffee_list.get(i).getCoffeeType().equals(c_name)) { // 해당 // 찾습니다.
				project_Main.admin_coffee_list.remove(i);
				break;
			}
		}

	}

	// 6. 디저트 메뉴를 삭제하는 메소드입니다.
	public static void adminDeleteDessertMenu() {
		adminDessertList(); // 디저트 목록을 출력하는 메소드 호출
		String d_name = project_Main.scanner.next();
		for (int i = 0; i < project_Main.admin_dessert_list.size(); i++) {
			if (project_Main.admin_dessert_list.get(i).getDessertType().equals(d_name)) {
				project_Main.admin_dessert_list.remove(i);
			}
		}
	}

	// 8. 현재 커피 리스트를 출력하는 메소드입니다.
	public static void adminCoffeeList() {
		for (int i = 0; i < project_Main.admin_coffee_list.size(); i++) {
			System.out.println("커피 이름 : " + project_Main.admin_coffee_list.get(i).getCoffeeType());
			System.out.println("커피 가격 : " + project_Main.admin_coffee_list.get(i).getCoffeePrice());
			System.out.println("커피 재고 : " + project_Main.admin_coffee_list.get(i).getCoffeeStock());
		}
	}

	// 9. 현재 디저트 리스트를 출력하는 화면입니다.
	public static void adminDessertList() {
		for (int i = 0; i < project_Main.admin_dessert_list.size(); i++) {
			System.out.println("디저트 이름 : " + project_Main.admin_dessert_list.get(i).getDessertType());
			System.out.println("디저트 가격 : " + project_Main.admin_dessert_list.get(i).getDessertPrice());
			System.out.println("디저트 재고 : " + project_Main.admin_dessert_list.get(i).getDessertStock());
		}
	}

	// 10. 커피 메뉴를 수정하는 화면입니다.
	public static void adminCoffeeModify() {
		coffee_menu coffee;
		adminCoffeeList(); // 커피 목록을 출력하고 선택하게 합니다.
		System.out.print("커피 이름 : ");
		String c_name = project_Main.scanner.next();
		for (int i = 0; i < project_Main.admin_coffee_list.size(); i++) {
			if (project_Main.admin_coffee_list.get(i).getCoffeeType().equals(c_name)) {
				System.out.print("수정할 가격 : ");
				int c_price = project_Main.scanner.nextInt();
				System.out.print("수정할 재고 : ");
				int c_stock = project_Main.scanner.nextInt();
				coffee = new coffee_menu(c_name, c_price, c_stock);
				project_Main.admin_coffee_list.set(i, coffee); // 새로 입력받은 값으로 덮어씌웁니다.
			}
		}
	}

	// 11. 디저트 메뉴를 수정하는 화면입니다.
	public static void adminDessertModify() {
		dessert_menu dessert;
		adminDessertList();
		System.out.print("디저트이름 : ");
		String d_name = project_Main.scanner.next();
		for (int i = 0; i < project_Main.admin_dessert_list.size(); i++) {
			if (project_Main.admin_dessert_list.get(i).getDessertType().equals(d_name)) {
				System.out.print("수정할 가격 : ");
				int d_price = project_Main.scanner.nextInt();
				System.out.print("수정할 재고 : ");
				int d_stock = project_Main.scanner.nextInt();
				dessert = new dessert_menu(d_name, d_price, d_stock);
				project_Main.admin_dessert_list.set(i, dessert);
			}
		}
	}

	/* ------------- 여기서부터는 getter / setter 메소드 입니다. ----------- */

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
