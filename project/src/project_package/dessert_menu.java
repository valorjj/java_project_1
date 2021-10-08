package project_package;

public class dessert_menu extends admin_page {
	// 디저트 메뉴 클래스
	
	String dessert_name;
	String dessert_price;
	String dessert_stock;
	
	// 빈 생성자 
	public dessert_menu() {
	}
	// dessert 의 생성자입니다. 이름, 가격, 재고를 입력받습니다. 
	public dessert_menu(String dessert_name, String dessert_price, String dessert_stock) {
		super();
		this.dessert_name = dessert_name;
		this.dessert_price = dessert_price;
		this.dessert_stock = dessert_stock;
	}
	
	public static void dessert_mainPage() {
		System.out.println("디저트 출력 화면입니다. ");
		adminDessertList(); // 디저트 리스트 출력 
		System.out.print("어떤 디저트를 주문하시겠습니까 ? >>> ");
		int dessertInput = project_Main.scanner.nextInt();
		
		
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
