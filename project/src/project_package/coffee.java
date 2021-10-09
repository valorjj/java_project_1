package project_package;

public class coffee extends coffee_menu {

	String coffeeWhichOne; // 1. 손님이 주문한 커피의 종류
	String coffeeHotOrIce; // 2. 손님이 주문한 커피 핫 / 아이스 여부
	int coffeeHowMany; // 3. 손님이 주문한 커피의 갯수
	String coffeeSize; // 4. 손님이 주문한 커피의 사이즈

	public coffee() {

	}

	public coffee(String coffeeWhichOne, String coffeeHotOrIce, int coffeeHowMany, String coffeeSize) {
		super();
		this.coffeeWhichOne = coffeeWhichOne;
		this.coffeeHotOrIce = coffeeHotOrIce;
		this.coffeeHowMany = coffeeHowMany;
		this.coffeeSize = coffeeSize;
	}

	public String getCoffeeWhichOne() {
		return coffeeWhichOne;
	}

	public void setCoffeeWhichOne(String coffeeWhichOne) {
		this.coffeeWhichOne = coffeeWhichOne;
	}

	public String getCoffeeHotOrIce() {
		return coffeeHotOrIce;
	}

	public void setCoffeeHotOrIce(String coffeeHotOrIe) {
		this.coffeeHotOrIce = coffeeHotOrIe;
	}

	public int getCoffeeHowMany() {
		return coffeeHowMany;
	}

	public void setCoffeeHowMany(int coffeeHowMany) {
		this.coffeeHowMany = coffeeHowMany;
	}

	public String getCoffeeSize() {
		return coffeeSize;
	}

	public void setCoffeeSize(String coffeeSize) {
		this.coffeeSize = coffeeSize;
	}

}
