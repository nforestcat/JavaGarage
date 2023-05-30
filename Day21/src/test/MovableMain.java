package test;

public class MovableMain {

	public static void main(String[] args) {
		Move m = new Move();
		Test t - new Test();
		Movable m2 = new Move();
		
		t.attack(m);
		t.attack(m2);
	}
}
interface Movable{
	void move(int x, int y);
}
class Move implements Movable{
	public void move(int x, int y) {
		
	}
}
class Test{
	public void attack(Movable f) {
		
	}
}