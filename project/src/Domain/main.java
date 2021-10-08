package Domain;

import java.util.Scanner;

public class main {
	
	static Scanner scanner = new Scanner(System.in);
	static coffee_menu[] coffeeList = new coffee_menu[30];
	static dessert_menu[] dessertList = new dessert_menu[30];
	
	public static void main(String[] args) {
 
		// admin_page 객체 호출 
		admin_page adminPage = new admin_page();
		
		adminPage.adminMenu();
		

	}

}
