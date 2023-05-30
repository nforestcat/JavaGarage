package example;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		for (int i = 1; i <= 100; i++) {
			a += i;
		}
		System.out.println("1~100까지의 합");
		System.out.println("sum="+a);
		a=0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				a += i;
			}
		}
		System.out.println("1~100까지의 홀수합");
		System.out.println("sum="+a);
	}

}
