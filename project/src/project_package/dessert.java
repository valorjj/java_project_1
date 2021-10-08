package project_package;

public class dessert extends customerOrder {
	
	String dessertWhichOne;
	int dessertHowMany;
	
	
	
	public dessert() {
		
	}

	public dessert(String dessertWhichOne, int dessertHowMany) {
		super();
		this.dessertWhichOne = dessertWhichOne;
		this.dessertHowMany = dessertHowMany;
	}

	public String getDessertWhichOne() {
		return dessertWhichOne;
	}

	public void setDessertWhichOne(String dessertWhichOne) {
		this.dessertWhichOne = dessertWhichOne;
	}

	public int getDessertHowMany() {
		return dessertHowMany;
	}

	public void setDessertHowMany(int dessertHowMany) {
		this.dessertHowMany = dessertHowMany;
	}
	
	
	
	

}
