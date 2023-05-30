package study;

import java.util.*;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vc;
		vc = new Car();
		
		Scanner sc = new Scanner(System.in);
	}

}
abstract class Vehicle{
	protected int speed;
	public void setSpeed(int s ) {
		speed = s;
		System.out.println("속도를 " + speed + "으로 변경했습니다.");
	}
	abstract void show();
}

class Car extends Vehicle{
	public void show() {
		
	}
	
}