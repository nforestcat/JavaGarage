package study;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motor myCar = new Motor();
		myCar.maxSpeed = 160;
		myCar.seater = 5;
		myCar.displacement = 1500;
		myCar.printInfo();
	}

}

class Vehicle {
	public String name = "차량";
	public double maxSpeed;
	public int seater;
}

class Motor extends Vehicle {
	Motor(){
		name="자동차";
	}
	
	int displacement;
	void printInfo(){
		System.out.println("name: "+super.name);
		System.out.println("최대속도: "+super.maxSpeed);
		System.out.println("정원: "+super.seater);
		System.out.println("배기량: "+displacement);
	}
}
