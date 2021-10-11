package project_package;

public class admin_dessert extends admin_page {

	String admin_dessertName;
	int admin_dessertPrice;
	int admin_dessertInventory;

	public admin_dessert() {
	}

	public static void admin_dessert_page() {
		System.out.println("[관리자] 디저트 등록 및 수정 ");
		System.out.println(" ------------------------ ");
		boolean flag = true;
		while (flag) {
			System.out.print("1. 등록 | 2. 수정 | 3. 삭제 | 4. 종료 : ");
			int ch = project_Main.scanner.nextInt();
			switch (ch) {
			case 1:
				admin_add_dessert();
				break;
			case 2:
				admin_modify_dessert();
				break;
			case 3:
				admin_delete_dessert();
				break;
			case 4:
				System.out.println("이전 페이지로 이동 ... ");
				flag = false;
				break;
			default:
				System.out.println("잘못된 경로 입니다 ... ");
			}

		}

	}

	private static void admin_add_dessert() {

		System.out.print("[관리자] 추가할 디저트 이름 : ");
		String d_name = project_Main.scanner.next();
		System.out.print("[관리자] 디저트 가격 : ");
		int d_price = project_Main.scanner.nextInt();
		System.out.print("[관리자] 디저트 재고 : ");
		int d_inventory = project_Main.scanner.nextInt();

		admin_dessert admin = new admin_dessert(d_name, d_price, d_inventory);

		admin_dessertArray.add(admin);

	}

	private static void admin_modify_dessert() {
		System.out.print("[관리자] 수정할 디저트 이름 : ");
		String d_name = project_Main.scanner.next();
		for (int i = 0; i < admin_dessertArray.size(); i++) {
			if (admin_dessertArray.contains(d_name)) {
				int idx = admin_dessertArray.indexOf(d_name);
				admin_dessertArray.get(idx).setAdmin_dessertName(d_name);
				System.out.print("[관리자] 수정할 가격 : ");
				int d_price = project_Main.scanner.nextInt();
				admin_coffeeArray.get(idx).setAdmin_coffeePrice(d_price);
				System.out.print("[관리자] 수정할 가격 : ");
				int d_stock = project_Main.scanner.nextInt();
				admin_coffeeArray.get(idx).setAdmin_coffeeInventory(d_stock);
				break;
			} else {
				System.out.println("[관리자] 해당 디저트가 존재하지 않습니다. ");
			}

		}

	}

	private static void admin_delete_dessert() {
		System.out.println("[관리자] 삭제할 디저트 이름 : ");
		String d_name = project_Main.scanner.next();
		if (admin_dessertArray.contains(d_name)) {
			admin_dessertArray.remove(admin_dessertArray.indexOf(d_name));
		}

	}

	/**
	 * @param admin_dessertName
	 * @param admin_dessertPrice
	 * @param admin_dessertInventory
	 */
	public admin_dessert(String admin_dessertName, int admin_dessertPrice, int admin_dessertInventory) {
		super();
		this.admin_dessertName = admin_dessertName;
		this.admin_dessertPrice = admin_dessertPrice;
		this.admin_dessertInventory = admin_dessertInventory;
	}

	public String getAdmin_dessertName() {
		return admin_dessertName;
	}

	public void setAdmin_dessertName(String admin_dessertName) {
		this.admin_dessertName = admin_dessertName;
	}

	public int getAdmin_dessertPrice() {
		return admin_dessertPrice;
	}

	public void setAdmin_dessertPrice(int admin_dessertPrice) {
		this.admin_dessertPrice = admin_dessertPrice;
	}

	public int getAdmin_dessertInventory() {
		return admin_dessertInventory;
	}

	public void setAdmin_dessertInventory(int admin_dessertInventory) {
		this.admin_dessertInventory = admin_dessertInventory;
	}

}
