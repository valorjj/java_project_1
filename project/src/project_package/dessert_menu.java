package project_package;

public class dessert_menu extends admin_page {
	
	String dessertType;
	int dessertPrice;
	int dessertStock;

	static dessert[] dessertArray = new dessert[10];
	
	
	
	
	/**
	 * @param dessertType
	 * @param dessertPrice
	 * @param dessertStock
	 */
	public dessert_menu(String dessertType, int dessertPrice, int dessertStock) {
		super();
		this.dessertType = dessertType;
		this.dessertPrice = dessertPrice;
		this.dessertStock = dessertStock;
	}

	public dessert_menu() {
	}

	public static void dessert_mainPage() {
		System.out.println("");
		adminDessertList();
		System.out.print(" ? >>> ");
		int dessertInput = project_Main.scanner.nextInt();

	}

	public static void dessert_order() {
		dessert des;
		// 1. 디저트를 주문받습니다.
		adminDessertList();
		System.out.println("어떤 디저트를 주문하시겠습니까? : ");
		String userSelect_dessert_name = project_Main.scanner.next();
		for (int i = 0; i < project_Main.dessertList.length; i++) {
			if (project_Main.dessertList[i] != null && project_Main.dessertList[i].equals(userSelect_dessert_name)) {
				int idx = i;
				System.out.println("몇개나 주문하시겠습니까 ? : ");
				int userSelect_dessert_howmany = project_Main.scanner.nextInt();

			}
		}
	}

	public String getDessertType() {
		return dessertType;
	}

	public void setDessertType(String dessertType) {
		this.dessertType = dessertType;
	}

	public int getDessertPrice() {
		return dessertPrice;
	}

	public void setDessertPrice(int dessertPrice) {
		this.dessertPrice = dessertPrice;
	}

	public int getDessertStock() {
		return dessertStock;
	}

	public void setDessertStock(int dessertStock) {
		this.dessertStock = dessertStock;
	}

	public static dessert[] getDessertArray() {
		return dessertArray;
	}

	public static void setDessertArray(dessert[] dessertArray) {
		dessert_menu.dessertArray = dessertArray;
	}
	
	
	
	
	

}
