package test;

public class RepairableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank t= new Tank();
		Marine m = new Marine();
		SCV s = new SCV();
		
		s.repair(t);
		//s.repair(m);
		s.repair(s);
	}

}
interface Repairable{
	
}
class Unit{
	int hitPoint;
	final int Max_Hp;
	Unit(int hp){
		Max_Hp = hp;
	}
}
class GroundUnit extends Unit{
	GroundUnit(int hp){
		super(hp);
	}
}
class AirUnit extends Unit{
	AirUnit(int hp){
		super(hp);
	}
}
class Tank extends GroundUnit implements Repairable{
	Tank(){
		super(150);
		hitPoint = Max_Hp;
	}
}
class Marine extends GroundUnit{
	Marine() {
		super(40);
		hitPoint = Max_Hp;
	}
}
class SCV extends GroundUnit implements Repairable{
	SCV(){
		super(60);
		hitPoint = Max_Hp;
	}
	void repair(Repairable r) {
		System.out.println("repair()");
		if (r instanceof Unit) {
			Unit u = (Unit) r;
			while( u.hitPoint != u.Max_Hp) {
				u.hitPoint++;
			}
			}
	}
}