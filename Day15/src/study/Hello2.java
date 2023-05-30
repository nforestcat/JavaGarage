package study;

public class Hello2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Shape();
		s.p.x = 10;
		s.p.y = 20;
		s.draw();
	}

}
class Point2 {
	int x;
	int y;
}

class Shape{
	Point2 p = new Point2();
	
	void draw() {
		System.out.println("x좌표 : " + p.x);
		System.out.println("y좌표 : " + p.y);
	}
}

