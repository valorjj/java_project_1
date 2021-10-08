package Domain;

public class coffee_menu {
	// 커피 메뉴 클래스 
	// 아메라카노 | 라떼 | 콜드브루 
	
	String coffeeType; // 해당 메뉴 이름 
	String coffeePrice; // 해당 메뉴 가격 
	// String coffeeTemp; // "hot" | "ice"
	String coffeeStock; // 남은 재고 
	// String coffeeSize; // 메뉴 사이즈 
	
	public coffee_menu(String coffeeType, String coffeePrice, String coffeeStock) {
		super();
		this.coffeeType = coffeeType;
		this.coffeePrice = coffeePrice;
		this.coffeeStock = coffeeStock;
	}
	
	

	
	
	
}
