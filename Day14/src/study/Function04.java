package study;

public class Function04 {

	public static void main(String[] args) {
		
		int c = 0;	//not used
		int x = 10, y = 20, z = 0;
		z = add(x, y);
		System.out.println(z);
	}
	public static int add(int a , int b) {
		int c = 0;
		c = a + b;
		return c;
	}
}
