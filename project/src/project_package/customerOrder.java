package project_package;

/*
 * 	손님이 주문한 정보가 기록되는 클래스입니다.
 * 	영수증을 처리 및 기록하는 용도입니다. 
 * 	실제 손님이 여러가지 메뉴를 주문할 수 있기 때문에 필드를 배열로 선언했습니다.
 * 	총 10개의 메뉴를 주문할 수 있도록 제한을 두었습니다. 
 *  coffee, dessert 클래스의 부모 클래스입니다. 
 */
public class customerOrder {
	
	/*
	 *	coffee 클래스를 호출해서 메뉴 이름, 온도, 수량, 사이즈 받는다.
	 * 	coffee 객체에 담은 뒤 다시 customer 클래스에 담는다.
	 */
	
	coffee customer_coffee;
	dessert customer_dessert;
	
	

	public customerOrder() {
		
	}
	
	public void customerOrder(coffee customer_coffee, dessert customer_dessert) {
		// 
	}
	
	// coffee, dessert 주문 정보를 배열로 넘길 생각입니다. 
	
	

}
