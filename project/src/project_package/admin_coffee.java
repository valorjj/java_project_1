package project_package;

public class admin_coffee extends admin_page {

	String admin_coffeeName;
	int admin_coffeePrice;
	int admin_coffeeInventory;

	public admin_coffee() {

	}
	// 1. 메뉴 출력 페이지

	public static void admin_coffee_page() {
		System.out.println(" [관리자메뉴] 커피 등록 및 수정 ");
		System.out.println(" ------------------------");
		boolean flag = true;
		while (flag) {
			System.out.print("1. 등록 | 2. 수정 | 3. 삭제 | 4. 종료 : ");
			int ch = project_Main.scanner.nextInt();
			switch (ch) {
			case 1:
				// 1. 커피 등록 하는 페이지 출력
				admin_add_coffee();
				break;
			case 2:
				// 2. 등록된 커피 정보를 수정합니다.
				admin_modify_coffee();
				break;
			case 3:
				// 3. 등록된 커피를 삭제합니다.
				admin_delete_coffee();
				break;
			case 4:
				// 4. 종료
				System.out.println("이전 페이지로 이동 ... ");
				flag = false;
				break;
			default:
				// 5. 잘못된 접근
				System.out.println("잘못된 경로 입니다 ... ");

			}

		}
	}

	// 2. [관리자] 커피 메뉴 등록
	public static void admin_add_coffee() {

		System.out.print("[관리자메뉴] 추가할 커피 이름 : ");
		String c_name = project_Main.scanner.next();
		System.out.print("[관리자메뉴] 커피 가격 : ");
		int c_price = project_Main.scanner.nextInt();
		System.out.print("[관리자메뉴] 커피 재고 : ");
		int c_inventory = project_Main.scanner.nextInt();

		admin_coffee admin = new admin_coffee(c_name, c_price, c_inventory);
		
		admin_coffeeArray.add(admin);

	}

	// 3. [관리자] 커피 메뉴 삭제
	@SuppressWarnings("unlikely-arg-type")
	public static void admin_delete_coffee() {
		System.out.println("[관리자메뉴] 삭제할 커피 이름 : ");
		String c_name = project_Main.scanner.next();
		if (admin_coffeeArray.contains(c_name)) {
			admin_coffeeArray.remove(admin_coffeeArray.indexOf(c_name));
		}
	}

	// 4. [관리자] 커피 메뉴 수정
	@SuppressWarnings("unlikely-arg-type")
	public static void admin_modify_coffee() {
		System.out.println("[관리자메뉴] 수정할 커피 이름 : ");
		String c_name = project_Main.scanner.next();
		if (admin_coffeeArray.contains(c_name)) {
			int j = admin_coffeeArray.indexOf(c_name);
			admin_coffeeArray.get(j).setAdmin_coffeeName(c_name);
			System.out.println("[관리자메뉴] 수정할 가격 : ");
			int c_price = project_Main.scanner.nextInt();
			System.out.println("[관리자메뉴] 수정할 재고 : ");
			int c_stock = project_Main.scanner.nextInt();
			admin_coffeeArray.get(j).setAdmin_coffeePrice(c_price);
			admin_coffeeArray.get(j).setAdmin_coffeeInventory(c_stock);
		} else {
			System.out.println("[관리자메뉴] 해당 커피가 존재하지 않습니다. ");
		}
	}
	/**
	 * @param admin_coffeeName
	 * @param admin_coffeePrice
	 * @param admin_coffeeInventory
	 */
	public admin_coffee(String admin_coffeeName, int admin_coffeePrice, int admin_coffeeInventory) {
		super();
		this.admin_coffeeName = admin_coffeeName;
		this.admin_coffeePrice = admin_coffeePrice;
		this.admin_coffeeInventory = admin_coffeeInventory;
	}

	public String getAdmin_coffeeName() {
		return admin_coffeeName;
	}

	public void setAdmin_coffeeName(String admin_coffeeName) {
		this.admin_coffeeName = admin_coffeeName;
	}

	public int getAdmin_coffeePrice() {
		return admin_coffeePrice;
	}

	public void setAdmin_coffeePrice(int admin_coffeePrice) {
		this.admin_coffeePrice = admin_coffeePrice;
	}

	public int getAdmin_coffeeInventory() {
		return admin_coffeeInventory;
	}

	public void setAdmin_coffeeInventory(int admin_coffeeInventory) {
		this.admin_coffeeInventory = admin_coffeeInventory;
	}
	
	

}
