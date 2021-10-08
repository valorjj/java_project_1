package Domain;

import View.*;

public class admin_page {

	
	
	// 1. 관리자 메인 화면 출력하는 메소드입니다.
	public void adminMenu() {
		System.out.println("관리자 메뉴입니다. ");
		System.out.println("메뉴를 선택하세요. ");
		boolean run = true;
		
		while (run) {
			System.out.print("1번. 메뉴 추가 | 2번. 메뉴 수정 | 3번. 메뉴 삭제 | 4번. 프로그램 종료 >>> ");
			int adminSelect = main.scanner.nextInt();
			// 1. 관리자가 메뉴를 추가합니다. 
			if (adminSelect == 1) {
				System.out.print("메뉴를 추가합니다. ");

			} 
			// 2. 관리자가 메뉴를 수정합니다.
			else if (adminSelect == 2) {

			} 
			// 3. 관리자가 메뉴를 삭제합니다. 
			else if (adminSelect == 3) {

			} 
			// 4. 프로그램을 종료합니다. 
			else if (adminSelect == 4) {

			} 
			// 5. 1~4번 값이 아닌경우 에러 메시지를 출력합니다. 
			else {
				System.out.println("유효하지 않은 입력입니다. ");
			}
		}

	}

	// 2. 중복메뉴가 있는지 체크하는 메소드입니다.
	public void adminMenuCheck(String name) {

	}

	// 3. 커피 메뉴를 추가하는 메소드입니다.
	public void adminAddCoffeeMenu() {

	}

	// 4. 디저트 메뉴를 추가하는 메소드입니다.
	public void adminAddDessert() {

	}

	// 5. 커피 메뉴를 삭제하는 메소드입니다.
	public void adminDeleteCoffeeMenu() {

	}

	// 6. 디저트 메뉴를 삭제하는 메소드입니다.
	public void adminDeleteDessertMenu() {

	}

}
