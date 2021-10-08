package project_package;

public class dessert_menu extends admin_page {

	static dessert[] dessertArray = new dessert[10];
	public dessert_menu() {
	}

	public static void dessert_mainPage() {
		System.out.println("");
		adminDessertList();
		System.out.print(" ? >>> ");
		int dessertInput = project_Main.scanner.nextInt();

	}


}
