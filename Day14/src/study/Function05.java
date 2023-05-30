package study;

public class Function05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 5;
		System.out.println("호출 전 --");
		System.out.println(a);
		System.out.println(b);
		
		addOne(a, b);
		
		System.out.println("호출 후 --");
		System.out.println(a);
		System.out.println(b);
		
		addTwo(a);
		
	}
	public static void addOne(int x , int y) {
		x++;
		y++;
		System.out.println("addOne 함수");
		System.out.println(x);
		System.out.println(y);
	}
	public static int addTwo(int x) {
		x++;
		return x;
	}

}
