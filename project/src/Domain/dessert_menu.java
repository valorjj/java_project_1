package Domain;

public class dessert_menu extends admin_page {
	// 디저트 메뉴 클래스
	
	String dessert_name;
	String dessert_price;
	String dessert_stock;
	
	public dessert_menu(String dessert_name, String dessert_price, String dessert_stock) {
		super();
		this.dessert_name = dessert_name;
		this.dessert_price = dessert_price;
		this.dessert_stock = dessert_stock;
	}

	
	// 디저트 메뉴 getter / setter 

	public String getDessert_name() {
		return dessert_name;
	}

	public void setDessert_name(String dessert_name) {
		this.dessert_name = dessert_name;
	}

	public String getDessert_price() {
		return dessert_price;
	}

	public void setDessert_price(String dessert_price) {
		this.dessert_price = dessert_price;
	}

	public String getDessert_stock() {
		return dessert_stock;
	}

	public void setDessert_stock(String dessert_stock) {
		this.dessert_stock = dessert_stock;
	}
	
	
	
	
	

}
