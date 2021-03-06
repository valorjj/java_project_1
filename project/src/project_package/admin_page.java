package project_package;

import java.util.ArrayList;

public class admin_page {

	/*
	 * 관리자 페이지입니다. 편의상 관리자 아이디, 패스워드는 미리 입력되어있습니다.
	 * 
	 */

	String admin_Id = "admin";
	String admin_password = "1234";

	static ArrayList<admin_coffee> admin_coffeeArray = new ArrayList<admin_coffee>();
	static ArrayList<admin_dessert> admin_dessertArray = new ArrayList<admin_dessert>();

	// 빈 생성자
	public admin_page() {
	}

	// 0. 관리자 계정으로 로그인하는 메소드입니다.
	// 1. 관리자 계정은 편의상 "admin", "1234" 로 미리 입력되어있습니다.
	public static boolean admin_logIn() {
		admin_page admin = new admin_page(); // 1. admin 객체 생성

		System.out.print("[관리자] 관리자 계정 아이디 : ");
		String id = project_Main.scanner.next();
		System.out.print("[관리자] 관리자 계정 비밀번호 : ");
		String password = project_Main.scanner.next();
		// 2. admin 계정 정보와 입력하는지 검사
		if (admin.getAdmin_Id().equals(id) && admin.getAdmin_password().equals(password)) {
			// 3. 관리자 아이디와 비밀번호가 일치할 하면 로그인 성공
			System.out.println("[관리자] 관리자 계정으로 로그인되셨습니다. ");
			// 4. 로그인에 성공하면 true 값을 리턴한다.
			return true;
		} else {
			// 5. 아이디 혹은 비밀번호가 일치하지 않을 시 오류 메세지 출력
			System.out.println("[관리자] 유효하지 않은 입력입니다. ");
		}
		// 6. 로그인에 실패하면 false 값을 리턴한다.
		return false;
	}

	// 2. 관리자 메인 화면 출력하는 메소드입니다.
	public static void adminMenu() {

		if (admin_logIn()) { // 1. 아이디 & 비밀번호가 일치해야 관리자 메뉴 실행시킵니다.
			System.out.println("[관리자] 메뉴를 선택하세요. ");
			boolean run = true;

			while (run) {
				System.out.print("1. 메뉴 추가 | 2. 메뉴 출력 | 3. 뒤로가기 : ");
				int adminSelect = project_Main.scanner.nextInt();
				if (adminSelect == 1) {
					System.out.println("[관리자] 메뉴를 추가합니다. ");
					System.out.print("[관리자] 어떤 메뉴를 추가하시겠습니까? \n 1. 커피 | 2. 디저트 >>> ");
					int adminSelect2 = project_Main.scanner.nextInt();
					if (adminSelect2 == 1) {
						admin_coffee.admin_coffee_page();

					} else if (adminSelect2 == 2) {
						admin_dessert.admin_dessert_page();
					}

					else {
						System.out.println("[관리자] 유효하지 않은 입력입니다. ");
					}

				}

				else if (adminSelect == 2) {
					System.out.println("[관리자] 메뉴를 출력합니다. ");
					System.out.println("----------- 커피 -------------");
					adminCoffeeList(); // 1. 커피 메뉴를 출력하는 메소드 호출
					System.out.println("----------- 디저트 -----------");
					adminDessertList(); // 2. 디저트 메뉴를 출력하는 메소드 호출
					System.out.println();
				} else if (adminSelect == 3) {
					System.out.println("[관리자] 관리자 메뉴를 종료합니다. ");
					run = false;
				} else {
					System.out.println("[관리자] 유효하지 않은 입력입니다. ");
				}
			}
		}
	}

	// 8. 현재 커피 리스트를 출력하는 메소드입니다.
	public static void adminCoffeeList() {
		for (int i = 0; i < admin_coffeeArray.size(); i++) {
			System.out.println("커피 이름 : " + admin_coffeeArray.get(i).getAdmin_coffeeName());
			System.out.println("커피 가격 : " + admin_coffeeArray.get(i).getAdmin_coffeePrice());
			System.out.println("커피 재고 : " + admin_coffeeArray.get(i).getAdmin_coffeeInventory());
		}
	}

	// 9. 현재 디저트 리스트를 출력하는 화면입니다.
	public static void adminDessertList() {
		for (int i = 0; i < admin_dessertArray.size(); i++) {
			System.out.println("디저트 이름 : " + admin_dessertArray.get(i).getAdmin_dessertName());
			System.out.println("디저트 가격 : " + admin_dessertArray.get(i).getAdmin_dessertPrice());
			System.out.println("디저트 재고 : " + admin_dessertArray.get(i).getAdmin_dessertInventory());
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
