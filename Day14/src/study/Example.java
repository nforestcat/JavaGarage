package study;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		int[] a1 = {1, 2, 3};
		int[] a2 = {4, 5, 6};
		x = sum(a1);
		y = sum(a2);
		
		System.out.println(x);
		System.out.println(y);
	}
	public static int sum(int[] arr) {
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			a += arr[i];
		}
		return a;
	}

}
