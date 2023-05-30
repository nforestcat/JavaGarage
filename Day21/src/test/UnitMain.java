package test;

public class UnitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit u = new GroundUnit();
		Tank t = new Tank();
		AirCraft ac = new AirCraft();
		
		u = (Unit)ac;
		u = ac;
		GroundUnit gu = (GroundUnit) u;
		//됨
		AirUnit au = ac;
		//됨
		t = (Tank)u;
		//안됨
		gu = t;
		//됨
	}

}
class Unit{
	
}
class AirUnit extends Unit{
	
}
class GroundUnit extends Unit{
	
}
class Tank extends GroundUnit{
	
}
class AirCraft extends AirUnit{
	
}