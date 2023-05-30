package yy;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D p3 = new Point3D();
		System.out.println(p3.x);
		System.out.println(p3.y);
		System.out.println(p3.z);
	}

}
class Point{
	int x = 10;
	int y = 20;
	Point(){
		System.out.println("Point()생성자");
		x = 100;
		y = 200;
	}
}

class Point3D extends Point{
	int z = 30;
	Point3D(){
		System.out.println("Point3D()의 생성자");
		x = 1000;
		y = 2000;
		z = 300;
	}
}
