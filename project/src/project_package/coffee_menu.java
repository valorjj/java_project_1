package project_package;

public class coffee_menu extends admin_page {

	// 커피 메뉴 클래스
	// 아메라카노 | 라떼 | 콜드브루

	String coffeeType; // 해당 메뉴 이름
	String coffeePrice; // 해당 메뉴 가격
	String coffeeStock; // 남은 재고
	
	

	public coffee_menu() {
		// TODO Auto-generated constructor stub
	}

	public coffee_menu(String coffeeType, String coffeePrice, String coffeeStock) {
		super();
		this.coffeeType = coffeeType;
		this.coffeePrice = coffeePrice;
		this.coffeeStock = coffeeStock;
	}

	// coffee_menu getter / setter 메소드입니다.

	public String getCoffeeType() {
		return coffeeType;
	}

	public void setCoffeeType(String coffeeType) {
		this.coffeeType = coffeeType;
	}

	public String getCoffeePrice() {
		return coffeePrice;
	}

	public void setCoffeePrice(String coffeePrice) {
		this.coffeePrice = coffeePrice;
	}

	public String getCoffeeStock() {
		return coffeeStock;
	}

	public void setCoffeeStock(String coffeeStock) {
		this.coffeeStock = coffeeStock;
	}
	
	// 상세 메뉴 출력 창을 여기에?
	// 
	

}
