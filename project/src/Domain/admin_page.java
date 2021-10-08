package Domain;

import View.*;

public class admin_page {
	
	public void adminMenu() {
		System.out.println("관리자 메뉴입니다. ");
		System.out.println("메뉴를 선택하세요. ");
		boolean run = true;
		while(run){
			System.out.print("1번. 메뉴 추가 | 2번. 메뉴 수정 | 3번. 메뉴 삭제 | 4번. 프로그램 종료");
			int adminSelect = main.scanner.nextInt();
			
			if(adminSelect==1) {
				System.out.print("메뉴를 추가합니다. ");
				
			} else if(adminSelect ==2) {
				
			} else if (adminSelect ==3) {
				
			} else if(adminSelect ==4) {
				
			} else {
				System.out.println("유효하지 않은 입력입니다. ");
				run = false;
			}
		}
		
	}
	
	


}


