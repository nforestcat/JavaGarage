package study2;

	class Product {
		private int num;
		private String name;
		private int price;
		
	public Product(int num, String name, int price) {
		super();
		this.num = num;
		this.name = name;
		this.price = price;
	}
	Product(String name , int price){
		this.name = name;
		this.price = price;
	}
	public String toString() {
		return num + "/" + name + "/" + price;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
