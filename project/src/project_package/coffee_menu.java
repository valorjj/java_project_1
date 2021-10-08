package project_package;

public class coffee_menu extends admin_page {

	// 커피 메뉴 클래스
	// 아메리카노 | 라떼 | 콜드브루

	/*
	 * 반복적으로 사용되는 건 객체지향 프로그래밍을 통해 최대한 줄이려고 노력해봅니다. 커피 주문을 받고, 객체로 넘겨줍니다.
	 *
	 */

	String coffee_name; // 해당 메뉴 이름
	int coffee_price; // 해당 메뉴 가격
	int coffee_stock; // 남은 재고
	static coffee[] coffeeArray = new coffee[10];

	public coffee_menu() {
	}

	public coffee_menu(String coffee_name, int coffee_price, int coffee_stock) {
		super();
		this.coffee_name = coffee_name;
		this.coffee_price = coffee_price;
		this.coffee_stock = coffee_stock;
	}

	// 1. 커피를 주문하는 창을 띄우는 메소드입니다.
	public static void coffee_mainPage() {
		// 0. customer 객체를 생성해서 고객의 주문을 기록합니다.
		customerOrder customer = new customerOrder();

	}

	// 2. 커피를 주문받아서 customer 객체에 저장하는 메소드입니다.
	public static void order() {
		customerOrder customer;
		int idx = 0;
		boolean flag = true;
		while (flag) {
			System.out.println("커피를 주문하는 화면입니다. ");
			System.out.print("1번. 주문 | 2번. 이전 화면으로 >>> ");
			int userSelect = project_Main.scanner.nextInt();
			if (userSelect == 1) {
				// 1. 커피 혹은 디저트를 주문하는 메소드를 호출합니다.
				coffee_order();
			} else if (userSelect == 2) {
				System.out.println("이전화면으로 돌아갑니다. ");
				flag = false;
			}

		}

	}

	public static void coffee_order() {
		coffee cof;
		// 1. 커피를 주문받습니다.
		System.out.println("커피를 주문받는 화면입니다. ");
		adminCoffeeList(); // 2. 주문가능한 커피 리스트를 출력합니다.
		System.out.print("어떤 커피를 주문하시겠습니까? : ");
		String userSelect_coffee_name = project_Main.scanner.next();
		for (int i = 0; i < project_Main.coffeeList.length; i++) {
			if (project_Main.coffeeList[i] != null
					&& project_Main.coffeeList[i].equals(userSelect_coffee_name)) {
				// 1. 입력된 메뉴와 동일할 경우 계속 진행합니다.
				// 1. i 번째 저장된 메뉴를 주문하는 경우입니다.
				int idx = i;
				System.out.print("hot / ice : ");
				String userSelect_coffee_temp = project_Main.scanner.next();
				System.out.print("small / tall / large : ");
				String userSelect_coffee_size = project_Main.scanner.next();
				System.out.print("몇잔 주문하시겠습니까? : ");
				int userSelect_coffee_howmany = project_Main.scanner.nextInt();
				cof = new coffee(userSelect_coffee_name, userSelect_coffee_temp, userSelect_coffee_howmany, userSelect_coffee_size);
				coffeeArray[i] = cof;
				
			}
		}

	}
	
	public static void dessert_order() {
		dessert des;
		// 1. 디저트를 주문받습니다.
		adminDessertList();
		System.out.println("어떤 디저트를 주문하시겠습니까? : ");
		String userSelect_dessert_name = project_Main.scanner.next();
		for(int i=0; i<project_Main.dessertList.length; i++) {
			if(project_Main.dessertList[i] != null && project_Main.dessertList[i].equals(userSelect_dessert_name)) {
				int idx = i;
				System.out.println("몇개나 주문하시겠습니까 ? : ");
				int userSelect_dessert_howmany = project_Main.scanner.nextInt();
				
			}
		}
	}

	public String getCoffee_name() {
		return coffee_name;
	}

	public void setCoffee_name(String coffee_name) {
		this.coffee_name = coffee_name;
	}

	public int getCoffee_price() {
		return coffee_price;
	}

	public void setCoffee_price(int coffee_price) {
		this.coffee_price = coffee_price;
	}

	public int getCoffee_stock() {
		return coffee_stock;
	}

	public void setCoffee_stock(int coffee_stock) {
		this.coffee_stock = coffee_stock;
	}

}
