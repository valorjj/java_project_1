package project_package;

public class dessert_menu extends admin_page {

	String dessert_name;
	int dessert_price;
	int dessert_stock;

	public dessert_menu() {
	}

	public dessert_menu(String dessert_name, int dessert_price, int dessert_stock) {
		super();
		this.dessert_name = dessert_name;
		this.dessert_price = dessert_price;
		this.dessert_stock = dessert_stock;
	}

	public static void dessert_mainPage() {
		System.out.println("");
		adminDessertList();
		System.out.print(" ? >>> ");
		int dessertInput = project_Main.scanner.nextInt();

	}

	public String getDessert_name() {
		return dessert_name;
	}

	public void setDessert_name(String dessert_name) {
		this.dessert_name = dessert_name;
	}

	public int getDessert_price() {
		return dessert_price;
	}

	public void setDessert_price(int dessert_price) {
		this.dessert_price = dessert_price;
	}

	public int getDessert_stock() {
		return dessert_stock;
	}

	public void setDessert_stock(int dessert_stock) {
		this.dessert_stock = dessert_stock;
	}
	
	


}
