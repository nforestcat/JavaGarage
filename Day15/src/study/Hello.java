package study;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point[] arr = new Point[5];
		
		int i = 0;
		for (i = 0; i < 5; i++) {
			arr[i] = new Point();
			arr[i].x = i + 1;
			arr[i].y = i + 1;
		}
		
		for (i = 0; i < 5; i++) {
			System.out.println(arr[i].x);
			System.out.println(arr[i].y);
			System.out.println("---");
		}
	}

}
class Point{
	int x;
	int y;
}