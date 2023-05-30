package access;

public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		p.y = 10;
		p.print();
		//p.x = 10;
		//안됨
		//x가 private이라서 PointMain 클래스에서는 사용할 수 없음
		p.setX(10);
	}

}
class Point{
	private int x;
	int y; 	//default 접근 제어 지정자
			//같은 패키지안에서 사용 가능
	public void setX(int x) {
		this.x = x;
	}
	int getX() {	//접근제어 범주가 같은 패키지내에서 이므로
					//사용할 수 있다.
		return x;
	}
	void print() {
		System.out.println(x);
		System.out.println(y);
	}
}