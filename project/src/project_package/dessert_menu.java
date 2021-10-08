package project_package;

public class dessert_menu extends admin_page {
	// �뵒���듃 硫붾돱 �겢�옒�뒪
	
	String dessert_name;
	String dessert_price;
	String dessert_stock;
	String aaa;
	
	// 鍮� �깮�꽦�옄 
	public dessert_menu() {
	}
	// dessert �쓽 �깮�꽦�옄�엯�땲�떎. �씠由�, 媛�寃�, �옱怨좊�� �엯�젰諛쏆뒿�땲�떎. 
	public dessert_menu(String dessert_name, String dessert_price, String dessert_stock) {
		super();
		this.dessert_name = dessert_name;
		this.dessert_price = dessert_price;
		this.dessert_stock = dessert_stock;
	}
	
	public static void dessert_mainPage() {
		System.out.println("�뵒���듃 異쒕젰 �솕硫댁엯�땲�떎. ");
		adminDessertList(); // �뵒���듃 由ъ뒪�듃 異쒕젰 
		System.out.print("�뼱�뼡 �뵒���듃瑜� 二쇰Ц�븯�떆寃좎뒿�땲源� ? >>> ");
		int dessertInput = project_Main.scanner.nextInt();
		
		
	}
	
	
	
	

	
	// �뵒���듃 硫붾돱 getter / setter 

	public String getDessert_name() {
		return dessert_name;
	}

	public void setDessert_name(String dessert_name) {
		this.dessert_name = dessert_name;
	}

	public String getDessert_price() {
		return dessert_price;
	}

	public void setDessert_price(String dessert_price) {
		this.dessert_price = dessert_price;
	}

	public String getDessert_stock() {
		return dessert_stock;
	}

	public void setDessert_stock(String dessert_stock) {
		this.dessert_stock = dessert_stock;
	}
	
	
	
	
	

}
