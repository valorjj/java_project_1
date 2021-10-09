package project_package;

public class payment extends customerOrder {

	/*
	 * customerOrder 를 상속받습니다. customerOrder 데이터를 호출하여 최종적으로 결제할 금액 project_Main 에
	 * coffeeList, dessertList 의 stock 을 조정합니다.
	 */

	int coffeePayment;
	int dessertPayment;

	public static void payment_mainpage() {
		payment p = new payment();
		System.out.println("총 결제하실 금액 : ");
		int val = p.customer_payment();
		System.out.println();
		System.out.print("결제를 진행하겠습니다. 얼마를 투입하시겠습니까? >>> ");
		int pay = project_Main.scanner.nextInt();
		if (pay >= val) {
			System.out.println("결제가 완료되었습니다. 이용해 주셔서 감사합니다. ");
		} else {
			System.out.println("금액이 부족합니다. ");
		}

	}

	public payment() {
	}

	public static int customer_payment() {
		payment p = new payment();
		System.out.println("결제를 진행합니다. ");
		System.out.println("주문하신 메뉴는 다음과 같습니다. ");
		// 1. 고객이 주문한 메뉴를 출력합니다.
		customerOrder.order_print();
		System.out.println("총 결제할 금액은 다음과 같습니다. " +  p.getCoffeePayment() + p.getDessertPayment());
		return p.getCoffeePayment() + p.getDessertPayment();
	}

	public static void coffee_payment() {
		payment p = new payment();
		int c_money = 0;
		// 1. 고객이 지불할 커피 항목 금액입니다.
		// 1. coffeeArray 는 고객이 주문한 항목입니다.
		// 2. coffeeList 는 관리자 메뉴에 등록한 항목입니다.
		for (int i = 0; i < coffee_menu.coffeeArray.length; i++) {
			if (coffee_menu.coffeeArray[i] != null) {
				for (int j = 0; j < project_Main.coffeeList.length; j++) {
					if (project_Main.coffeeList[j] != null && project_Main.coffeeList[j].getCoffeeType()
							.equals(coffee_menu.coffeeArray[i].getCoffeeWhichOne())) {
						c_money += project_Main.coffeeList[j].getCoffeePrice()
								* coffee_menu.coffeeArray[i].getCoffeeHowMany();

					}
				}
			}
		}

		p.setCoffeePayment(c_money);

	}

	public static void dessert_payment() {

		payment p = new payment();
		int d_money = 0;
		// 1. 고객이 지불할 디저트 항목 금액입니다.

		for (int i = 0; i < dessert_menu.dessertArray.length; i++) {
			if (dessert_menu.dessertArray[i] != null) {
				for (int j = 0; j < project_Main.dessertList.length; j++) {
					if (project_Main.dessertList[j] != null && project_Main.dessertList[j].getDessertType()
							.equals(dessert_menu.dessertArray[i].getDessertWhichOne())) {
						d_money += dessert_menu.dessertArray[i].getDessertHowMany()
								* project_Main.dessertList[j].getDessertPrice();
					}
				}
			}
		}
		p.setDessertPayment(d_money);
	}

	/**
	 * @param coffeePayment
	 * @param dessertPayment
	 */
	public payment(int coffeePayment, int dessertPayment) {
		super();
		this.coffeePayment = coffeePayment;
		this.dessertPayment = dessertPayment;
	}

	public int getCoffeePayment() {
		return coffeePayment;
	}

	public void setCoffeePayment(int coffeePayment) {
		this.coffeePayment = coffeePayment;
	}

	public int getDessertPayment() {
		return dessertPayment;
	}

	public void setDessertPayment(int dessertPayment) {
		this.dessertPayment = dessertPayment;
	}

}
