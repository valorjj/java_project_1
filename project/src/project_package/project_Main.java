package project_package;

import java.util.Scanner;

public class project_Main {
	
	public static Scanner scanner = new Scanner(System.in);
	public static coffee_menu[] coffeeList = new coffee_menu[30];
	public static dessert_menu[] dessertList = new dessert_menu[30];
	
	public static void main(String[] args) {
 
		// 관리자 페이지 실행 
		
		System.out.println("메인 실행 화면입니다. ");
		
		admin_page adminPage = new admin_page();
		
		adminPage.adminMenu();
		
	

	
		

	}


}
